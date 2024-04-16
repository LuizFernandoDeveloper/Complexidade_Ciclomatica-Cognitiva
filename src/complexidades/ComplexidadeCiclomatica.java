package complexidades;

public class ComplexidadeCiclomatica {

    public static int fazalgumacoisa(int a, int b, int c) {
        if (checarSeehPar(a)) {
            return somarDoisNumeros(a, c);
        }

        if (checarSeehPar(b)) {
            return somarDoisNumeros(b, a);
        }

        if (checarSeehPar(c)) {
            return somarDoisNumeros(a, b);
        }

        return -1;
    }

    public static  boolean checarSeehPar(int num){
        return num % 2 == 0;
    }

    public static int somarDoisNumeros(int a, int b){
        return a + b;
    }

}
