package org.example.DIP.violation;

public class NotificationService {
    private EmailSender emailSender;
    private SMSSender smsSender;

    public NotificationService() {
        emailSender = new EmailSender();
        smsSender = new SMSSender();
    }

    public void sendNotification(String message, String type) {
        if (type.equals("email")) {
            emailSender.sendEmail(message);
        } else if (type.equals("sms")) {
            smsSender.sendSMS(message);
        }
    }
}
