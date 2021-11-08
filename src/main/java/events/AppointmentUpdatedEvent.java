package events;

import lombok.Value;

import java.util.Date;

@Value
public class AppointmentUpdatedEvent {
    private String id;
    private Date lastModification;
    private Date appointmentDate;
    private String nutritionistNotes;
}
