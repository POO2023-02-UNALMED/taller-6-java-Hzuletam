package vehiculos;

import java.util.Map;
import java.util.HashTable;
import java.util.Set;

public class Fabricante{
    public String nombre ;
    public Pais pais;
    public static Map<String, int> fabricas = new HashTable();

    public Fabricante(){

    }

    public Fabricante(Pais pais, String nombre){
        this.nombre = nombre ; 
        this.pais = pais;
        if (fabricas.contains(nombre) = false){
            fabricas.put(nombre, (int) 0);
        }
        
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String Nombre){
        this.nombre = nombre;
    }

    public Pais getPais(){
        return this.pais;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }


    public static void unaVentaMas(String nombre){
        fabricas.put(nombre,fabricas.get(nombre) + 1);
    }
    
    public String fabricaMayorVentas(){
    Set<String> fabricas = fabricas.keyset();
    String mejorFabrica;
    int cantidadVendidos;
    for(String fabrica : fabricas){
    if (fabricas.get(fabrica) > cantidadVendidos){
        mejorFabrica = fabrica;
        cantidadVendidos = fabricas.get(fabrica);
        }
    return mejorFabrica;
        }
    }
}
