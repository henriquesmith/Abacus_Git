/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entites.Esforcos;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.lines.SeriesLines;
import org.knowm.xchart.style.markers.SeriesMarkers;

/**
 *
 * @author Administrador
 */
public class grafico {

    XChartPanel panel;
    XYSeries serie;
    XYChart chart;

    public XChartPanel grafico(String Mx, String My, String title) {
        chart = new XYChartBuilder().width(590).height(590).theme(Styler.ChartTheme.Matlab).title(title).xAxisTitle(Mx).yAxisTitle(My).build();
        chart.getStyler().setPlotBackgroundColor(ChartColor.getAWTColor(ChartColor.WHITE));
        chart.getStyler().setPlotGridLinesColor(new Color(0, 0, 0));
        chart.getStyler().setChartBackgroundColor(Color.WHITE);
        chart.getStyler().setLegendVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.OutsideE);
        chart.getStyler().setChartFontColor(Color.black);
        chart.getStyler().setChartTitleBoxBackgroundColor(Color.white);
        chart.getStyler().setChartTitleBoxVisible(false);
        chart.getStyler().setChartTitleBoxBorderColor(Color.black);
        chart.getStyler().setPlotGridLinesVisible(true);
        chart.getStyler().setAxisTickMarkLength(5);
        chart.getStyler().setPlotMargin(0);
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        chart.getStyler().setLegendVisible(true);
        chart.getStyler().setToolTipsEnabled(true);
        chart.getStyler().setToolTipsAlwaysVisible(false);
        chart.getStyler().setPlotContentSize(0.9);
        panel = new XChartPanel(chart);
        panel.setAutoscrolls(true);
        return panel;
    }

    public void setEspacamento(double p) {
        chart.getStyler().setYAxisTickMarkSpacingHint((int) p);
        chart.getStyler().setXAxisTickMarkSpacingHint((int) p);

    }

    public void setPoint(List<Float> Mx, List<Float> My) {
        serie = chart.addSeries("Esforcos solicitantes", My, My);
        serie.setMarkerColor(Color.RED);
        serie.setMarker(SeriesMarkers.DIAMOND);
        serie.setLineStyle(SeriesLines.NONE);
        panel.revalidate();
        panel.repaint();
    }

    public void setSeriesMap(Map<Float, List<Esforcos>> map, float ac, float hx, float hy, float sigma, double tetaD) {
        Set<Float> keys = map.keySet();
        for (Float k : keys) {
            List<Esforcos> es = map.get(k);
            List<Float> Mx = new ArrayList<>();
            List<Float> My = new ArrayList<>();
            List<Float> N = new ArrayList<>();
            for (int i = 0; i < es.size(); i++) {
                float mx = es.get(i).getMxk();
                float my = es.get(i).getMyk();
                float nd = es.get(i).getNk();
                mx = (((mx * 100)) / (ac * hx * sigma));
                my = (((my * 100)) / (ac * hy * sigma));
                nd = ((nd) / (ac * sigma));
                Mx.add(mx);
                My.add(my);
                N.add(nd);
            }
            if (tetaD != 90 && tetaD != 0) {
                serie = chart.addSeries("ω = " + String.format("%.2f", k), Mx, My);
                chart.setXAxisTitle("μx");
                chart.setYAxisTitle("μy");
                
            }
            if (tetaD == 90) {
                serie = chart.addSeries("ω = " + String.format("%.2f", k), N, My);
                chart.setXAxisTitle("v");
                chart.setYAxisTitle("μ");
            }
            if (tetaD == 0) {
                serie = chart.addSeries("ω = " + String.format("%.2f", k), N, Mx);
                chart.setXAxisTitle("v");
                chart.setYAxisTitle("μ");
            }
            serie.setMarker(SeriesMarkers.NONE);
            serie.setLineStyle(SeriesLines.SOLID);
            serie.setXYSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
            serie.setLabel("ω = " + String.format("%.2f", k));

        }
        panel.revalidate();
        panel.repaint();
    }

    public void setAxis() {
        double[] xData_xAxis = new double[]{serie.getXMin(), 0, serie.getXMax()};

        double[] yData_xAxis = new double[]{0, 0, 0};

        double[] xData_yAxis = new double[]{0, 0, 0};

        double[] yData_yAxis = new double[]{serie.getYMin(), 0, serie.getYMax()};

        XYSeries xaS = chart.addSeries("Axis X", xData_xAxis, yData_xAxis);
        xaS.setMarker(SeriesMarkers.NONE);
        xaS.setLineColor(Color.black);
        XYSeries yaS = chart.addSeries("Axis Y", xData_yAxis, yData_yAxis);
        yaS.setMarker(SeriesMarkers.NONE);
        yaS.setLineColor(Color.black);
        panel.revalidate();

    }

    public void setSeries(List<Float> Mx, List<Float> My, float taxa) {

        serie = chart.addSeries("ω = " + String.format("%.2f", taxa), Mx, My);
        serie.setMarker(SeriesMarkers.NONE);
        serie.setLineStyle(SeriesLines.SOLID);
        serie.setXYSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        serie.setLabel("ω = " + String.format("%.2f", taxa));
        panel.revalidate();
        panel.repaint();

    }

}
