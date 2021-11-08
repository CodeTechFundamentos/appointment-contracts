package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class UpdateAppointmentC {
    @TargetAggregateIdentifier
    private String id;
    private Date lastModification;
    private Date appointmentDate;
    private String nutritionistNotes;
}
