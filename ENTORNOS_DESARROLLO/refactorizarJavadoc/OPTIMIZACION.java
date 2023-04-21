package refactorizarJavadoc;
/**
 * 
 */
public class OPTIMIZACION{
    public static int productoEnteros(int factor1, int factor2) {
        int producto = factor1 * factor2;
       
        return producto;
    }
    /**
     * 
     */
    public static int valorMax(int[] arrayEnteros) {
        int maxValue = -1000000;
        for (int i = 0; i < arrayEnteros.length; i++) {
            if (arrayEnteros[i] > maxValue) {
                maxValue = arrayEnteros[i];
            }
        }
        return maxValue;
    }
    /**
     * 
     */
    public static int elevarEntero(int base, int exponente) {
       int resultadoElevar= (int) Math.pow(base, exponente);
		return resultadoElevar;
    }
    /**
     * 
     */
    public static int factorialNumIns(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialNumIns(n-1);
        }
    }
    /**
     * 
     */
    public static void main(String[] args) {

        int factor1 = 4;
        int factor2 = 5;
        int producto = productoEnteros(factor1, factor2);
        System.out.println("El producto de los enteros insertados es " + producto);

        // prueba f2
        int[] arrayEnteros = {5, 2, 7, 4, 1, 100};
        int maxValue = valorMax(arrayEnteros);
        System.out.println("El valor mas alto del array es " + maxValue);

        // prueba f3
        int base = 3;
        int exponente = 4;
        int resultadoElevar = elevarEntero(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultadoElevar);

        // prueba f4
        int numeroInsertado = 3;
        int factorialNumIns = factorialNumIns(numeroInsertado);
        System.out.println("El factorial de " + numeroInsertado + " es " + factorialNumIns);
    }
}
