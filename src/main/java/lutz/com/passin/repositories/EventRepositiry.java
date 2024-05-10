package lutz.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import lutz.com.passin.domain.event.Event;


public interface EventRepositiry extends JpaRepository<Event, String>{
}
