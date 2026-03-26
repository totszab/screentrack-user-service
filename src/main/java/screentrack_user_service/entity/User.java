package screentrack_user_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "\"user\"")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String email;
}
