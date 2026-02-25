package com.dev.marquessyan.notificationservice.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {

    @NotBlank(message = "O destino é obrigatório (email ou número)")
    private String destination;
    @NotBlank(message = "A mensagem não pode estar vazia")
    private String message;
    @NotNull(message = "O tipo de notificação (EMAIL, SMS, PUSH) é obrigatório")
    private NotificationType type;

}
