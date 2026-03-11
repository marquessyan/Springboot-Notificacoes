package com.dev.marquessyan.notificationservice.factory;

import com.dev.marquessyan.notificationservice.entity.NotificationLog;
import com.dev.marquessyan.notificationservice.model.NotificationRequest;
import com.dev.marquessyan.notificationservice.repository.NotificationLogRepository;
import com.dev.marquessyan.notificationservice.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationLogRepository notificationLogRepository;
    private final NotificationService notificationService;

    public NotificationController(NotificationLogRepository notificationLogRepository, NotificationService notificationService) {
        this.notificationLogRepository = notificationLogRepository;
        this.notificationService = notificationService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendNotification(@RequestBody NotificationRequest request) {
        notificationService.process(request);
        return ResponseEntity.ok("Notificação enviada para processamento.");
    }

    @GetMapping("/history")
    public List<NotificationLog> listAll() {
        return notificationLogRepository.findAll();
        //return ResponseEntity.ok("Log de Notificações requisitados.");
    }
}



