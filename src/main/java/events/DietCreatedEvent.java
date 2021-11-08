package events;

import lombok.Value;

import java.util.Date;

@Value
public class DietCreatedEvent {
    private String id;
    private String name;
    private String description;
    private Date createdAt;
    private Date lastModification;
}
