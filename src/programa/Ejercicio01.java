package programa;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Declarar variables
        double ingresoMensual, otrosIngresos, gastosMensuales;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingresar ingreso mensual: ");
        ingresoMensual = lectura.nextDouble();
        System.out.print("Ingresar otros ingresos: ");
        otrosIngresos = lectura.nextDouble();
        System.out.print("Ingresar gastos mensuales: ");
        gastosMensuales = lectura.nextDouble();
        
        // Crear el objeto de la clase RegistroFinanzas
        RegistroFinanzas objRegFinanzas = new RegistroFinanzas(ingresoMensual, otrosIngresos, gastosMensuales);
        
        // Calcular ahorro mensual, semestral y anual proyectado
        double ahorroMensual = objRegFinanzas.calcularAhorroMensual();
        double ahorroSemestral = objRegFinanzas.calcularAhorroSemestral();
        double ahorroAnual = objRegFinanzas.calcularAhorroAnual();
        
        // Salida de datos
        System.out.println("El ahorro mensual proyectado es: " + ahorroMensual);
        System.out.println("El ahorro semestral proyectado es: " + ahorroSemestral);
        System.out.println("El ahorro anual proyectado es: " + ahorroAnual);
    }
}