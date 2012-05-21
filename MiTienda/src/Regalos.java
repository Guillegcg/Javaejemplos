import com.guille.tienda.*;

public class Regalos {
    public static void main(String args[]) {
        Escaparate almacen = new Escaparate();
        almacen.addArticulo("C01", "zapatillas", "9.99", "150");
        almacen.addArticulo("C02", "bolsa deportiva", "19.99", "50");
        almacen.addArticulo("C03", "remera", "10.49", "850");
        almacen.addArticulo("D01", "camiseta", "16.99", "90");
        almacen.sort();
        for (int i = 0; i < almacen.getSize(); i++) {
            Articulos mostrar = (Articulos) almacen.getArticulo(i);
            System.out.println("\nArticulos ID: " + mostrar.getId() +
                    "\nNombre: " + mostrar.getNombre() + 
                    "\nPrecio Detalle: " +mostrar.getDetalle() + " $" +
                    "\nPrecio: " + mostrar.getPrecio() + " $" + 
                    "\nCantidad: " + mostrar.getCantidad());
        }
    }
}