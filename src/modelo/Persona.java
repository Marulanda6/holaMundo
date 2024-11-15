/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author kirlok6
 */
public class Persona {
    //Declarar los atributos de tipo privados 
    private String signo;
    private Date fechaNacimiento;
    
    //2.-METODO CONSTRUCTOR

    public Persona() {
    }
    
    //3.-METODOS DE ENCAPSULAMIENTO
    
    //METODO DE RETORNO.-DEVUElVe unA CADENA

    public String getSigno() {
        return signo;
    }
    //METODO DE NO RETORNO.-NO ALMACENA INFORMACION
    public void setSigno(String signo) {
        //THIS.-ES UN PUNTERO QUE HACE REFERENCIA A LA CLASE 
        //EN LA QUE ESTAMOS TRABAJANDO Y ACCEDE DIRECTAMENTE 
        //A ATRIBUTOS Y METODOS 
        this.signo = signo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    } 
    //4.-METODO DE REGLA DE NEGOCIO
    public String derminarHoroscopo(){
        if("Aries".equals(signo)){
            return "Hoy sera un mal dia";
        }
    
            return"";
     }
}

