/*
 * Comprobamos el alcance(scope) de una variable 
 **/
class ComprobarScope {
    int test = 10; //variable de instancia
    void imprimirTest() {
        int test = 20; //variable local
        System.out.println("Test: " + this.test); //Imprime la variable de instancia del objeto actual
    }
    
    public static void main(String args[]) {
        ComprobarScope st = new ComprobarScope();
        st.imprimirTest();
    }
}