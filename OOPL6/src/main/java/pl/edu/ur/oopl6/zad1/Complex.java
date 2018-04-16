/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad1;

/**
 *
 * @author ACER
 */
public class Complex {
  
    
    public static double Moduł(double r, double u){
       return  Math.sqrt(Math.pow(r,2)+Math.pow(u,2));
    }

public static String Sprężenie(double r, double u){
      String a="Wartość sprężona wynosi "+r+"-"+u+"i";
    return a;
}

    public static double sin(double r, double u) {
         if (Moduł(r, u)==0){
        return 0;
        }
        double sin = u / Moduł(r, u);
        double cos = (r / Moduł(r, u));
        double a;
        a=Math.toRadians(Math.asin(sin));   
    return a;          
    }
       public static String Wykładnicza(double r, double u) {
           String a="z="+Moduł(r,u)+"*e^("+sin(r,u)+"*PI*i)";
           return a;
       }

 public static String algebraiczna(double r, double u) {
       String a="Wartość sprężona wynosi "+r+"+"+u+"i";
       return a;
       }
 public static String dodawanie_alg(double r,double u,double r1, double u2){
     String a = "z1+z2="+(r+r1)+"+"+(u+u2)+"i";
     return a;
 }
 public static double dodawanie_wyk(double Mod1,double Kat,double Mod2, double Kat2){
     Math.toRadians(Kat);
     Math.toRadians(Kat2);
     double Re = Mod1 * Math.cos(Kat) + Mod2 * Math.cos(Kat2);
        double Imr = Mod1 * Math.sin(Kat) + Mod2 * Math.sin(Kat2);
        return sin(Re,Imr);
 }
 public static String odejmowanie(double r,double u,double r1, double u2){
     String a = "z1-z2="+(r-r1)+"+"+(u-u2)+"i";
     return a;
 }
  public static String mnożenie(double r,double u,double r1, double u2){
     String a = "z1*z2="+(r*r1-u2*u)+"+"+(r*u+r1*u2)+"i";
     return a;
 }
   public static String dzielenie(double r,double u,double r1, double u2){
     String a = "z1/z2="+((r*r1-u2*u)/Math.pow(r1, 2)*Math.pow(u2, 2))+"+"+((r*u+r1*u2)/Math.pow(r1, 2)*Math.pow(u2, 2))+"i";
     return a;
 }
     public static String dzielenie_wyk(double Mod1,double Kat,double Mod2, double Kat2){
     double m=Mod1/Mod2;
     double k=Kat-Kat2;
     String a= "wynik dzielenia z1/z2 wynosi "+m+"e^"+k+"i";
     return a;
 }
        public static String trzy_postacie(double r,double u){
     
     String a= "algebraiczna "+(r+u)+"i,   trygonometryczna z1="+Moduł(r,u)+"*(cos("+sin(r,u)+"*PI)+sin("+sin(r,u)+"*PI*i)   wykładnicza  z= "+Moduł(r,u)+"e^"+sin(r,u)+"i";
     return a;
 }
}