import java.awt.Point;

class ProbarReferencias {
    public static void main(String args[]) {
        Point pt1, pt2;
        pt1 = new Point(100, 100);
        pt2 = pt1; //creamos la referencia a pt1
        pt1.x = 200; //si cambiamos a pt1.x tambien cambiará pt2.x
        System.out.println("Pt1: " + "("+pt1.x + "," + pt1.y + ")");
        System.out.println("Pt2: " + "("+pt2.x + "," + pt2.y + ")");
        String cuenta = "25";
        int miCuenta = Integer.parseInt(cuenta);
        System.out.println(++miCuenta);
        //System.out.println(miNombre());
    }
    
//    void miNombre() {
//        System.out.println("Guillermo");
//    }
}
