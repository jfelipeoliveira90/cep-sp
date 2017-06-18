package br.com.jfelipe.cepsp.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "states")
public class State implements Serializable {
    private static final long serialVersionUID = 6144642750124716013L;

    @Id
    private int id;
    private String name;
    private String abbreviation;

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
