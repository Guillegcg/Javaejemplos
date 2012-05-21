import java.io.*;
import java.lang.*;

public class Ascii {
    public static void main(String args[]) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese caracter: ");
        String str = buff.readLine();
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            int j = (int) c;
            System.out.println("El ASCII de " + c + " es " + j + ".");
        }
    }
}