package digital_chief_test_task.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "national_dish")
public class NationalDish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name = "asia_id")
    private long asiaId;

    @Column(nullable = false, name = "dish_name")
    private String dishName;

    @Column(nullable = false, name = "origin_country")
    private String originCountry;

    @Column(nullable = false, name = "ingredients")
    private String ingredients;

    @Column(nullable = false, name = "description")
    private String description;

    @Column(nullable = false, name = "popularity")
    private int popularity;
}
