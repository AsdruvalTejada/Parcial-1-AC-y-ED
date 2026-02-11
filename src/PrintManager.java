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
//Opción A (Tres colas simples):
//Esta es enqueue: O(1).
//Simplemente tenemos que mirar la letra y lo agregamos al final (tail) de una de las 3 listas
//Esto sería O(1).
//Luego verificamos si H está vacía, si no M, sino L, esas son 3 verificaciones constantes.

//Opción B (Una lista enlazada ordenada):
//Esta es enqueue: O(N).
//En el peor caso, se tendría que recorrer toda la lista para ponerlo al final (esto para una priority de LOW).
//dequeue: O(1). Siempre sacas el primero (head).

//2. Complejidad Total para N trabajos:
// Opción A: Insertar N veces cuesta N*1 = O(N) y procesar N veces cuesta N*1 = O(N).
// El total sería: O(N).
// Opción B: Insertar N veces cuesta (1 + 2 + ... + N) = O(N^2). Procesar N veces cuesta O(N).
// Su total es: O(N^2).

//3. a. ¿Cuál es más eficiente?
// La Opción A (Tres Colas) es mejor porque tiene complejidad lineal O(N) en total,
// mientras que la lista ordenada se degrada a cuadrática O(N^2).
// b. ¿Más simple de mantener? La Opción A. La lógica es más limpia que manejar "punteros" para insertar nodos
// en medio de una lista enlazada.