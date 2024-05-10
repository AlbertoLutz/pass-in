package lutz.com.passin.repositories;

import lutz.com.passin.domain.checkin.Checkin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CheckinRepository extends JpaRepository<Checkin, Integer>{
}
