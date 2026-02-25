package com.dev.marquessyan.notificationservice.factory;

import com.dev.marquessyan.notificationservice.model.NotificationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationFactory notificationFactory;

    public NotificationController(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendNotification(@RequestBody NotificationRequest request) {
        notificationFactory.execute(request);
        return ResponseEntity.ok("Notificação enviada para processamento.");
    }
}



