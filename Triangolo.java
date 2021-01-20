/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;
import java.lang.Math;
/**
 *
 * @author informatica
 */
public class Triangolo {
    private double latoA;
    private double latoB;
    private double latoc;

    
    
    public Triangolo(double a, double b, double c){
        latoA = a;
        latoB = b;
        latoc = c;
    }

    public double getLatoA() {
        return latoA;
    }

    public void setLatoA(double latoA) {
        this.latoA = latoA;
    }

    public double getLatoB() {
        return latoB;
    }

    public void setLatoB(double latoB) {
        this.latoB = latoB;
    }

    public double getLatoc() {
        return latoc;
    }

    public void setLatoc(double latoc) {
        this.latoc = latoc;
    }
    
    /*public String classificaT(){
        
    }*/
    
    public double perimetro(){
        return latoA + latoB + latoc;
    }
    
    public double area(){
        double p = perimetro()/2;
        double a = p*(p-latoA)*(p-latoB)*(p-latoc);
        return Math.sqrt(a);
    }
    
    public String testTipo(){
        if(latoA == latoB && latoB == latoc){
            return "equilatero";
        }
        
        if(latoA == latoB && latoA != latoc || latoA == latoc && latoA != latoB || latoB == latoc && latoB != latoA){
            return "isoscele";
        }
        
        if(latoA != latoB && latoA != latoc){
            return "scaleno";
        }
        
        double max = 0;
        if(latoA > max){
            max = latoA;
        }
        if(latoB > max){
            max = latoB;
        }
        if(latoc > max){
            max = latoc;
        }
        
        
        return null;
        
    }
}
