package aplicacion;

import palabras.DistanciaEntrePalabras;

public class Principal{
    public static void main(String[] args){
        System.out.println("La distancia minima para transformar " + args[0] + " en " + args[1] + " o viceversa es "
                            + DistanciaEntrePalabras.calculadoraDistancias(args[0], args[1]));
    }
}