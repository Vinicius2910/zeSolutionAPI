package br.com.zeChallenge.zeSolutionAPI.service;

import br.com.zeChallenge.zeSolutionAPI.domain.CoverageArea;
import br.com.zeChallenge.zeSolutionAPI.repository.CoverageAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class CoverageAreaService {

    @Autowired
    private CoverageAreaRepository coverageAreaRepository;

    public CoverageArea createCoverageArea(CoverageArea coverageArea) {
        return this.coverageAreaRepository.save(coverageArea);
    }

    public void getByNearLocation(Point point) {
        List<CoverageArea> coverageAreaList = coverageAreaRepository.findAll();
//        coverageAreaList.forEach(polygon -> polygon.getCoordinates().getBounds().);
    }
}
