/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.sun.prism.BasicStroke;
import entites.Vertice;
import entites.barra;
import entites.secaoTransversal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import jdk.nashorn.internal.objects.Global;

/**
 *
 * @author Administrador
 */
public final class miniSecao extends JPanel {

    Vertice centro = null;
    private BufferedImage BI;
    secaoTransversal sec;
    List<Vertice> vertices;
    List<barra> bars;
    Graphics gs;

    public miniSecao(secaoTransversal sec) {
        this.sec = sec;
        this.vertices = sec.getVertices();
        this.bars = sec.getBars().getBarras();
        setBackground(Color.WHITE);
        setOpaque(true);

    }

    private void updateCentro() {
        float xMin = (float) Global.Infinity;
        float xMax = (float) -Global.Infinity;
        float yMin = (float) Global.Infinity;
        float yMax = (float) -Global.Infinity;

        for (Vertice v : vertices) {
            if (v.getX() < xMin) {
                xMin = v.getX();
            }
            if (v.getX() > xMax) {
                xMax = v.getX();
            }
            if (v.getY() < yMin) {
                yMin = v.getY();
            }
            if (v.getY() > yMax) {
                yMax = v.getY();
            }
        }

        centro = new Vertice(xMin + (xMax - xMin) / 2, yMin + (yMax - yMin) / 2);
    }

    @Override
    public Dimension getPreferredSize() {

        return new Dimension(150, 150);
    }

    private void drawLines(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 1; i < vertices.size(); i++) {
            Vertice v1 = vertices.get(i - 1);
            Vertice v2 = vertices.get(i);
            g2.draw(new Line2D.Float(v1.getX(), -v1.getY(), v2.getX(), -v2.getY()));
        }
        Vertice ini = vertices.get(vertices.size() - 1);
        Vertice fim = vertices.get(0);
        g2.draw(new Line2D.Float(ini.getX(), -ini.getY(), fim.getX(), -fim.getY()));
    }

    private void drawPoint(Graphics g, float x, float y) {
        Graphics2D g2 = (Graphics2D) g;
        Shape circle = new Arc2D.Float((float) (x) - 1, (float) (y * (-1)) - 1, 2, 2, 0, 360, Arc2D.CHORD);
        g2.fill(circle);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int width = 2;
        java.awt.BasicStroke stroke
                = new java.awt.BasicStroke(
                        width,
                        java.awt.BasicStroke.CAP_BUTT,
                        java.awt.BasicStroke.JOIN_BEVEL,
                        10.0f,
                        new float[]{3.0f, 0.0f},
                        0.0f);
        g2.setStroke(stroke);
        updateCentro();
        g2.scale(1.0, 1.0);
        g.translate(((int) centro.getX() - getWidth() / 2) * (-1), getHeight() - ((int) centro.getY() - getHeight() / 2) * (-1));
        g2.setColor(Color.BLACK);

        drawLines(g2);
        for (Vertice v : vertices) {

            drawPoint(g2, v.getX(), v.getY());
        }
        for (barra b : bars) {
            drawPoint(g2, b.getX(), b.getY());
        }

    }

    public BufferedImage setarImagem() {
        this.validate();
        this.repaint();
        BI = new BufferedImage(this.getPreferredSize().getSize().width, this.getPreferredSize().getSize().height, BufferedImage.TYPE_INT_RGB);
        System.out.println("W: " + this.getPreferredSize().getSize().width + " H: " + this.getPreferredSize().getSize().height);
        this.revalidate();
        Graphics2D g3 = BI.createGraphics();
        this.print(g3);
        this.repaint();

        this.revalidate();
        return BI;
    }

    /**
     * @return the BI
     */
    public BufferedImage getBI() {
        return BI;
    }

}
