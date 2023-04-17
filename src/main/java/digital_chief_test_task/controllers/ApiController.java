package digital_chief_test_task.controllers;

import digital_chief_test_task.dto.AsiaDto;
import digital_chief_test_task.dto.NationalDishDto;
import digital_chief_test_task.services.AsiaServiceImpl;
import digital_chief_test_task.services.NationalDishServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {
    private final AsiaServiceImpl asiaService;
    private final NationalDishServiceImpl nationalDishService;


    @GetMapping("/asia")
    public List<AsiaDto> getAllAsia() {
        return asiaService.getAllAsia();
    }

    @GetMapping("/national-dish")
    public List<NationalDishDto> getAllNationalDishes() {
        return nationalDishService.getAllNationalDishes();
    }

    @PostMapping("/asia")
    public void createAsia(@RequestBody String regionName,
                              @RequestBody double area,
                              @RequestBody long population,
                              @RequestBody String climate,
                              @RequestBody String languagesSpoken) {
        asiaService.createAsia(regionName, area, population, climate, languagesSpoken);
    }

    @PostMapping("/national-dish")
    public void createNationalDish(@RequestBody long asiaId,
                                   @RequestBody String dishName,
                                   @RequestBody String originCountry,
                                   @RequestBody String ingredients,
                                   @RequestBody String description,
                                   @RequestBody int popularity) {
        nationalDishService.createNationalDish(asiaId, dishName, originCountry, ingredients,
                description, popularity);
    }

    @PutMapping("/asia/{id}")
    public void updateAsia(@PathVariable Long id, @RequestBody String regionName,
                              @RequestBody double area,
                              @RequestBody long population,
                              @RequestBody String climate,
                              @RequestBody String languagesSpoken) {
        asiaService.updateAsia(id, regionName, area, population, climate, languagesSpoken);
    }

    @PutMapping("/national-dish/{id}")
    public void updateNationalDish(@PathVariable Long id,
                                              @RequestBody long asiaId,
                                              @RequestBody String dishName,
                                              @RequestBody String originCountry,
                                              @RequestBody String ingredients,
                                              @RequestBody String description,
                                              @RequestBody int popularity) {
        nationalDishService.updateNationalDish(id, asiaId, dishName, originCountry, ingredients,
                description, popularity);
    }

    @DeleteMapping("/asia/{id}")
    public void deleteAsia(@PathVariable Long id) {
        asiaService.deleteAsia(id);
    }

    @DeleteMapping("/asia")
    public void deleteAllAsia(){
        asiaService.deleteAll();
    }

    @DeleteMapping("/national-dish/{id}")
    public void deleteNationalDish(@PathVariable Long id) {
        nationalDishService.deleteNationalDish(id);
    }

    @DeleteMapping("/national-dish")
    public void deleteNationalDishes(){
        nationalDishService.deleteNationalDishes();
    }
}

