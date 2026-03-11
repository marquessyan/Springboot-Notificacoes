package com.dev.marquessyan.notificationservice.service;

import com.dev.marquessyan.notificationservice.entity.NotificationLog;
import com.dev.marquessyan.notificationservice.factory.NotificationFactory;
import com.dev.marquessyan.notificationservice.model.NotificationRequest;
import com.dev.marquessyan.notificationservice.repository.NotificationLogRepository;
import org.springframework.stereotype.Service;


@Service
public class NotificationService {
    private final NotificationFactory notificationFactory;
    private final NotificationLogRepository notificationLogRepository;

    public NotificationService(NotificationFactory notificationFactory, NotificationLogRepository notificationLogRepository) {
        this.notificationFactory = notificationFactory;
        this.notificationLogRepository = notificationLogRepository;
    }

    public void process(NotificationRequest request) {
        notificationFactory.execute(request);
        NotificationLog notificationLog = new NotificationLog(request);
        notificationLogRepository.save(notificationLog);
    }
}
