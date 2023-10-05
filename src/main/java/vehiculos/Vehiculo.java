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
    public int CantidadVehiculos;
    
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
    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getPuertas(){
        return this.puertas;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidad){
        this.velocidadMaxima = velocidad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getPeso(){
        return this.peso ;
    }

    public void setPeso(int peso){
        this.peso = peso ;
    }

    public String getTraccion(){
        return this.traccion;
    }

    public Fabricante getFabricante(){
        return this.fabricante;
    }

    public void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }

    public int getCantidadVehiculos(){
        return this.CantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidad){
        this.CantidadVehiculos = cantidad;
    }

    public int vehiculosPorTipo(){
        System.out.println("Automoviles: "+Automoviles.getCantidadVehiculos()
        +"\nCamionetas: "+Camionetas.getCantidadVehiculos()
        +"\nCamiones: "+Camion.getCantidadVehiculos());
}   