package screentrack_user_service.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "partner")
@Getter
@Setter
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    public Partner() {}
    public Partner(String name, String email) {
        this.name = name;
        this.email = email;
    }
}