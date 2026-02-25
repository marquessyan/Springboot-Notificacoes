package com.dev.marquessyan.notificationservice.repository;

import com.dev.marquessyan.notificationservice.entity.NotificationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationLogRepository extends JpaRepository<NotificationLog, Long> {
}
