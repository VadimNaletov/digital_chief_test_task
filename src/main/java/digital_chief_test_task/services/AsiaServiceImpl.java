package digital_chief_test_task.services;

import digital_chief_test_task.dto.AsiaDto;
import digital_chief_test_task.model.Asia;
import digital_chief_test_task.repositories.AsiaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AsiaServiceImpl implements AsiaService{

    private final AsiaRepository asiaRepository;

    @Override
    public void createAsia(String regionName,
                              double area, long population, String climate, String languagesSpoken) {
        Asia asia = new Asia();
        asia.setRegionName(regionName);
        asia.setArea(area);
        asia.setPopulation(population);
        asia.setClimate(climate);
        asia.setLanguagesSpoken(languagesSpoken);
        asiaRepository.save(asia);
    }

    @Override
    public void updateAsia(Long id, String regionName,
                              double area, long population, String climate, String languagesSpoken) {
        Optional<Asia> asiaOptional = asiaRepository.findById(id);
        if(asiaOptional.isPresent()) {
            Asia asia = asiaOptional.get();
            asia.setRegionName(regionName);
            asia.setArea(area);
            asia.setPopulation(population);
            asia.setClimate(climate);
            asia.setLanguagesSpoken(languagesSpoken);
            asiaRepository.save(asia);
        }
    }

    @Override
    public void deleteAsia(Long id) {
        Optional<Asia> asiaOptional = asiaRepository.findById(id);
        if(asiaOptional.isPresent()) {
            Asia asia = asiaOptional.get();
            asiaRepository.delete(asia);
        }
    }

    @Override
    public void deleteAll() {
        asiaRepository.deleteAll();
    }

    @Override
    public List<AsiaDto> getAllAsia(){
        List<AsiaDto> asiaDtoList = new ArrayList<>();
        List<Asia> asiaList = asiaRepository.findAll();
        for(Asia asia : asiaList){
            AsiaDto asiaDto = new AsiaDto();
            asiaDto.setId(asia.getId());
            asiaDto.setArea(asia.getArea());
            asiaDto.setPopulation(asia.getPopulation());
            asiaDto.setClimate(asia.getClimate());
            asiaDto.setLanguagesSpoken(asia.getLanguagesSpoken());
            asiaDto.setRegionName(asia.getRegionName());
            asiaDtoList.add(asiaDto);
        }
        return asiaDtoList;
    }
}

