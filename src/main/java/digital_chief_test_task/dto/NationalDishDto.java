package digital_chief_test_task.dto;

import lombok.Data;


@Data
public class NationalDishDto {
    private Long id;
    private Long asiaId;
    private String dishName;
    private String originCountry;
    private String ingredients;
    private String description;
    private int popularity;
}
