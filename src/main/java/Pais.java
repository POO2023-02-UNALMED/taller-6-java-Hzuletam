package vehiculos;

import java.util.Map;
import java.util.HashTable;
import java.util.Set;

class Pais{
    String nombre;
    static Map<String , int> paises = new HashTable();

    public Pais(String nombre){
        this.nombre = nombre ;
        if (paises.contains(nombre) == false ){
            paises.put(nombre,(int)0);
        }
    }

    public String paisMasVendedor(){
        Set<String> llaves = paises.keySet();
        String paisMasVendedor;
        int Cantidadvendidos;
        for(String nombre: llaves){
            if (paises.get(nombre)>Cantidadvendidos){
                paisMasVendedor=nombre;
                Cantidadvendidos = paises.get(nombre);
            }
        }
        return paisMasVendedor;
    }
}