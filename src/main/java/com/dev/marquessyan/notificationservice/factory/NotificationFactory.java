package com.dev.marquessyan.notificationservice.factory;

import com.dev.marquessyan.notificationservice.model.NotificationRequest;
import com.dev.marquessyan.notificationservice.model.NotificationType;
import com.dev.marquessyan.notificationservice.strategy.NotificationStrategy;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class NotificationFactory {
    private final Map<NotificationType, NotificationStrategy> strategies;

    public NotificationFactory(List<NotificationStrategy> stratList) {
        this.strategies = stratList.stream()
                .collect(Collectors.toMap(NotificationStrategy::getSupportedType, s -> s));
    }

    public void execute(NotificationRequest request) {
        @NotNull(message = "Estratégia não suportada")
        NotificationStrategy strategy = strategies.get(request.getType());
        strategy.send(request);
    }
}
