package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class DietResult {
    private String id;
    private String name;
    private String description;
    private Date createdAt;
    private Date lastModification;

    public DietResult(String id, String name, String description, Date createdAt, Date lastModification) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.lastModification = lastModification;
    }
}
