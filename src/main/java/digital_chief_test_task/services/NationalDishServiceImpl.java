package digital_chief_test_task.services;

import digital_chief_test_task.dto.NationalDishDto;
import digital_chief_test_task.model.NationalDish;
import digital_chief_test_task.repositories.NationalDishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NationalDishServiceImpl implements NationalDishService{

    private final NationalDishRepository nationalDishRepository;
    @Override
    public List<NationalDishDto> getAllNationalDishes() {
        List<NationalDishDto> nationalDishDtoList = new ArrayList<>();
        List<NationalDish> nationalDishesList = nationalDishRepository.findAll();
        for(NationalDish nationalDish : nationalDishesList){
            NationalDishDto nationalDishDto = new NationalDishDto();
            nationalDishDto.setId(nationalDish.getId());
            nationalDishDto.setAsiaId(nationalDish.getAsiaId());
            nationalDishDto.setDishName(nationalDish.getDishName());
            nationalDishDto.setIngredients(nationalDish.getIngredients());
            nationalDishDto.setDescription(nationalDish.getDescription());
            nationalDishDto.setOriginCountry(nationalDish.getOriginCountry());
            nationalDishDto.setPopularity(nationalDish.getPopularity());
            nationalDishDtoList.add(nationalDishDto);
        }
        return nationalDishDtoList;
    }

    @Override
    public void createNationalDish(long asiaId, String dishName, String originCountry,
                                   String ingredients, String description, int popularity) {
        NationalDish nationalDish = new NationalDish();
        nationalDish.setAsiaId(asiaId);
        nationalDish.setDishName(dishName);
        nationalDish.setOriginCountry(originCountry);
        nationalDish.setIngredients(ingredients);
        nationalDish.setDescription(description);
        nationalDish.setPopularity(popularity);
        nationalDishRepository.save(nationalDish);
    }

    @Override
    public void updateNationalDish(Long id, long asiaId, String dishName, String originCountry, String ingredients, String description, int popularity) {
        Optional<NationalDish> nationalDishOptional = nationalDishRepository.findById(id);
        if(nationalDishOptional.isPresent()) {
            NationalDish nationalDish = nationalDishOptional.get();
            nationalDish.setAsiaId(asiaId);
            nationalDish.setDishName(dishName);
            nationalDish.setOriginCountry(originCountry);
            nationalDish.setIngredients(ingredients);
            nationalDish.setDescription(description);
            nationalDish.setPopularity(popularity);
            nationalDishRepository.save(nationalDish);
        }
    }

    @Override
    public void deleteNationalDish(Long id) {
        Optional<NationalDish> nationalDishOptional = nationalDishRepository.findById(id);
        if(nationalDishOptional.isPresent()){
            NationalDish nationalDish = nationalDishOptional.get();
            nationalDishRepository.delete(nationalDish);
        }
    }

    @Override
    public void deleteNationalDishes() {
        nationalDishRepository.deleteAll();
    }
}
