package br.com.zeChallenge.zeSolutionAPI.repository;

import br.com.zeChallenge.zeSolutionAPI.domain.Pvd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PvdRepository extends JpaRepository<Pvd,Long> {
}
