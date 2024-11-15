/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Persona;

/**
 *
 * @author kirlok6
 */
public class Main {
    //llama al interprete de java
    public static void main(String[] args) {
                 System.out.println("HOLA MUNDO");
    //Ejercicio 1 determinar el horosco  mediante el signo sodiacal 
   String signoZodiacal="Leo";
        if(signoZodiacal=="Aries"){
            System.out.println("EL DÍA DE HOY TE VAS A MORIR DEL HAMBRE!!!");
        }else if (signoZodiacal=="Leo") {
            System.out.println("HOY SERÁS LA PERSONA MÁS FELIZ DEL MUNDO ");
        }else if ( signoZodiacal=="Cáncer") {
            System.out.println("TENDRÁS UN DÍA CAÓTICO PERO ES POSIBLE QUE ENCUENTRES DINERO");
        }else{
            System.out.println("Ingrese un signo válido");}
    

        //PROBAR UNA CLASE
        //DECLARAR INSTANCIAS UN OBJETOS
        //NombreCLase  nombreObjeto(variable)=new NombreCLass();
       Persona a=new Persona();
       a.setSigno("LEO");
        System.out.println(a.derminarHoroscopo());
     
    }
}              

    
   

    

