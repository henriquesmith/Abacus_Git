/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author Administrador
 */
public class Esforcos {

    private float Mxk = 0f;
    private float Myk = 0f;
    private float Nk = 0f;
    private float ex;
    private float ey;
    private float Md = 0f;
    private double tetaD = 0; // graus

    public Esforcos(float mx, float my, float nk) {
        this.Mxk = mx;
        this.Myk = my;
        this.Nk = nk;
        gerarExcentricidades();
        gerarMD();
        

    }
//em graus

    private void gerarTeta() {
        if (this.Md != 0) {
            double teta;
            teta = Math.atan2(Myk, Mxk);
            // transformando em graus
            this.tetaD = (teta * (180 / Math.PI));
           // System.out.println("Teta: "+ tetaD);

        }
    }
// kN.m

    private void gerarMD() {
        float aux;
        float md;
        aux = (float) ((Math.pow(Mxk, 2)) + (Math.pow(Myk, 2)));
        md = (float) Math.sqrt((double) aux);
        this.Md = md;
        gerarTeta();

    }
// in meters

    private void gerarExcentricidades() {
        this.ex = (Mxk / Nk);
        this.ey = (Myk / Nk);
    }

    /**
     * @return the Mxk
     */
    public float getMxk() {
        return Mxk;
    }

    /**
     * @return the Myk
     */
    public float getMyk() {
        return Myk;
    }

    /**
     * @return the Nk
     */
    public float getNk() {
        return Nk;
    }

    /**
     * @return the ex
     */
    public float getEx() {
        return ex;
    }

    /**
     * @return the ey
     */
    public float getEy() {
        return ey;
    }

    /**
     * @return the Md
     */
    public float getMd() {
        return Md;
    }

    /**
     * @return the tetaD
     */
    public double getTetaD() {
        return tetaD;
    }

}
