import java.awt.Point;

class Caja {
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;
    
    Caja construirCaja(int x1, int y1, int x2, int y2 ) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }
    // Método que se le pasa dos clases de tipo Point 
    Caja construirCaja(Point supIzq, Point infDer) {
        x1 = supIzq.x;
        y1 = supIzq.y;
        x2 = infDer.x;
        y2 = infDer.y;
        return this;
    }
    
    Caja construirCaja(Point supIzq, int an, int a1) {
        x1 = supIzq.x;
        y1 = supIzq.y;
        x2 = (x1 + an);
        y2 = (y1 + a1);
        return this;
    }
    
    void imprimirCaja(){
        System.out.print("Caja: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + " >");
    }
    
    public static void main(String args[]) {
        Caja rect = new Caja();
        rect.imprimirCaja();
        Point punto1 = new Point(10, 10);
        Point punto2 = new Point(20, 20);
        rect.construirCaja(punto1, punto2);
        rect.imprimirCaja();
        rect.construirCaja(punto2, 10, 23);
        rect.imprimirCaja();
    }
}