package digital_chief_test_task.services;

import digital_chief_test_task.dto.NationalDishDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NationalDishService {

    List<NationalDishDto> getAllNationalDishes();

    void createNationalDish(long asiaId, String dishName, String originCountry, String ingredients,
                            String description, int popularity);

    void updateNationalDish(Long id, long asiaId, String dishName, String originCountry, String ingredients,
                            String description, int popularity);
    void deleteNationalDish(Long id);

    void deleteNationalDishes();

}
