

interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}

class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }
}

class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlack(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(baseNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        slackNotifier.send("Decorator Pattern Demo Message!");
    }
}
