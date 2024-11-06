package programa;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        // Declarar variables
        double sueldo1, sueldo2, sueldo3, sueldo4;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingresar sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        System.out.print("Ingresar sueldo 2: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Ingresar sueldo 3: ");
        sueldo3 = lectura.nextDouble();
        System.out.print("Ingresar sueldo 4: ");
        sueldo4 = lectura.nextDouble();
        
        // Crear el objeto de la clase RegistroSueldo
        RegistroSueldo objRegSueldo = new RegistroSueldo(sueldo1, sueldo2, sueldo3, sueldo4);
        
        // Salida de datos
        System.out.println("El total de sueldos es: " + objRegSueldo.total());
        System.out.println("El promedio de sueldos es: " + objRegSueldo.promedio());
        System.out.println("El sueldo mayor es: " + objRegSueldo.mayor());
        System.out.println("El sueldo menor es: " + objRegSueldo.menor());
    }
}