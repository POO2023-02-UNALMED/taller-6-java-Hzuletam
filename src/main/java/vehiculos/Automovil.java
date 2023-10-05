package vehiculos;

import Vehiculo;

public class Automovil extends Vehiculo{
    public int puestos;

    public Automovil(String placa ,String nombre, int precio, int peso, Fabricante fabricante,int puestos){
        super(String placa ,4, 100,String nombre, int precio, int peso, "FWD",Fabricante fabricante);
        this.puestos = puestos;
    }

}