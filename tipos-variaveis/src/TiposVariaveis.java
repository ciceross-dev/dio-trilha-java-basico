public class TiposVariaveis {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        System.out.println(numeroCurto2);

        int numero = 10;
        numero = 20;
        // DECLARAÇÃO DE CONSTANTE
        final double VALOR_DE_PI = 3.14;
    }
}
