package com.dev.marquessyan.notificationservice.strategy;

import com.dev.marquessyan.notificationservice.model.NotificationRequest;
import com.dev.marquessyan.notificationservice.model.NotificationType;

public class SmsNotificationStrategy implements NotificationStrategy{
    @Override
    public void send(NotificationRequest request) {
        System.out.println("Enviando SMS para o número: " + request.getDestination());
        System.out.println("Mensagem: " + request.getMessage());
    }

    @Override
    public NotificationType getSupportedType() {
        return NotificationType.SMS;
    }
}
