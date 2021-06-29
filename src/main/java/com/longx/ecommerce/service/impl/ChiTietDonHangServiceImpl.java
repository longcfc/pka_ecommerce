package com.longx.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longx.ecommerce.entities.ChiTietDonHang;
import com.longx.ecommerce.repository.ChiMucGioHangRepository;
import com.longx.ecommerce.repository.ChiTietDonHangRepository;
import com.longx.ecommerce.service.ChiTietDonHangService;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService{
	
	@Autowired
	private ChiTietDonHangRepository repo;
	
	@Override
	public List<ChiTietDonHang> save(List<ChiTietDonHang> list)
	{	
		return repo.saveAll(list);
	}
}
