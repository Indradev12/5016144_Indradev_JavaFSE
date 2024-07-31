public class Test {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("Sending notifications via Email, SMS and Slack:");
        slackNotifier.send("Hello, there...");
    }
}
