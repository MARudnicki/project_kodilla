package com.kodilla.ecommercee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDto {

    private long userId;
    private boolean isRealized;
    private List<com.kodilla.ecommercee.dto.ProductDto> products = new ArrayList<>();
}
