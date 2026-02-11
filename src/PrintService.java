public class PrintService {
    private final PrintQueue miCola;

    public PrintService() {
        this.miCola = new PrintQueue();
    }

    public void submitJob(String user, int pages, String priority) {
        if (priority == null || priority.isEmpty()){
            priority = "M";
        }

        PrintJob job = new PrintJob(user, pages, priority);
        miCola.enqueue(job);

        System.out.println(job.getUser() + job.getPages() + " páginas " + job.getPriority());
    }

    public void processNext() {
        PrintJob job = miCola.dequeue();
        if (job != null) {
            System.out.println("Imprimiendo: " + "(" + job.getUser() + " " + job.getPages() +
                    " páginas, prioridad " + job.getPriority() + ")");
        }
    }

    public void processAll() {
        System.out.println("\n---IMPRIMIENDO ---");
        while (!miCola.isEmpty()) {
            processNext();
        }
    }

}
