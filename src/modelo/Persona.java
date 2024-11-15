/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    // 1. Declarar los atributos de tipo privado
    private String signo;
    private Date fechaNacimiento;

    // 2. Método constructor
    public Persona() {
    }

    // 3. Métodos de encapsulamiento
    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // 4. Método de regla de negocio con compareToIgnoreCase
    public String determinarHoroscopo() {
        if (signo == null) {
            return "Signo no ingresado. Por favor, proporciona un signo válido.";
        }

        if (signo.compareToIgnoreCase("Aries") == 0) {
            return "Hoy será un mal día.";
        } else if (signo.compareToIgnoreCase("Tauro") == 0) {
            return "Hoy disfrutarás de momentos de tranquilidad y estabilidad.";
        } else if (signo.compareToIgnoreCase("Géminis") == 0) {
            return "La comunicación será clave en el día de hoy. Escucha y sé escuchado.";
        } else if (signo.compareToIgnoreCase("Cáncer") == 0) {
            return "Un día perfecto para pasar tiempo con la familia y fortalecer lazos.";
        } else if (signo.compareToIgnoreCase("Leo") == 0) {
            return "Tu carisma estará en su máximo esplendor. Aprovecha para liderar proyectos.";
        } else if (signo.compareToIgnoreCase("Virgo") == 0) {
            return "La organización será tu mejor aliada hoy. Planea tus actividades con cuidado.";
        } else if (signo.compareToIgnoreCase("Libra") == 0) {
            return "Busca el equilibrio entre tus responsabilidades y tu vida personal.";
        } else if (signo.compareToIgnoreCase("Escorpio") == 0) {
            return "Tus emociones estarán intensas hoy. Canalízalas en algo positivo.";
        } else if (signo.compareToIgnoreCase("Sagitario") == 0) {
            return "Un buen día para explorar nuevas ideas o aventurarte en algo diferente.";
        } else if (signo.compareToIgnoreCase("Capricornio") == 0) {
            return "La perseverancia te llevará al éxito en tus metas profesionales.";
        } else if (signo.compareToIgnoreCase("Acuario") == 0) {
            return "Tu creatividad será la protagonista hoy. No tengas miedo de innovar.";
        } else if (signo.compareToIgnoreCase("Piscis") == 0) {
            return "Escucha tu intuición hoy, puede guiarte hacia decisiones importantes.";
        } else {
            return "Signo no reconocido. Por favor, asegúrate de ingresar un signo válido.";
        }
    }
}


