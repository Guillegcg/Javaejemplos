class Convertidor {
    void aMayusculas(String texto[]) {
        for(int i = 0; i < texto.length; i++) {
            texto[i] = texto[i].toUpperCase();
        }
    }
    public static void main(String argumentos[]) {
        Convertidor convierte = new Convertidor();
        convierte.aMayusculas(argumentos);
        for (int i = 0; i < argumentos.length; i++) {
            System.out.println(argumentos[i] + " ");
        }
    }
}