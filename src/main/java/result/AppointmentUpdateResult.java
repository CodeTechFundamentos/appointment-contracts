package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class AppointmentUpdateResult {
    private String id;
    private Integer patientId;
    private Integer nutritionistId;
    private Date createdAt;
    private Date lastModification;
    private Date appointmentDate;
    private String nutritionistNotes;

    public AppointmentUpdateResult(String id, Integer patientId, Integer nutritionistId, Date lastModification, Date appointmentDate, String nutritionistNotes) {
        this.id = id;
        this.patientId = patientId;
        this.nutritionistId = nutritionistId;
        this.lastModification = lastModification;
        this.appointmentDate = appointmentDate;
        this.nutritionistNotes = nutritionistNotes;
    }
}
