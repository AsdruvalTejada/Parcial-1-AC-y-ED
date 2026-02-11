public class PrintManager {
    public static void main(String[] args) {
        PrintService impresiones = new PrintService();

        impresiones.submitJob("Juan", 5, "M");

        impresiones.submitJob("Ana", 2, "H");

        impresiones.submitJob("Luis", 10, "L");

        impresiones.submitJob("Carlos", 3, "H");

        impresiones.submitJob("Maria", 4, "M");

        impresiones.processAll();
    }
}

//Respuesta a preguntas teóricas:
//