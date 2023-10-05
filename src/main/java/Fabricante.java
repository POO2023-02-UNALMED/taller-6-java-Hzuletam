package vehiculos;

import Pais;

import java.util.Map;
import java.util.HashTable;
import java.util.Set;

public class Fabricante{
    public String nombre ;
    public Pais pais;
    public Map<String, int> fabricas = new HashTable();

    public Fabricante(Pais pais, String nombre){
        this.nombre = nombre ; 
        this.pais = pais;
        if (fabricas.contains(nombre) = false){
            fabricas.put(nombre, (int) 0);
        }
        
    }

    public void unaVentaMas(String nombre){
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
