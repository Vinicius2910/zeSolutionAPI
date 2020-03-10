package br.com.zeChallenge.zeSolutionAPI.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class AddressDto {
    private String type;
    private List<Double> coordinates;
}
