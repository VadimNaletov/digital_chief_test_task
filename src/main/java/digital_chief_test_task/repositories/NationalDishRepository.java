package digital_chief_test_task.repositories;

import digital_chief_test_task.model.NationalDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalDishRepository extends JpaRepository<NationalDish, Long> {

}
