package org.alberttcode.appfacturas.modelo;

public class ItemFactura {
    private int cantidad;
    private Producto producto;
    public int getCantidad() {
        return cantidad;
    }

    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float calcularImporte(){
        return this.cantidad * this.producto.getPrecio();//Obtener los metodos con el objeto inicializado
    }

    @Override
    public String toString() {
        return "\t" + producto.toString() + //Se incluye codigo, id, y el precio del producto
                "\t" + cantidad +
                "\t" + calcularImporte();
    }
}
