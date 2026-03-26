package screentrack_user_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartnerDTO {
    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    public PartnerDTO() {}
    public PartnerDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
