public class Vehiculo {

    private String marca;
    private int modelo;
    
    public Vehiculo(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo() {
    }

    public int suma(int a, int b){
        return a + b;
    }

    public int suma(int a, int b, int c){
        return a + b + c;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + "]";
    }

}