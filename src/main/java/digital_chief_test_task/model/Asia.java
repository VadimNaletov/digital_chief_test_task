package digital_chief_test_task.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "asia")
public class Asia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name = "region_name")
    private String regionName;

    @Column(nullable = false, name = "area")
    private double area;

    @Column(nullable = false, name = "population")
    private long population;

    @Column(nullable = false, name = "climate")
    private String climate;

    @Column(nullable = false, name = "languages_spoken")
    private String languagesSpoken;
}

