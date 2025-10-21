package com.example;

public class Empresa {
   // Actividad 3
    public void mostrarInformacion(Empleado empleado) {
        System.out.println(empleado.mostrarDatos());
    }
    // Actividad 4
    public void ordenarPorSueldo(Empleado[] empleados) {
        if (empleados == null || empleados.length < 2) {
            return;
        }

        for (int i = 0; i < empleados.length - 1; i++){
            for (int j = 0; j < empleados.length - 1 - i; j++){
                
                if(empleados[j].getSueldo() < empleados[j + 1].getSueldo()) {
                    Empleado aux = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = aux;
                }

            }
        }
    }
    // Actividad 5
    public Empleado buscarPorNombre(Empleado[] empleados, String nombreBuscado) {
    if (empleados == null || nombreBuscado == null) {
        return null;
    }
    for (Empleado emp : empleados) {
        if (emp.getNombre().equalsIgnoreCase(nombreBuscado)) {
            return emp;
        }
    }
    return null;
   }

    
    // Actividad 4 
    public static void empresa(String[] args) {
        Empresa miEmpresa = new Empresa();

        Empleado[] listaEmpleados = new Empleado[2];
        listaEmpleados[0]  = new Gerente("Leonel Messi", 80000.0, "Finanzas");
        listaEmpleados[1]  = new Desarrollador("Marcos Gonzalez", 55000.0, "Java");
        
        System.out.println("--- ANTES DE ORDENAR ---");
        for (Empleado emp : listaEmpleados) {
            miEmpresa.mostrarInformacion(emp);
        }
        miEmpresa.ordenarPorSueldo(listaEmpleados);

        System.out.println("\n--- DESPUÉS DE ORDENAR (Mayor a Menor) ---");
        for (Empleado emp : listaEmpleados) {
             miEmpresa.mostrarInformacion(emp);
        }
        
        // Actividad 5: 
        System.out.println("--- DEMOSTRACIÓN DE BÚSQUEDA ---");
        
        String nombreABuscar1 = "ana torres";
        System.out.println("Buscando a: '" + nombreABuscar1 + "'...");
        
        Empleado resultado1 = miEmpresa.buscarPorNombre(listaEmpleados, nombreABuscar1);

        if (resultado1 != null) {
            System.out.println("Encontrado: " + resultado1.mostrarDatos());
        } else {
            System.out.println("Resultado: Empleado no existe.");
        }

        System.out.println("--------------------");
       
    }
    
}
