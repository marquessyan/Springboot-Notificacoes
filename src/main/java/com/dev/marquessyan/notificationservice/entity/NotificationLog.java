package com.dev.marquessyan.notificationservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="notifications_log")
@Data
public class NotificationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destination;
    private String message;
    private String type;
    private LocalDateTime createdAt = LocalDateTime.now();
}
