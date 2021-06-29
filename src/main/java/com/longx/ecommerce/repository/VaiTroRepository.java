package com.longx.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.longx.ecommerce.entities.VaiTro;

public interface VaiTroRepository extends JpaRepository<VaiTro, Long> {

	VaiTro findByTenVaiTro(String tenVaiTro);
}
