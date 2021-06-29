package com.longx.ecommerce.service;

import com.longx.ecommerce.entities.GioHang;
import com.longx.ecommerce.entities.NguoiDung;

public interface GioHangService {
	
	GioHang getGioHangByNguoiDung(NguoiDung n);
	
	GioHang save(GioHang g);
}
