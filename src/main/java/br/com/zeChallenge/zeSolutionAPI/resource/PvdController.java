package br.com.zeChallenge.zeSolutionAPI.resource;

import br.com.zeChallenge.zeSolutionAPI.domain.dto.PvdDto;
import br.com.zeChallenge.zeSolutionAPI.service.PvdService;
import br.com.zeChallenge.zeSolutionAPI.domain.Pvd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pvds")
public class PvdController {

    @Autowired
    private PvdService pvdService;

    @PostMapping
    public ResponseEntity<Pvd>  createPvd(@RequestBody PvdDto dto){
        this.pvdService.createPvd(dto.convertToPvd());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pvd> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(this.pvdService.buscarPorId(id).get());
    }
}
