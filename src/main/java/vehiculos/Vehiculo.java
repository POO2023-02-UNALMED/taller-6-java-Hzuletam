package vehiculos;


public class Vehiculo{

    String placa;
    int puertas;
    int velocidadMaxima;
    String nombre;
    int precio;
    int peso;
    String traccion;
    Fabricante fabricante;
    public static int CantidadVehiculos;
    
    public Vehiculo(String placa ,int puertas, int velocidadMaxima,String nombre, int precio, int peso, String traccion,Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre ;
        this.precio = precio ;
        this.peso = peso ;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos+=1;
    }

}