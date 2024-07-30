public class Main {
    public static void main(String[] args) {
        // created instance of a class
        employeeManagement operation = new employeeManagement(5);

        operation.add(new Employee(1, "Ram", "Manager", 70000));
        operation.add(new Employee(2, "Harsh", "Team Leader", 60000));
        operation.add(new Employee(3, "Shyam", "Developer", 50000));
        operation.add(new Employee(4, "Simran", "Developer", 50000));
        System.out.println("------------------------");
        System.out.println(operation.search(3));
        System.out.println("------------------------");
        operation.traverse();
    }    
}
