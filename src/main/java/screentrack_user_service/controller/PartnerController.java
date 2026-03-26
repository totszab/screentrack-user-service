package screentrack_user_service.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import screentrack_user_service.Service.PartnerService;
import screentrack_user_service.dto.PartnerDTO;
import screentrack_user_service.entity.Partner;

import java.util.List;

@RestController
@RequestMapping("/api/partners")
public class PartnerController {

    private final PartnerService service;

    public PartnerController(PartnerService service) {
        this.service = service;
    }

    // CREATE partner
    @PostMapping
    public ResponseEntity<Partner> createPartner(@Valid @RequestBody PartnerDTO dto) {
        Partner partner = new Partner(dto.getName(), dto.getEmail());
        Partner saved = service.createPartner(partner);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // GET all partners
    @GetMapping
    public ResponseEntity<List<Partner>> getAllPartners() {
        return ResponseEntity.ok(service.getAllPartners());
    }
}
