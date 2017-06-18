package br.com.jfelipe.cepsp.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "cities")
public class City implements Serializable {
    private static final long serialVersionUID = -7173072214919844138L;

    @Id
    private int id;
    private String name;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "states_id", nullable = false)
    private State state;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
