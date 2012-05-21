package anatomia;

class Operadores {
    public static void main(String args[]) {
        float altura = 123;
        altura = altura % 7; //Devuelve el resto
        System.out.println(altura);
        System.out.println("\n" + altura++); //Muestra el valor de la variable y luego la incrementa en uno
        System.out.println("\n" + altura);  //Muestra la variable ya incrementada
        System.out.println("\n" + ++altura); //Primero incrementa la variable y luego la muestra
    }
}