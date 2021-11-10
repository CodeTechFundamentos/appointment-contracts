package events;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.Date;

@Value
@AllArgsConstructor
public class DietCreatedEvent {
    private String id;
    private String name;
    private String description;
    private Date createdAt;
    private Date lastModification;
}
