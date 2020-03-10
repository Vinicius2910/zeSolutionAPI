package br.com.zeChallenge.zeSolutionAPI.service;

import br.com.zeChallenge.zeSolutionAPI.domain.Address;
import br.com.zeChallenge.zeSolutionAPI.domain.CoverageArea;
import br.com.zeChallenge.zeSolutionAPI.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createCoverageArea(Address address){
        return addressRepository.save(address);
    }
}
