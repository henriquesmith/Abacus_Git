/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.internal.chartpart.ChartPart;

/**
 *
 * @author Administrador
 */
public class plotSecao extends JPanel {

    XChartPanel panel;
    XYSeries serie;
    XYChart chart;
    ChartPart cp;

    public plotSecao() {
        setBackground(Color.white);

    }

    public Dimension getPreferredSizee() {
        return new Dimension(100, 100);
    }

}
