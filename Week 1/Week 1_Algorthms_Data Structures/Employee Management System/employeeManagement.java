import java.util.Arrays;

public class employeeManagement {
    private Employee[] employees;
    private int index;

    public employeeManagement(int capacity) {
        employees = new Employee[capacity];
        index = 0;
    }

    public void add(Employee employee) {
        if (index == employees.length) {
            employees = Arrays.copyOf(employees, employees.length * 2);
        }
        employees[index++] = employee;
        System.out.println("Added Successfully...");
    }

    public Employee search(int employeeId) {
        for (int i = 0; i < index; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverse() {
        for (int i = 0; i < index; i++) {
            System.out.println(employees[i]);
        }
    }

    public void delete(int employeeId) {
        for (int i = 0; i < index; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[--index];
                employees[index] = null;
                return;
            }
        }
        System.out.println("No such data Exist.");
    }
}
