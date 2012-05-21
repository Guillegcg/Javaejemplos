class ListarRango {
    int[] crearRango(int inferior, int superior) {
        int[] rango = new int[(superior-inferior)+1];
        for (int i = 0; i < rango.length; i++) {
            rango[i] = inferior++;
        }
        return rango;
    }
    
    public static void main(String args[]) {
        int[] rangox;
        ListarRango listar = new ListarRango();
        rangox = listar.crearRango(10, 15);
        for (int i = 0; i < rangox.length; i++ ) {
            System.out.println(rangox[i]);
        }
        
    }
}