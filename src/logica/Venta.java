
package logica;

import java.util.ArrayList;

public class Venta {
    
    private String producto;
    private Double precio;
    private int cantidad;
    private Double importe;
    

    public Venta() {
    }

    public Venta(int cantidad, Double precio, Double importe, String producto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }


    
public double preciosproducto(){
    
     if(producto.equalsIgnoreCase("Pollo Broaster")){
         return precio=10.0;
     }
     else if(producto.equalsIgnoreCase("Pollo a la brasa")){
         return precio=15.0;
     }
     else if (producto.equalsIgnoreCase("Coca cola Personal")){
         return precio=3.2;
     }
     else if (producto.equalsIgnoreCase("Inkacola Personal")){
         return precio=2.0;
     }
     else if (producto.equalsIgnoreCase("Agua Personal")){
         return precio=1.5;
     }
     else if (producto.equalsIgnoreCase("Arroz Chaufa")){
         return precio=13.0;
     }
     else if (producto.equalsIgnoreCase("Vino")){
         return precio=40.0;
     }
     else if (producto.equalsIgnoreCase("Cerveza Pilsen")){
         return precio=8.0;
     }
     else{
         return precio=0.0;
     }
}
public String listaProductos(){
    
     if(producto.equalsIgnoreCase("Pollo Broaster")){
         return "Pollo Broater";
     }
     else if(producto.equalsIgnoreCase("Pollo a la brasa")){
         return "Pollo a la brasa";
     }
     else if (producto.equalsIgnoreCase("Coca cola Personal")){
         return "Coca cola Personal";
     }
     else if (producto.equalsIgnoreCase("Inkacola Personal")){
         return "Inkacola Personal";
     }
     else if (producto.equalsIgnoreCase("Agua Personal")){
         return "Agua Personal";
     }
     else if (producto.equalsIgnoreCase("Arroz Chaufa")){
         return "Arroz Chaufa";
     }
     else if (producto.equalsIgnoreCase("Vino")){
         return "Vino";
     }
     else if (producto.equalsIgnoreCase("Cerveza Pilsen")){
         return "Cerveza Pilsen";
     }
     else{
         return "";
     }
}

public double ImporteTotal(){
    
     if(producto.equalsIgnoreCase("Pollo Broaster")){
         return importe =10.0*cantidad;
     }
     else if(producto.equalsIgnoreCase("Pollo a la brasa")){
         return importe=15.0*cantidad;
     }
     else if (producto.equalsIgnoreCase("Coca cola Personal")){
         return importe=3.2*cantidad;
     }
     else if (producto.equalsIgnoreCase("Inkacola Personal")){
         return importe=2.0*cantidad;
     }
     else if (producto.equalsIgnoreCase("Agua Personal")){
         return importe=1.5*cantidad;
     }
     else if (producto.equalsIgnoreCase("Arroz Chaufa")){
         return importe=13.0*cantidad;
     }
     else if (producto.equalsIgnoreCase("Vino")){
         return importe=40.0*cantidad;
     }
     else if (producto.equalsIgnoreCase("Cerveza Pilsen")){
         return importe=8.0*cantidad;
     }
     else{
         return 0;
     }
}

  public double calcularPrecioTotal(ArrayList<Venta> ventas) {
        double total = 0.0;
        for (Venta venta : ventas) {
            total += venta.getImporte();
        }
        return total;
    }


@Override
public String toString(){
    
        return "Producto"+this.producto+"\n"+
                "Precio:"+this.precio+"\n"+
                "Cantidad:"+this.cantidad+"\n"+
                "Importe total:"+this.importe;
    
}

}


