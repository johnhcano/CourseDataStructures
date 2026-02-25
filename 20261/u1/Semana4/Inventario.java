import java.util.Arrays;

public class Inventario {
    
    private Producto[] producto;

    public Inventario(Producto[] producto) {
        this.producto = producto;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public String buscarPorId(int id){
        String cadena = "";
        for (int i = 0; i < producto.length; i++) {
            if(id == producto[i].getId()){
                cadena = producto[i].toString();
            }else{
                cadena = "Producto NO Encontrado....";
            }
        }
        return cadena;
    }

    @Override
    public String toString() {
        return "Inventario [producto=" + Arrays.toString(producto) + "]";
    }

    

    
}
