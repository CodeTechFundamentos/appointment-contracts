package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class AppointmentResult {
    private String id;
    private Integer patientId;
    private Integer nutritionistId;
    private Date createdAt;
    private Date lastModification;
    private Date appointmentDate;
    private String nutritionistNotes;

    public AppointmentResult(String id, Integer patientId, Integer nutritionistId, Date createdAt, Date lastModification, Date appointmentDate, String nutritionistNotes) {
        this.id = id;
        this.patientId = patientId;
        this.nutritionistId = nutritionistId;
        this.createdAt = createdAt;
        this.lastModification = lastModification;
        this.appointmentDate = appointmentDate;
        this.nutritionistNotes = nutritionistNotes;
    }
}
