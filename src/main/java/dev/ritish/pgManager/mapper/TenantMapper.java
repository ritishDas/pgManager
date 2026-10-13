package dev.ritish.pgManager.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import dev.ritish.pgManager.dto.TenantRequestDto;
import dev.ritish.pgManager.dto.TenantResponseDto;
import dev.ritish.pgManager.entity.Tenant;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TenantMapper {
  private final ModelMapper mapper;

  public Tenant toEntity(TenantRequestDto tenantReqDto) {
    return mapper.map(tenantReqDto, Tenant.class);
  }

  public TenantResponseDto toDto(Tenant tenant) {
    return mapper.map(tenant, TenantResponseDto.class);
  }

}

// package edu.learningspringboot.mapper;
//
// import edu.learningspringboot.dto.request.ProductRequestDto;
// import edu.learningspringboot.dto.response.ProductResponseDto;
// import edu.learningspringboot.entity.Product;
// import lombok.RequiredArgsConstructor;
// import org.modelmapper.ModelMapper;
// import org.springframework.stereotype.Component;
//
// @Component
// @RequiredArgsConstructor
// public class ProductMapper {
// private final ModelMapper mapper;
//
// public Product toEntity(ProductRequestDto productRequestDto) {
// return mapper.map(productRequestDto, Product.class);
// }
//
// public ProductResponseDto toDto(Product product) {
// return mapper.map(product, ProductResponseDto.class);
// }
//
// public void updateProduct(ProductRequestDto productRequestDto,
// Product product) {
//
// mapper.map(productRequestDto, product);
// }
//
// }
