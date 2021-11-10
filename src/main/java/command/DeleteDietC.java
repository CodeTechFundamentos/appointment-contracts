package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class DeleteDietC {
    @TargetAggregateIdentifier
    private String id;
}
