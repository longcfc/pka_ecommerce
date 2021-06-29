package com.longx.ecommerce.service;

import java.util.List;

import com.longx.ecommerce.entities.VaiTro;

public interface VaiTroService {

	VaiTro findByTenVaiTro(String tenVaiTro);
	List<VaiTro> findAllVaiTro();
}
