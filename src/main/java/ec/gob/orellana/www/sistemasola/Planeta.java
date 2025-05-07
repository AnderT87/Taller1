/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemasola;

/**
 *
 * @author SO-LAB-PC6
 */
public class Planeta {

    //atributos
    public String nombre;
    public int cantidadSatelites;
    public double masa;
    public double volumen;
    public double diametro;
    public double distanciaSol;
    public TipoPlaneta tipoPlaneta;

    //metodos
    public void imprimirplaneta(){
        System.out.println("Nombre:" +nombre);
        System.out.println("Cantidad de Satelites:"+cantidadSatelites);
        System.out.println("La masa del plnaeta:"+masa);
        System.out.println("Su volumen es:"+volumen);
        System.out.println("Su diametro es:"+diametro);
        System.out.println("Distancia al sol:"+distanciaSol);
        System.out.println("Tipo planeta:"+tipoPlaneta);
        return ;
    } 
    public double calcularDensidad(){
        return masa/volumen;
    }

    public boolean exterior(){
        return true ;
    }
    public void imprimerDensidadExterior(){
        return ;
    }
}





