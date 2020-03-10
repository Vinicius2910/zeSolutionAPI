package br.com.zeChallenge.zeSolutionAPI.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;

@EqualsAndHashCode
@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private Point coordinates;

    public Address(String type, Point coordinates){
        this.id =  null;
        this.type = type;
        this.coordinates =  coordinates;
    }
}
