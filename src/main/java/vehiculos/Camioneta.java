package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo{
    private boolean volco;
    private static ArrayList<Camioneta> camionetasExisten = new ArrayList<>();

    public Camioneta(){
        camionetasExisten.add(this);

    }

    public Camioneta(String placa ,int puertas,String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
     super(placa ,puertas, 90,nombre, precio, peso, "4X4",fabricante);
     this.volco = volco;
     camionetasExisten.add(this);
    }
    public boolean isVolco(){
        return this.volco;
    }

    public void setVolco(boolean volco){
        this.volco = volco;

    }

    public static int cantidadCamionetas(){
        return camionetasExisten.size();
    }
}