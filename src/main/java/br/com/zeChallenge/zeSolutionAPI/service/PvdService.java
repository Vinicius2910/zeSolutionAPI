package br.com.zeChallenge.zeSolutionAPI.service;

import br.com.zeChallenge.zeSolutionAPI.domain.CoverageArea;
import br.com.zeChallenge.zeSolutionAPI.domain.Pvd;
import br.com.zeChallenge.zeSolutionAPI.exception.ResourceNotFoundException;
import br.com.zeChallenge.zeSolutionAPI.repository.PvdRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PvdService {

    @Autowired
    private PvdRepository pvdRepository;

    @Autowired
    private AddressService addressService;

    @Autowired
    private CoverageAreaService coverageAreaService;

    public void createPvd(Pvd pvd) {
        pvd.setAddress(this.addressService.createAddress(pvd.getAddress()));
        pvd.setCoverageArea(this.coverageAreaService.createCoverageArea(pvd.getCoverageArea()));
        this.pvdRepository.save(pvd);
    }

    public Optional<Pvd> buscarPorId(Long id) {
        verificarSePvdExiste(id);
        Pvd Pvd = this.pvdRepository.findById(id).get();
        return this.pvdRepository.findById(id);
    }

    private void verificarSePvdExiste(Long id) {
        if (!pvdRepository.existsById(id)) {
            throw new ResourceNotFoundException("Não existe PVD com o ID: " + id);
        }
    }

    public List<Pvd> getAllPvds() {
        return this.pvdRepository.findAll();
    }
}
