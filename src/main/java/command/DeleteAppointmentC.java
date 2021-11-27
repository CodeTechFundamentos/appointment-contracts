package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class DeleteAppointmentC {
    @TargetAggregateIdentifier
    private String id;
}
