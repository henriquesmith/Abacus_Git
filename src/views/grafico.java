/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entites.Esforcos;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.internal.chartpart.SelectionZoom;
import org.knowm.xchart.internal.chartpart.components.ChartImage;
import org.knowm.xchart.internal.chartpart.components.ChartLine;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.lines.SeriesLines;
import org.knowm.xchart.style.markers.SeriesMarkers;

/**
 *
 * @author Administrador
 */
public class grafico {
    private XChartPanel panel;
    private XYSeries serie;
    XYChart chart;
    SelectionZoom zm;
    ChartImage im;
    ChartLine cl;
    ChartLine cl2;
    

    public XChartPanel grafico(String Mx, String My, String title) {
        chart = new XYChartBuilder().width(595).height(595).theme(Styler.ChartTheme.Matlab).title(title).xAxisTitle(Mx).yAxisTitle(My).build();
        chart.getStyler().setPlotBackgroundColor(ChartColor.getAWTColor(ChartColor.WHITE));
        chart.getStyler().setPlotGridLinesColor(new Color(0, 0, 0));
        chart.getStyler().setChartBackgroundColor(Color.WHITE);
        chart.getStyler().setLegendVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.OutsideE);
        chart.getStyler().setChartFontColor(Color.black);
        chart.getStyler().setChartTitleBoxBackgroundColor(Color.white);
        chart.getStyler().setChartTitleBoxVisible(false);
        chart.getStyler().setChartTitleBoxBorderColor(Color.black);
        chart.getStyler().setAxisTickMarkLength(5);
        chart.getStyler().setPlotMargin(0);
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        chart.getStyler().setLegendVisible(true);
        chart.getStyler().setToolTipsEnabled(true);
        chart.getStyler().setToolTipsAlwaysVisible(false);
        panel = new XChartPanel(chart);
        panel.setBackground(Color.white);
        zm = new SelectionZoom();
        zm.init(getPanel());
        
        
        getPanel().setExportAsString("Exportar");
        getPanel().setPrintString("Exportar para PDF");
        getPanel().setSaveAsString("Salvar como imagem");
        getPanel().setAutoscrolls(true);
        return getPanel();
    }
    public void setGrid(boolean ativar){
         chart.getStyler().setPlotGridLinesVisible(ativar);
    }
    public void setCL(int largura){
        int width = largura;
            BasicStroke stroke =
                new BasicStroke(
                    width,
                    BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_BEVEL,
                    10.0f,
                    new float[] {3.0f, 0.0f},
                    0.0f);
            cl = new ChartLine(0,false,false);
            cl.setColor(Color.BLACK);
            cl.setStroke(stroke);
            cl.init(panel);
             cl2 = new ChartLine(0 ,true,false);
             cl2.setColor(Color.black);
             cl2.setStroke(stroke);
            
            
            cl2.init(panel);
           
    }
    public void addSecao(Image pnl,double x, double y,boolean value){
        im = new ChartImage(pnl,x,y,value);  
        im.init(this.panel);
        getPanel().revalidate();
        getPanel().invalidate();
        getPanel().repaint();
       
        
    }
    public void setPlot(double value){
    chart.getStyler().setPlotContentSize(value);
    }
    public void setEspacamento(double p) {
        chart.getStyler().setYAxisTickMarkSpacingHint((int) p);
        chart.getStyler().setXAxisTickMarkSpacingHint((int) p);

    }

    public void setPoint(List<Float> Mx, List<Float> My) {
        serie = chart.addSeries("Esforcos solicitantes", My, My);
        getSerie().setMarkerColor(Color.RED);
        getSerie().setMarker(SeriesMarkers.DIAMOND);
        getSerie().setLineStyle(SeriesLines.NONE);
        getPanel().revalidate();
        getPanel().repaint();
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
            getSerie().setMarker(SeriesMarkers.NONE);
            getSerie().setLineStyle(SeriesLines.SOLID);
            getSerie().setXYSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
            getSerie().setLabel("ω = " + String.format("%.2f", k));


        }
        getPanel().revalidate();
        getPanel().repaint();
    }

    public void setSeries(List<Float> Mx, List<Float> My, Float taxa) {

        serie = chart.addSeries("ω = " + String.format("%.2f", taxa), Mx, My);
        getSerie().setMarker(SeriesMarkers.NONE);
        getSerie().setLineStyle(SeriesLines.SOLID);
        getSerie().setXYSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        getSerie().setLabel("ω = " + String.format("%.2f", taxa));
        getPanel().revalidate();
        getPanel().repaint();

    }

    /**
     * @return the panel
     */
    public XChartPanel getPanel() {
        return panel;
    }

    /**
     * @return the serie
     */
    public XYSeries getSerie() {
        return serie;
    }

}
