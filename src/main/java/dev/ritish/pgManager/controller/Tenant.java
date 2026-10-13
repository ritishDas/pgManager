package dev.ritish.pgManager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.ritish.pgManager.dto.ApiResponseDto;
import dev.ritish.pgManager.dto.TenantRequestDto;
import dev.ritish.pgManager.service.TenantService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Tenant {

  private final TenantService tenantService;

  @PostMapping
  public ResponseEntity<?> addTenant(
      @RequestBody @Valid TenantRequestDto tenantRequestDto,
      HttpServletRequest request) {

    return ResponseEntity.status(HttpStatus.CREATED.value())
        .body(ApiResponseDto.success(
            "Product added successfully",
            HttpStatus.CREATED.value(),
            tenantService.addTenant(tenantRequestDto),
            request.getRequestURI()));
  }

}
