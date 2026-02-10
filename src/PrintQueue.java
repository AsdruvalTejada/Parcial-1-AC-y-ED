public class PrintQueue {
    private PersonalQueue cHigh;
    private PersonalQueue cMedium;
    private PersonalQueue cLow;

    public PrintQueue() {
        cHigh = new PersonalQueue();
        cMedium = new PersonalQueue();
        cLow = new PersonalQueue();
    }

    public void enqueue(PrintJob job) {
        String p = job.getPriority().toUpperCase();

        if (p.equals("H")) {
            cHigh.enqueue(job);
        } else if (p.equals("M")) {
            cMedium.enqueue(job);
        } else if (p.equals("L")) {
            cLow.enqueue(job);
        } else {
            cMedium.enqueue(job);
        }
    }

    public PrintJob dequeue() {
        if (!cHigh.isEmpty()) {
            return cHigh.dequeue();
        }
        if (!cMedium.isEmpty()) {
            return cMedium.dequeue();
        }
        if (!cLow.isEmpty()) {
            return cLow.dequeue();
        }
        return null;
    }

    public boolean isEmpty() {
        return cHigh.isEmpty() && cMedium.isEmpty() && cLow.isEmpty();
    }
}
