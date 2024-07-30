public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Turn the light on
        remoteControl.setCommand(new LightOnCommand());
        remoteControl.pressButton();

        // Turn the light off
        remoteControl.setCommand(new LightOffCommand());
        remoteControl.pressButton();
    }
}
