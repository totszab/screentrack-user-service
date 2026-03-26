package screentrack_user_service.Service;

import org.springframework.stereotype.Service;
import screentrack_user_service.entity.Partner;
import screentrack_user_service.repository.PartnerRepository;

import java.util.List;

@Service
public class PartnerService {
    private final PartnerRepository repository;

    public PartnerService(PartnerRepository repository) {
        this.repository = repository;
    }

    public Partner createPartner(Partner partner) {
        return repository.save(partner);
    }

    public List<Partner> getAllPartners() {
        return repository.findAll();
    }
}
