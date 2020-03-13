package br.com.zeChallenge.zeSolutionAPI.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class CoverageAreaDto {
    private String type;
    private List<List<List<List<Integer>>>> coordinates;

}
