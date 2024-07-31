public class TaskManagement {
    Node head;
    class Node{
        Task task;
        Node next;

        Node(Task val){
            this.task = val;
            this.next = null;
        }
    }

    //Insert in Linked-List
    public void addFirst(Task task){
        Node newnode = new Node(task);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(Task task){
        Node newnode = new Node(task);
        if(head == null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next; 
        }
        currnode.next = newnode;
    }

    public void addRandom(Task task, int pos) {
        Node newnode = new Node(task);
        if (pos == 0) {
            addFirst(task);
            return;
        }
        Node prevnode = head;
        for (int i=0;i<pos-1 && prevnode != null;i++) {
            prevnode = prevnode.next;
        }
        if (prevnode == null) {
            System.out.println("Please enter a valid position.");
            return;
        }
        newnode.next = prevnode.next;
        prevnode.next = newnode;
    }


    //Delete in Linked-List
    public void DeleteFirst(){
        if(head == null){
            System.out.println("It is empty");
            return;
        }
        head = head.next;
    }
    public void DeleteLast(){
        if(head == null){
            System.out.println("It is empty");
            return;
        }
        if(head.next == null){
            head =  null;
            return;
        }
        Node secondLast = head;
        Node LastNode = head.next;
        while(LastNode.next != null){
            LastNode = LastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void deleteRandom(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.task.getTaskId() == id) {
            head = head.next;
            return;
        }
        Node prevnode = head;
        Node currnode = head.next;
        while (currnode != null) {
            if (currnode.task.getTaskId() == id) {
                prevnode.next = currnode.next;
                return;
            }
            prevnode = currnode;
            currnode = currnode.next;
        }
        System.out.println("Task with ID " + id + " not found.");
    }


    // Search
    public Task search(int id){
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == id) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
