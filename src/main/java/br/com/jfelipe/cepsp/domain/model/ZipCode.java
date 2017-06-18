package br.com.jfelipe.cepsp.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Entity
public final class ZipCode implements Serializable {
    private static final long serialVersionUID = -5761752484840491650L;

    @Id
    @Column(length = 10)
    private String number;

    @Column(length = 256, nullable = false)
    private String address;

    @Column(length = 100)
    private String district;

    @OneToMany
    @Column(name = "cities")
    private City city;

    @OneToMany
    @Column(name = "states")
    private State state;
}
