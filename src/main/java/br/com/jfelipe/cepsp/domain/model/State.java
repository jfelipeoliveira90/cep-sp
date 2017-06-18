package br.com.jfelipe.cepsp.domain.model;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class State implements Serializable {
    private static final long serialVersionUID = 6144642750124716013L;

    private int id;
    private String name;
    private String abbreviation;
}
