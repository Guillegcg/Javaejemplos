class MostrarString {
    public static void main(String args[]) {
        System.out.print("\"Aquí escribimos nuestro texto\"\b\b\b\b");
        System.out.println("hola");
        String palabrasClave = "";
        palabrasClave = "videotutoriales ";
        palabrasClave += "flash, "; //Esto es equivalente a usar 
        //palabrasClave = palabrasClave + "flash";
        palabrasClave = palabrasClave + "php";
        System.out.println(palabrasClave + ".");
        String respuesta = "amarillo";
        String resultado = "verde";
        System.out.print("Las variables no son iguales, por lo tanto: ");
        System.out.println(respuesta.equals(resultado));
        System.out.println(respuesta.toUpperCase());
        int busca = palabrasClave.indexOf("deot");
        System.out.println(busca);
        
    }
}