package com.dev.marquessyan.notificationservice.strategy;

import com.dev.marquessyan.notificationservice.model.NotificationRequest;
import com.dev.marquessyan.notificationservice.model.NotificationType;

public class PushNotificationStrategy implements NotificationStrategy{

    @Override
    public void send(NotificationRequest request) {
        System.out.println("Notificação Push enviada para: " + request.getDestination());
    }

    @Override
    public NotificationType getSupportedType() {
        return NotificationType.PUSH;
    }
}
