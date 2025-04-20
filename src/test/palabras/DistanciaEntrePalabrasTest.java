package palabras;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DistanciaEntrePalabrasTest {
    public class CalculadoraDistanciasTest {

        @Test
        public void calculadoraDistanciasLargasTest(){
   
            int resul = DistanciaEntrePalabras.calculadoraDistancias("flor","dolores");
            assertEquals(5, resul);
        }
   
        @Test
        public void calculadoraDistanciasCortasTest(){
   
            int resul = DistanciaEntrePalabras.calculadoraDistancias("raton","rato");
            assertEquals(1, resul);
        }
   
        @Test
        public void calculadoraDistanciasIgualesTest(){
   
            int resul = DistanciaEntrePalabras.calculadoraDistancias("arbol","arbol");
            assertEquals(0, resul);
        }
   
   
    }
   
}

