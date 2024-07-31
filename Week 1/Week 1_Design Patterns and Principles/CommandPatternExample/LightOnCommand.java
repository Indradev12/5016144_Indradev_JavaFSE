public class LightOnCommand implements Command{

    @Override
    public void execute() {
        Light.turnOn();
    }
    
}
