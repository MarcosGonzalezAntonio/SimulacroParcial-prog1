package com.example;

public class Desarrollador extends Empleado {
   
    private String lenguaje;

    public Desarrollador(String nombre, double sueldo, String lenguaje) {
        super(nombre, sueldo);
        this.lenguaje = lenguaje;
    }
    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    @Override
    public String mostrarDatos() {
        return "Desarrolador " + getNombre() +
               ", lenguaje: " + this.lenguaje +
               ", sueldo: " + getSueldo();
    }
    
}