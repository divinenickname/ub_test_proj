package ph.com.ub.testproj.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_generator")
    @SequenceGenerator(name = "person_generator", sequenceName = "person_seq", allocationSize = 1)
    private Long id;

    private String firstName;
    private String lastName;
    private String middleName;
    private Short age;

    @OneToMany
    private List<ContactEntity> contacts;

}
