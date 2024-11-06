package programa;

public class RegistroFinanzas {
    // Atributos
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;
    
    // Constructor
    public RegistroFinanzas(double ingresoMensual, double otrosIngresos, double gastosMensuales) {
        this.ingresoMensual = ingresoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMensuales = gastosMensuales;
    }
    
    // Método para calcular el ahorro mensual
    public double calcularAhorroMensual() {
        return this.ingresoMensual + this.otrosIngresos - this.gastosMensuales;
    }
    
    // Método para calcular el ahorro semestral
    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }
    
    // Método para calcular el ahorro anual
    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }
}
