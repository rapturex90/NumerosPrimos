package numerosprimos;

public class CribaEratostenes {

    /**
     * Generar números primos de 1 a max
     *
     * @param max es el valor máximo
     * @return Vector de números primos
     */
    public static int[] generarPrimos(int max) {
        // Declaraciones
        int dim = max + 1; // Tamaño del array 
        boolean[] esPrimo = new boolean[dim];
        
        if (max >= 2) {
            // Inicializar el array
            for (int i = 0; i < dim; i++) {
                esPrimo[i] = true;
            }

            // Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;

            // Criba
            CribaEratostenes.criba(esPrimo, dim);

            return CribaEratostenes.rellenaPrimos(esPrimo, CribaEratostenes.contarPrimos(esPrimo, dim), dim);

        } else { // max < 2 

            return new int[0]; // Vector vacío
        }
    }

    /**
     * Criba el array eliminando los múltiplos de i
     *
     * @param array[] array del que se van a eliminar los múltiplos
     * @param dim dimensión del array
     */
    private static void criba(boolean[] array, int dim) {
        for (int i = 2; i < Math.sqrt(dim) + 1; i++) {
            if (array[i]) {
                // Eliminar los múltiplos de i
                for (int j = 2 * i; j < dim; j += i) {
                    array[j] = false;
                }
            }
        }
    }

    /**
     * Permite contar los números primos
     *
     * @param array[] array donde se encuentran los números a contar
     * @param dim dimensión del array
     * @return Cuantos números primos hay
     */
    private static int contarPrimos(boolean[] array, int dim) {
        int cuenta = 0;
        for (int i = 0; i < dim; i++) {
            if (array[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }

    /**
     * Rellena un nuevo array sólo con los números primos
     *
     * @param array[] array donde se encuentran los números a contar
     * @param cuenta número total de primos contenidos
     * @param dim dimensión del array
     * @return Vector de números primos
     */
    private static int[] rellenaPrimos(boolean[] array, int cuenta, int dim) {
        int[] primos = new int[cuenta];
        for (int i = 0, j = 0; i < dim; i++) {
            if (array[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }
}
