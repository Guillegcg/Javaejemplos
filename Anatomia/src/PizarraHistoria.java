class PizarraHistoria {
    String status;
    int numeroPregunta;
    int puntuacion;
    
    PizarraHistoria(String entrada1, int entrada2, int entrada3) {
        status = entrada1;
        numeroPregunta = entrada2;
        puntuacion = entrada3;
    }
     
    public static void main(String args[]) {
        PizarraHistoria grecia = new PizarraHistoria("activa", 3, 6);
        System.out.println(grecia.status);
        System.out.println(grecia.numeroPregunta);
        System.out.println(grecia.puntuacion);
    }
}