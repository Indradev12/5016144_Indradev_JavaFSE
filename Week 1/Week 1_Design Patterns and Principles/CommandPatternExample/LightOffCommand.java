public class LightOffCommand implements Command{

    @Override
    public void execute() {
        Light.turnOff();
    }
    
}
