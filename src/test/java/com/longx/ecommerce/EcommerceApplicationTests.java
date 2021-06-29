package com.longx.ecommerce;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.longx.ecommerce.entities.DanhMuc;
import com.longx.ecommerce.entities.DonHang;
import com.longx.ecommerce.entities.NguoiDung;
import com.longx.ecommerce.entities.VaiTro;
import com.longx.ecommerce.repository.DonHangRepository;
import com.longx.ecommerce.repository.NguoiDungRepository;
import com.longx.ecommerce.service.DanhMucService;
import com.longx.ecommerce.service.NguoiDungService;
import com.longx.ecommerce.service.SanPhamService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EcommerceApplicationTests {

    @Autowired
    private DanhMucService dmService;

    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private NguoiDungRepository ndRepo;

    @Autowired
    private DonHangRepository dhRepo;

    @Autowired
    private SanPhamService spService;


//	@Test
//	public void getALlDanhMucTest() {
//		System.out.println(dhRepo.test().size());
//	}

    @Test
    public void getALlDanhMucTest() {
        System.out.println(spService.getSanPhamByTenSanPhamForAdmin("asus",0,10).getContent().size());
    }

}
