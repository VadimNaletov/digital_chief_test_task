package digital_chief_test_task.repositories;

import digital_chief_test_task.model.Asia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AsiaRepository extends JpaRepository<Asia, Long> {

}
