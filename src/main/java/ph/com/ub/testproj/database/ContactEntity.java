package ph.com.ub.testproj.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class ContactEntity {

    @Id
    private Long id;

    private String value;

    @ManyToOne
    private PersonEntity person;

}
