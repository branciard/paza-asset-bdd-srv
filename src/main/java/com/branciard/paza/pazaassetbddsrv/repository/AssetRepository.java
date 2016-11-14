package com.branciard.paza.pazaassetbddsrv.repository;

import com.branciard.paza.pazaassetbddsrv.domain.Asset;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Asset entity.
 */
@SuppressWarnings("unused")
public interface AssetRepository extends JpaRepository<Asset,Long> {

}
