package com.example.demo;


public class Persona {
    String Nombre;
    Integer Edad;
    String Provincia;

    /**
     * Constructor que crea instancias con los atributos de nombre, edad y provincia
     * @param nombreDePersona
     * @param edadDePersona
     * @param provinciaDePersona
     */
    Persona(String nombreDePersona, Integer edadDePersona, String provinciaDePersona)
    {
        Nombre = nombreDePersona;
        Edad = edadDePersona;
        Provincia = provinciaDePersona;
    }
}