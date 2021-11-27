package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class DietUpdateResult {
    private String id;
    private String name;
    private String description;
    private Date createdAt;
    private Date lastModification;

    public DietUpdateResult(String id, String name, String description, Date lastModification) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.lastModification = lastModification;
    }
}
