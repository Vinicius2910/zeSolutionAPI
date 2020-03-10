package br.com.zeChallenge.zeSolutionAPI.domain.dto;

import br.com.zeChallenge.zeSolutionAPI.domain.Address;
import br.com.zeChallenge.zeSolutionAPI.domain.CoverageArea;
import br.com.zeChallenge.zeSolutionAPI.domain.Pvd;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mapbox.geojson.MultiPolygon;
import lombok.Data;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
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

        pvd.setTradingName(this.getTradingName());
        pvd.setOwnerName(this.getOwnerName());
        pvd.setDocument(this.getDocument());
        pvd.setAddress(new Address(this.getAddress().getType(),point));
        pvd.setCoverageArea(this.convertToCoverageArea());
        return pvd;
    }

    private CoverageArea convertToCoverageArea(){
        CoverageArea coverageArea = new CoverageArea();
        List<Point> pointList = new ArrayList<>();
        List<List<List<Point>>> multiPolygon = new ArrayList<>();

     //   this.getCoverageArea().getCoordinates().get(0).get(0).forEach(point -> { pointList.add(new Point(point.get(0), point.get(1))); });
        coverageArea.setType(this.coverageArea.getType());
   //     coverageArea.setCoordinates(multiPolygon);
        return coverageArea;
    }
}
