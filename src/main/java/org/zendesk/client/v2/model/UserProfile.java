package org.zendesk.client.v2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserProfile  implements SearchResultEntity, Serializable {

    Map<String, Object> attributes;
    Date created_at;
    String id;
    List<Identifier> identifiers;
    String name;
    String source;
    String type;
    Date updated_at;
    String user_id;

    public UserProfile(
        Map<String, Object> attributes,
        Date created_at,
        String id,
        List<Identifier> identifiers,
        String name,
        String source,
        String type,
        Date updated_at,
        String user_id) {

        this.attributes = attributes;
        this.created_at = created_at;
        this.id = id;
        this.identifiers = identifiers;
        this.name = name;
        this.source = source;
        this.type = type;
        this.updated_at = updated_at;
        this.user_id = user_id;
    }

    public UserProfile() {}

    public record Identifier(
        String type,
        String value
    ) {}

    public Map<String, Object> getAttributes() {

        return attributes;
    }

    public Date getCreated_at() {

        return created_at;
    }

    public String getId() {

        return id;
    }

    public List<Identifier> getIdentifiers() {

        return identifiers;
    }

    public String getName() {

        return name;
    }

    public String getSource() {

        return source;
    }

    public String getType() {

        return type;
    }

    public Date getUpdated_at() {

        return updated_at;
    }

    public String getUser_id() {

        return user_id;
    }

    @Override
    public String toString() {

        return "UserProfile{" +
            "attributes=" + attributes +
            ", created_at=" + created_at +
            ", id='" + id + '\'' +
            ", identifiers=" + identifiers +
            ", name='" + name + '\'' +
            ", source='" + source + '\'' +
            ", type='" + type + '\'' +
            ", updated_at=" + updated_at +
            ", user_id='" + user_id + '\'' +
            '}';
    }
}
