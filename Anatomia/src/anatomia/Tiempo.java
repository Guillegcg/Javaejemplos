package anatomia;

public class Tiempo {
    public static void main(String args[]) {
        float fah = 86;
        System.out.println(fah + " grados Fahrenheit son . . .");
        //Para convertir de Fahrenheit a Celsius
        //Empezamos por restar 32
        fah = fah - 32;
        //Dividimos el resultado por 9
        fah = fah / 9;
        //Multiplicamos el resultado por 5
        fah = fah * 5;
        System.out.println(fah + " grados Celsius\n");
        float cel = 33;
        //los String son objetos
    }
}