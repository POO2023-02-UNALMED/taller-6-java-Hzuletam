package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
    private static ArrayList<Automovil> cantidadAutos = new ArrayList<>();
    public int puestos;

    public Automovil(){
        cantidadAutos.add(this);
    }
    public Automovil(String placa ,String nombre, int precio, int peso, Fabricante fabricante,int puestos){
        super(placa ,4, 100,nombre, precio, peso, "FWD",fabricante);
        this.puestos = puestos;
        cantidadAutos.add(this);
    }

    public int getPuestos(){
        return this.puestos;
    }

    public void setPuestos(int puestos){
        this.puestos = puestos;
    }

    public static int cantidadAutomoviles(){
        return cantidadAutos.size();
    }
}