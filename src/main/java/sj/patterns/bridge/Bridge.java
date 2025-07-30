package sj.patterns.bridge;

import java.util.Scanner;

interface Channel {
    void send(String message);
}

class SMSChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL : " + message);
    }
}

class EmailChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL : " + message);
    }
}

class PushNotificationChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Sending Notification : " + message);
    }
}

abstract class Notification {
    protected Channel channel;

    public Notification(Channel channel) {
        this.channel = channel;
    }

    public abstract void notify(String message);
}

class AlertNotification extends Notification {
    public AlertNotification(Channel channel) {
        super(channel);
    }

    @Override
    public void notify(String message) {
        channel.send("[ALERT] " + message);
    }
}

class SMSNotification extends Notification {
    public SMSNotification(Channel channel) {
        super(channel);
    }

    @Override
    public void notify(String message) {
        channel.send("[SMS] " + message);
    }
}

class EmailNotification extends Notification {
    public EmailNotification(Channel channel) {
        super(channel);
    }

    @Override
    public void notify(String message) {
        channel.send("[EMAIL] " + message);
    }
}

public class Bridge {

    public static void main(String[] args) {

        Channel smsChannel = new SMSChannel();
        Channel emailChannel = new EmailChannel();
        Channel pushNotificationChannel = new PushNotificationChannel();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 'alert', 'reminder', 'promotion' or Enter 'exit' to quit.'");
        while (true) {
            String message = sc.nextLine();
            if (message.equals("exit")) {
                break;
            }

            if (message.equalsIgnoreCase("alert")) {
                Notification notification = new AlertNotification(pushNotificationChannel);
                notification.notify("🚨 Important Alert: Please check your app for details.");
                continue;
            }

            if (message.equalsIgnoreCase("reminder")) {
                Notification notification = new SMSNotification(smsChannel);
                notification.notify("🔔 Reminder: Your subscription has expired. Renew now to continue enjoying our services.");
                continue;
            }

            if (message.equalsIgnoreCase("promotion")) {
                Notification notification = new EmailNotification(emailChannel);
                notification.notify("🎉 Special Offer: Enjoy 20% off your next purchase. Limited time only!");
                continue;
            }

            System.out.println("Enter your channel 'alert', 'reminder', 'promotion' or Enter 'exit' to quit.'");
        }
    }
}
