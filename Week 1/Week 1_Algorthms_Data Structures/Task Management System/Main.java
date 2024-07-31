public class Main {
    public static void main(String[] args) {
        TaskManagement operation = new TaskManagement();
        

        Task task1 = new Task(1, "task1", false);
        Task task2 = new Task(2, "task2", false);
        Task task3 = new Task(3, "task3", true);
        Task task4 = new Task(4, "task4", true);

        operation.addFirst(task1);
        operation.addLast(task2); 
        operation.addRandom(task3, 1);
        operation.addLast(task4);


        System.out.println("Tasks after additions:");
        operation.traverse();

        int id = 2;
        operation.deleteRandom(id);
 
        System.out.println("\nSearching for task with ID:" + id);
        Task foundTask = operation.search(id);
        if (foundTask != null) {
            System.out.println(foundTask);
        } else {
            System.out.println("Task not found.");
        }
    }
}
