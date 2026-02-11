import java.util.Scanner;

public class PrintManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintService service = new PrintService();

        System.out.print("¿Cuántos documentos deseas imprimir? ");
        int cant = 0;

        cant = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cant; i++) {

            System.out.print("Nombre del usuario: ");
            String nombre = scanner.nextLine();

            int paginas = 0;
            System.out.print("Número de páginas: ");
            paginas = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Prioridad (L - Baja, M - Media, H - Alta): ");
            String prioridad = scanner.nextLine();
            service.submitJob(nombre, paginas, prioridad);
        }

        service.processAll();
        scanner.close();
    }
}

//Respuesta a preguntas teóricas:
//1. Para cada opción (A y B), determine la complejidad asintótica de las operaciones:
//