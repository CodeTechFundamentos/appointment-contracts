package events;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class AppointmentDeletedEvent {
    private String id;
}
