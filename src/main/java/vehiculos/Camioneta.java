package vehiculos;

import Vehiculo;

public class Camioneta extends Vehiculo{
    boolean volco;

    public Camioneta(String placa ,int puertas,String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
     super(String placa ,int puertas, 90,String nombre, int precio, int peso, "4X4",Fabricante fabricante);
     this.volco = volco;
    }
}