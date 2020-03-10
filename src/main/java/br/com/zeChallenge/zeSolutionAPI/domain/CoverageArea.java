package br.com.zeChallenge.zeSolutionAPI.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;
import java.util.List;

@EqualsAndHashCode
@Data
@NoArgsConstructor
@Entity
public class CoverageArea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private List<List<List<Point>>> coordinates;

    public CoverageArea(String type, List<List<List<Point>>> coordinates){
        this.id =  null;
        this.type = type;
        this.coordinates =  coordinates;
    }
}