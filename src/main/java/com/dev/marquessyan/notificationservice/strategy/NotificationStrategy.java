package com.dev.marquessyan.notificationservice.strategy;

import com.dev.marquessyan.notificationservice.model.NotificationRequest;
import com.dev.marquessyan.notificationservice.model.NotificationType;

public interface NotificationStrategy {
    void send(NotificationRequest request);
    NotificationType getSupportedType();
}
