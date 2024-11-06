package programa;

public class RegistroCompras {
    // Atributos
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;
    
    // Constructor
    public RegistroCompras(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }
    
    // Método para calcular el total de las compras
    public double total() {
        return this.compra1 + this.compra2 + this.compra3 + this.compra4;
    }
    
    // Método para calcular el promedio de las compras
    public double promedio() {
        return this.total() / 4;   
    }
    
    // Método para encontrar la compra mayor
    public double mayor() {
        double mayorCompra = this.compra1;
        if (this.compra2 > mayorCompra) {
            mayorCompra = this.compra2;
        }
        if (this.compra3 > mayorCompra) {
            mayorCompra = this.compra3;
        }
        if (this.compra4 > mayorCompra) {
            mayorCompra = this.compra4;
        }
        return mayorCompra;
    }
    
    // Método para encontrar la compra menor
    public double menor() {
        double menorCompra = this.compra1;
        if (this.compra2 < menorCompra) {
            menorCompra = this.compra2;
        }
        if (this.compra3 < menorCompra) {
            menorCompra = this.compra3;
        }
        if (this.compra4 < menorCompra) {
            menorCompra = this.compra4;
        }
        return menorCompra;
    }
}