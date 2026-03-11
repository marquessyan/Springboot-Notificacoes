package com.dev.marquessyan.notificationservice.entity;

import com.dev.marquessyan.notificationservice.model.NotificationRequest;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.time.LocalDateTime;

@Entity
@Table(name="notifications_log")
@Data
@NoArgsConstructor
public class NotificationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destination;
    private String message;
    private String type;
    private LocalDateTime createdAt = LocalDateTime.now();

    public NotificationLog(NotificationRequest request) {
        this.destination = request.getDestination();
        this.message = request.getMessage();
        this.type = String.valueOf(request.getType());
    }
}
