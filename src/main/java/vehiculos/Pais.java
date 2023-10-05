package vehiculos;

import java.util.ArrayList;

public class Pais{
    String nombre;
    public static ArrayList<Pais> paises = new ArrayList<>();

    public Pais(){

    }

    public Pais(String nombre){
        this.nombre = nombre ;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public static Pais paisMasVendedor(){
        Pais mejor = null;
        int cantidadV = 0;

        for (var pais : paises){
            var cantidad = 0;
            for (var paistemp : paises){
                if (pais == paistemp){
                    cantidad++;
                }
            }
            if (cantidadV < cantidad){
                cantidadV = cantidad;
                mejor = pais;
            }

        }
        return mejor;
    }
}