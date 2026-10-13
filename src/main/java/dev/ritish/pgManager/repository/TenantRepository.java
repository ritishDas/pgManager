package dev.ritish.pgManager.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import dev.ritish.pgManager.entity.Tenant;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {

}
