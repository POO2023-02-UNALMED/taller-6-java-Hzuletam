package vehiculos;

class Pais{
    String nombre;

    public Pais(String nombre){
        this.nombre = nombre ;
    }
    public static void unaVentaMas(String nombre){
        paises.put(nombre, paises.get(nombre) + 1);
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
