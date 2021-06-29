package com.longx.ecommerce.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.longx.ecommerce.entities.HangSanXuat;

public interface HangSanXuatService {

	List<HangSanXuat> getALlHangSX();
	
	Page<HangSanXuat> getALlHangSX(int page, int size);

	HangSanXuat getHSXById(long id);

	HangSanXuat save(HangSanXuat h);

	HangSanXuat update(HangSanXuat h);

	void deleteById(long id);
}
