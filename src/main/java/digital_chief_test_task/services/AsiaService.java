package digital_chief_test_task.services;

import digital_chief_test_task.dto.AsiaDto;

import java.util.List;

public interface AsiaService {

    void createAsia(String regionName,
                       double area,
                       long population,
                       String climate,
                       String languagesSpoken);

    void updateAsia(Long id,
                       String regionName,
                       double area,
                       long population,
                       String climate,
                       String languagesSpoken);

    void deleteAsia(Long id);

    void deleteAll();

    List<AsiaDto> getAllAsia();
}
