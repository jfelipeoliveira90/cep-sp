package br.com.jfelipe.cepsp.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "zip_codes")
public final class ZipCode implements Serializable {
    private static final long serialVersionUID = -5761752484840491650L;

    @Id
    @Column(length = 10)
    private String number;

    @Column(length = 256, nullable = false)
    private String address;

    @Column(length = 100)
    private String district;

    @ManyToOne
    @JoinColumn(name = "cities_id", nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(name = "states_id", nullable = false)
    private State state;

    @Override
    public String toString() {
        return "ZipCode{" +
                "number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", city=" + city +
                ", state=" + state +
                '}';
    }
}
