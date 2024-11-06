
package programa;

import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        //declarar variables
        double vt1,vt2,vt3;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar venta 1: ");
        vt1=lectura.nextDouble();
        System.out.print("Ingresar venta 2: ");
        vt2=lectura.nextDouble();
        System.out.print("Ingresar venta 3: ");
        vt3=lectura.nextDouble();
        // crear el obejto de la clase
        RegistroVenta objregventa=new RegistroVenta(vt1,vt2,vt3);
        //salida de datos
        System.out.println("El total de ventas es: " +objregventa.total());
        System.out.println("El promedio de venta es: " +objregventa.promedio());
        System.out.println("La venta mayor es: " +objregventa.mayor());
        System.out.println("La venta menor  es: " +objregventa.menor());      
    }
    
}
