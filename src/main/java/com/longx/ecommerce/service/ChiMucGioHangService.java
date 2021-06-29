package com.longx.ecommerce.service;

import java.util.List;

import com.longx.ecommerce.entities.ChiMucGioHang;
import com.longx.ecommerce.entities.GioHang;
import com.longx.ecommerce.entities.SanPham;

public interface ChiMucGioHangService{
	
	List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g);
	
	ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp,GioHang g);
	
	ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c);
	
	void deleteChiMucGiohang(ChiMucGioHang c);
	
	void deleteAllChiMucGiohang(List<ChiMucGioHang> c);
	
}
