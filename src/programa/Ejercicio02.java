package programa;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Declarar variables
        double compra1, compra2, compra3, compra4;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingresar valor de la compra 1: ");
        compra1 = lectura.nextDouble();
        System.out.print("Ingresar valor de la compra 2: ");
        compra2 = lectura.nextDouble();
        System.out.print("Ingresar valor de la compra 3: ");
        compra3 = lectura.nextDouble();
        System.out.print("Ingresar valor de la compra 4: ");
        compra4 = lectura.nextDouble();
        
        // Crear el objeto de la clase RegistroCompras
        RegistroCompras objRegCompras = new RegistroCompras(compra1, compra2, compra3, compra4);
        
        // Mostrar total, promedio, mayor y menor valor de las compras
        System.out.println("El total de las compras es: " + objRegCompras.total());
        System.out.println("El promedio de las compras es: " + objRegCompras.promedio());
        System.out.println("La compra mayor fue de: " + objRegCompras.mayor());
        System.out.println("La compra menor fue de: " + objRegCompras.menor());
    }
}