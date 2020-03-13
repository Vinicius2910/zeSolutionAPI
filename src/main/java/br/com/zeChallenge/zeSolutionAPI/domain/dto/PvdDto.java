package br.com.zeChallenge.zeSolutionAPI.domain.dto;

import br.com.zeChallenge.zeSolutionAPI.domain.Address;
import br.com.zeChallenge.zeSolutionAPI.domain.CoverageArea;
import br.com.zeChallenge.zeSolutionAPI.domain.Pvd;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Data
@NoArgsConstructor
public class PvdDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String tradingName;
    private String ownerName;
    private String document;
    private AddressDto address;
    private CoverageAreaDto coverageArea;

    public Pvd convertToPvd(){
        Pvd pvd = new Pvd();
        Point point = new Point(this.getAddress().getCoordinates().get(0).intValue(), this.getAddress().getCoordinates().get(1).intValue());
        Address address = new Address();
        address.setCoordinates(point);
        address.setType(this.getAddress().getType());

        pvd.setTradingName(this.getTradingName());
        pvd.setOwnerName(this.getOwnerName());
        pvd.setDocument(this.getDocument());
        pvd.setAddress(address);
        pvd.setCoverageArea(convertToCoverageArea());
        return pvd;
    }

    private CoverageArea convertToCoverageArea(){
        CoverageArea coverageArea = new CoverageArea();
        List<Point> pointList = new ArrayList<>();
        List<List<List<Point>>> multiPolygon = new ArrayList<>();
        Polygon polygon = new Polygon();

        this.getCoverageArea().getCoordinates().get(0).get(0).forEach(point -> {
            pointList.add(new Point(point.get(0), point.get(1)));
            polygon.addPoint(point.get(0), point.get(1));
        });
        coverageArea.setType(this.coverageArea.getType());
        coverageArea.setCoordinates(polygon);
        return coverageArea;
    }
}
