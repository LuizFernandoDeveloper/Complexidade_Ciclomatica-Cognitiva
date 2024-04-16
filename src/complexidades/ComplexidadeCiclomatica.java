package complexidades;

public class ComplexidadeCiclomatica {

    public static int fazalgumacoisa(int a, int b, int c) {
        if (a % 2 == 0) {
            return b + c;
        }

        if (b % 2 == 0) {
            return a + c;
        }

        if (c % 2 == 0) {
            return a + b;
        }

        return -1;
    }

}
