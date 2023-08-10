package com.jsp.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootcrud.dao.MobileDao;
import com.jsp.springbootcrud.dto.Mobile;

@Service
public class MobileService {
	
	@Autowired 
	MobileDao dao;
	
	public Mobile saveMobile(Mobile mobile) {
		return dao.saveMobile(mobile);
		
	}
	
	public List<Mobile> getAllMobiles() {
		return dao.getAllMobile();
	}
	
	public Mobile getMobileById(int id) {
		return dao.getMobileById(id);
	}
	
	public Mobile deletMobile(int id) {
		return dao.deleteById(id);
	}
	
	public Mobile updateMobile(Mobile mobile) {
		return dao.updateMobile(mobile);
		 
	}

}
