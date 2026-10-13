package dev.ritish.pgManager.service;

import org.springframework.stereotype.Service;

import dev.ritish.pgManager.dto.TenantRequestDto;
import dev.ritish.pgManager.dto.TenantResponseDto;
import dev.ritish.pgManager.entity.Tenant;
import dev.ritish.pgManager.mapper.TenantMapper;
import dev.ritish.pgManager.repository.TenantRepository;

@Service
public class TenantServiceImpl implements TenantService {
  TenantRepository tenantRepo;
  TenantMapper tenantMapper;

  public TenantServiceImpl(TenantMapper mapper, TenantRepository repo) {
    this.tenantRepo = repo;
    this.tenantMapper = mapper;

  }

  @Override
  public TenantResponseDto addTenant(TenantRequestDto tenantReq) {
    Tenant newTenant = tenantMapper.toEntity(tenantReq);

    Tenant save = tenantRepo.save(newTenant);

    return tenantMapper.toDto(save);
  }

}
