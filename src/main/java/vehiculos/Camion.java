package vehiculos;

import Vehiculo;

public class Camion extends Vehiculo{
    public int ejes;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        super(String placa ,2, 80,String nombre, int precio, int peso, "4X2",Fabricante fabricante);
        this.ejes = ejes;
    }
}