package dev.ritish.pgManager.service;

import dev.ritish.pgManager.dto.TenantResponseDto;
import dev.ritish.pgManager.dto.TenantRequestDto;

public interface TenantService {

  public TenantResponseDto addTenant(TenantRequestDto tenantReq);

}
