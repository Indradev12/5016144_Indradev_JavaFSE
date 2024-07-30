public class Test{
    private static Student data() {
        Student student = new Student("1", "Sanjay", "A");
        return student;
    }
    public static void main(String[] args) {
        Student model = data();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
    }
}