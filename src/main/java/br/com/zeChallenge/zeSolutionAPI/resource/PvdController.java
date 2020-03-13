package br.com.zeChallenge.zeSolutionAPI.resource;

import br.com.zeChallenge.zeSolutionAPI.domain.dto.PvdDto;
import br.com.zeChallenge.zeSolutionAPI.service.CoverageAreaService;
import br.com.zeChallenge.zeSolutionAPI.service.PvdService;
import br.com.zeChallenge.zeSolutionAPI.domain.Pvd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/pvds")
public class PvdController {

    @Autowired
    private PvdService pvdService;

    @Autowired
    private CoverageAreaService coverageAreaService;

    @PostMapping
    public ResponseEntity<Pvd>  createPvd(@RequestBody PvdDto dto){
        this.pvdService.createPvd(dto.convertToPvd());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Pvd>> getAllPvd(){
        return ResponseEntity.ok(this.pvdService.getAllPvds());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Pvd> getPvdById(@PathVariable Long id) {
        return ResponseEntity.ok(this.pvdService.buscarPorId(id).get());
    }

    @GetMapping("/byLocation")
    public Point getPvdByNearLocation(@RequestBody Point point){
        coverageAreaService.getByNearLocation(point);
        //TODO:Study and understand how multiPolygon works.
        return null;
    }
}
