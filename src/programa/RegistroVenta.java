
package programa;

public class RegistroVenta {
    //atributos
    private double venta1;
    private double venta2;
    private double venta3;
    //metodo constructor
    public RegistroVenta(double xventa1, double xventa2, double xventa3){
        this.venta1=xventa1;
        this.venta2=xventa2;
        this.venta3=xventa3;
    }
    public double total (){
        return (this.venta1+this.venta2+this.venta3);
    }
    public double promedio(){
        return(this.total()/3);   
    }
    public double mayor(){
        double xmayor;
        xmayor=this.venta1;
        if(this.venta2>xmayor){
            xmayor=this.venta2;
        }
        if(this.venta3>xmayor){
            xmayor=this.venta3;
        }
        return(xmayor);
    }
    public double menor(){
        double xmenor;
        xmenor=this.venta1;
        if(this.venta2<xmenor){
            xmenor=this.venta2;
        }
        if(this.venta3<xmenor){
            xmenor=this.venta3;
        }
        return(xmenor);
    }
}
