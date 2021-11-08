package events;

import lombok.Value;

import java.util.Date;

@Value
public class AppointmentCreatedEvent {
    private String id;
    private Integer patientId;
    private Integer nutritionistId;
    private Date createdAt;
    private Date lastModification;
    private Date appointmentDate;
    private String nutritionistNotes;
}
