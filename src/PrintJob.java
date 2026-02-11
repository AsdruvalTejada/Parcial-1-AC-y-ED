public class PrintJob {
    private String user;
    private int pages;
    private String priority;

    public PrintJob(String user, int pages, String priority) {
        this.user = user;
        this.pages = pages;
        this.priority = priority;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

}

class Node {
    PrintJob data;
    Node next;

    public Node(PrintJob data) {
        this.data = data;
        this.next = null;
    }
}

class PersonalQueue {
    private Node head;
    private Node tail;

    public PersonalQueue() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(PrintJob job) {
        Node newNode = new Node(job);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public PrintJob dequeue() {
        if (isEmpty()) return null;

        PrintJob data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        return data;
    }

}