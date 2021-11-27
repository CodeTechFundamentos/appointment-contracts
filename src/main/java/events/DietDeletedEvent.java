package events;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class DietDeletedEvent {
    private String id;
}
