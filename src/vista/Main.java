/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
    // Método principal que llama al intérprete de Java
    public static void main(String[] args) {
        // Ejercicio 1: Determinar el horóscopo mediante el signo zodiacal
        String signoZodiacal = "Leo";
        if (signoZodiacal.equals("Aries")) {
            System.out.println("EL DÍA DE HOY TE VAS A MORIR DEL HAMBRE!!!");
        } else if (signoZodiacal.equals("Leo")) {
            System.out.println("HOY SERÁS LA PERSONA MÁS FELIZ DEL MUNDO");
        } else if (signoZodiacal.equals("Cáncer")) {
            System.out.println("TENDRÁS UN DÍA CAÓTICO PERO ES POSIBLE QUE ENCUENTRES DINERO");
        } else {
            System.out.println("Ingrese un signo válido");
        }

        // Probar una clase: Crear un objeto de tipo Persona
        Persona a = new Persona();
        a.setSigno("Escorpio");
        // Imprimir el horóscopo determinado por el método en Persona
        System.out.println(a.determinarHoroscopo());

        // Instanciar un objeto de tipo Scanner
        Scanner es = new Scanner(System.in);
        // Crear un objeto de tipo Persona
        Persona b = new Persona();

        // Solicitar el signo zodiacal al usuario
        System.out.println("Ingrese su signo zodiacal:");
        b.setSigno(es.nextLine());
        // Imprimir el horóscopo determinado por el método en Persona
        System.out.println(b.determinarHoroscopo());

        // Cerrar el Scanner
        es.close();
    }
}


