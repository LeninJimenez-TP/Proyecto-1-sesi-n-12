package programa;

public class RegistroSueldo {
    // Atributos
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;
    
    // Constructor
    public RegistroSueldo(double xsueldo1, double xsueldo2, double xsueldo3, double xsueldo4) {
        this.sueldo1 = xsueldo1;
        this.sueldo2 = xsueldo2;
        this.sueldo3 = xsueldo3;
        this.sueldo4 = xsueldo4;
    }
    
    // Método para calcular el total de los sueldos
    public double total() {
        return this.sueldo1 + this.sueldo2 + this.sueldo3 + this.sueldo4;
    }
    
    // Método para calcular el promedio de los sueldos
    public double promedio() {
        return this.total() / 4;   
    }
    
    // Método para encontrar el sueldo mayor
    public double mayor() {
        double mayorSueldo = this.sueldo1;
        if (this.sueldo2 > mayorSueldo) {
            mayorSueldo = this.sueldo2;
        }
        if (this.sueldo3 > mayorSueldo) {
            mayorSueldo = this.sueldo3;
        }
        if (this.sueldo4 > mayorSueldo) {
            mayorSueldo = this.sueldo4;
        }
        return mayorSueldo;
    }
    
    // Método para encontrar el sueldo menor
    public double menor() {
        double menorSueldo = this.sueldo1;
        if (this.sueldo2 < menorSueldo) {
            menorSueldo = this.sueldo2;
        }
        if (this.sueldo3 < menorSueldo) {
            menorSueldo = this.sueldo3;
        }
        if (this.sueldo4 < menorSueldo) {
            menorSueldo = this.sueldo4;
        }
        return menorSueldo;
    }
}