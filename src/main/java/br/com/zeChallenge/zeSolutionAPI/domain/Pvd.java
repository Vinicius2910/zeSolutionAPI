package br.com.zeChallenge.zeSolutionAPI.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Pvd implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="trading_name")
    private String tradingName;

    @Column(name="owner_name")
    private String ownerName;

    @Column(name="document")
    private String document;

    @OneToOne
    private Address address;

    @OneToMany
    private CoverageArea coverageArea;

}
