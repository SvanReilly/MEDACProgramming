public class Optimizacion{
    public static int f1(int a, int b) {
        int c = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                c++;
            }
        }
        return c;
    }

    public static int f2(int[] arr) {
        int m = -1000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }

    public static int f3(int b, int e) {
        if (e == 0) {
            return 1;
        } else if (e == 1) {
            return b;
        } else {
            return b * f3(b, e-1);
        }
    }

    public static int f4(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * f4(n-1);
        }
    }

    public static void main(String[] args) {
        // prueba f1
        int a = 4;
        int b = 5;
        int ar = f1(a, b);
        System.out.println("El ???? es " + ar);

        // prueba f2
        int[] arr = {5, 2, 7, 4, 1, 9};
        int m = f2(arr);
        System.out.println("El ??? del array es " + m);

        // prueba f3
        int ba = 3;
        int ex = 4;
        int resultado = f3(ba, ex);
        System.out.println(ba + " ??? a " + ex + " es igual a " + resultado);

        // prueba f4
        int num = 6;
        int fa = f4(num);
        System.out.println("El ??? de " + num + " es " + fa);
    }
}
