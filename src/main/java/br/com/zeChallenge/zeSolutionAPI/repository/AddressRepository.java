package br.com.zeChallenge.zeSolutionAPI.repository;

import br.com.zeChallenge.zeSolutionAPI.domain.Address;
import br.com.zeChallenge.zeSolutionAPI.domain.CoverageArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
