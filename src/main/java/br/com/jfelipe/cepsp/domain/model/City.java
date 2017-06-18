package br.com.jfelipe.cepsp.domain.model;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class City implements Serializable {
    private static final long serialVersionUID = -7173072214919844138L;

    private int id;
    private String name;
    private State state;
}
