public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo objVehiculo1 = new Vehiculo("Mazda", 2021);
        Vehiculo objVehiculo2 = new Vehiculo("Chevrolet", 2011);
        Vehiculo objVehiculo3 = new Vehiculo("Nissan", 2012);
        Vehiculo objVehiculo4 = new Vehiculo("Renault", 2000);
        Vehiculo objVehiculo5 = new Vehiculo("Toyota", 2001);
        Vehiculo objVehiculo6 = new Vehiculo("BMW", 2009);
        
        Vehiculo objVehiculo7 = new Vehiculo();

        objVehiculo7.setMarca("Mercedes Benz");
        objVehiculo7.setModelo(2022);

        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo7.toString());
        
    }
}