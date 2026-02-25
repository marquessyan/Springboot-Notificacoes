package com.dev.marquessyan.notificationservice.strategy;

import com.dev.marquessyan.notificationservice.model.NotificationRequest;
import com.dev.marquessyan.notificationservice.model.NotificationType;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationStrategy implements NotificationStrategy{
    @Override
    public void send(NotificationRequest request) {
        System.out.println("Enviando Email para: " + request.getDestination());
        System.out.println("Conteúdo: " + request.getMessage());
    }

    @Override
    public NotificationType getSupportedType() {
        return NotificationType.EMAIL;
    }
}
