package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo{
    private int ejes;
    private static ArrayList<Camion> cantidadCamiones = new ArrayList<>();

    public Camion(){
        cantidadCamiones.add(this);
        

    }

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        super(placa ,2, 80,nombre, precio, peso, "4X2",fabricante);
        this.ejes = ejes;
        cantidadCamiones.add(this);
    }

    public int getEjes(){
        return this.ejes;
    }

    public void setEjes(int ejes){
        this.ejes = ejes;
    }

    public static int cantidadCamiones(){
        return cantidadCamiones.size();
    }
    
}