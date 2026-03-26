package screentrack_user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import screentrack_user_service.entity.Partner;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
