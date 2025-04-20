package palabras;
/**
 * Clase que proporciona un método para calcular la distancia de edición
 * (también conocida como distancia de Levenshtein) entre dos palabras.
 */
public class DistanciaEntrePalabras {

    /**
     * Calcula la distancia de edición entre dos palabras, es decir,
     * el número mínimo de operaciones necesarias para transformar una palabra en otra.
     * Las operaciones permitidas son: inserción, eliminación y sustitución de caracteres.
     *
     * @param Palabra1 La primera palabra.
     * @param Palabra2 La segunda palabra.
     * @return La distancia mínima de edición entre ambas palabras.
     */
    public static int calculadoraDistancias(String Palabra1, String Palabra2) {

        int m = Palabra1.length();
        int n = Palabra2.length();

        // Matriz que almacena las distancias parciales entre los prefijos de las palabras.
        int[][] Distancia = new int[m + 1][n + 1];

        // Inicialización de la primera columna: convertir desde Palabra1 a cadena vacía.
        for (int i = 0; i <= m; i++) {
            Distancia[i][0] = i;
        }

        // Inicialización de la primera fila: convertir desde cadena vacía a Palabra2.
        for (int j = 0; j <= n; j++) {
            Distancia[0][j] = j;
        }

        // Cálculo dinámico de la distancia de edición.
        for (int j = 1; j <= m; j++) {
            for (int i = 1; i <= n; i++) {

                // Si los caracteres actuales son iguales, no se requiere operación.
                if (Palabra1.charAt(i - 1) == Palabra2.charAt(j - 1)) {
                    Distancia[i][j] = Distancia[i - 1][j - 1];
                } else {
                    // Calcula el mínimo entre insertar, eliminar o sustituir un carácter.
                    int añadirLetra = Distancia[i][j - 1] + 1;
                    int borrarLetra = Distancia[i - 1][j] + 1;
                    int sustituir = Distancia[i - 1][j - 1] + 1;
                    Distancia[i][j] = Math.min(sustituir, Math.min(añadirLetra, borrarLetra));
                }
            }
        }

        // Retorna la distancia de edición entre las dospalabras completas.
        return Distancia[m][n];
    }
}
