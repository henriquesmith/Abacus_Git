/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entites.Vertice;
import entites.barra;
import entites.secaoTransversal;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.JPanel;
import jdk.nashorn.internal.objects.Global;

/**
 *
 * @author Administrador
 */
public final class miniSecao extends JPanel {

    private Vertice centro = null;
    private BufferedImage BI;
    secaoTransversal sec;
    List<Vertice> vertices;
    List<barra> bars;
    Graphics gs;
    private double zoom = 1;
    String tal;
    private Image im;

    public miniSecao(secaoTransversal sec) {
        this.sec = sec;
        this.vertices = sec.getVertices();
        this.bars = sec.getBars().getBarras();
        this.repaint();
        parametrosgeom();
        setBackground(Color.white);
        setOpaque(true);
        this.repaint();

    }

    private void parametrosgeom() {
        tal = String.format("%.2f", (sec.getH() - sec.getD()) / (sec.getH()));

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

        return new Dimension(125, 125);
    }

    private void drawLines(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 1; i < vertices.size(); i++) {
            Vertice v1 = vertices.get(i - 1);
            Vertice v2 = vertices.get(i);
            g2.draw(new Line2D.Float((float) (zoom * v1.getX()), (float) (zoom * -v1.getY()), (float) (zoom * v2.getX()), (float) (zoom * -v2.getY())));
        }
        Vertice ini = vertices.get(vertices.size() - 1);
        Vertice fim = vertices.get(0);
        g2.draw(new Line2D.Float((float) (zoom * ini.getX()), (float) (zoom * -ini.getY()), (float) (zoom * fim.getX()), (float) (zoom * -fim.getY())));
    }

    private void drawPoint(Graphics g, float x, float y) {
        Graphics2D g2 = (Graphics2D) g;
        Shape circle = new Arc2D.Float((float) (zoom * x) - 2, (float) (zoom * y * (-1)) - 2, 4, 4, 0, 360, Arc2D.CHORD);
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
        g2.scale(zoom, zoom);
        g.translate(((int) getCentro().getX() - getWidth() / 2) * (-1), getHeight() - ((int) getCentro().getY() - getHeight() / 2) * (-1));
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
        int w = this.getWidth();
        int h = this.getHeight();
        BI = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gd2 = (Graphics2D) BI.getGraphics();
        gd2.setColor(Color.WHITE);
        gd2.drawRect(0, 0, w, h);
        gd2.setComposite(AlphaComposite.Clear);
        gd2.fillRect(0, 0, w, h);
        gd2.translate(((int) getCentro().getX() - getWidth() / 2) * (-1), getHeight() - ((int) getCentro().getY() - getHeight() / 2) * (-1));
        
        gd2.setComposite(AlphaComposite.Src);
        gd2.setColor(Color.BLACK);
        gd2.scale(1.0, 1.0);
        drawLines(gd2);
        for (barra b : bars) {
            drawPoint(gd2, b.getX(), b.getY());
        }
        gd2.setFont(new Font("Tahoma", Font.BOLD, 12));
        gd2.drawString("δ = " + tal, vertices.get(0).getX() -15, vertices.get(vertices.size() -1).getY() - 10);
        gd2.dispose();
        

        return BI;
    }

    /**
     * @return the BI
     */
    public BufferedImage getBI() {
        return BI;
    }

    /**
     * @return the centro
     */
    public Vertice getCentro() {
        return centro;
    }

    /**
     * @return the zoom
     */
    public double getZoom() {
        return zoom;
    }

    /**
     * @return the im
     */
    public Image getIm() {
        return im;
    }

}
