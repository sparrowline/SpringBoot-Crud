package com.jsp.springbootcrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootcrud.dto.Mobile;
import com.jsp.springbootcrud.repository.MobileRepository;

@Repository
public class MobileDao {

	@Autowired
	MobileRepository mobileRepository;

	public Mobile saveMobile(Mobile mobile) {
		return mobileRepository.save(mobile);

	}

	public List<Mobile> getAllMobile() {
		return mobileRepository.findAll();
	}

	public Mobile getMobileById(int id) {
		Optional<Mobile> optional = mobileRepository.findById(id);
		return optional.get();
	}

	public Mobile deleteById(int id) {
		Optional<Mobile> optional = mobileRepository.findById(id);
		if (optional != null) {
			mobileRepository.delete(optional.get());
		}
		return optional.get();
	}

	public Mobile updateMobile(Mobile mobile) {
		Optional<Mobile> optional = mobileRepository.findById(mobile.getId());
		if (optional != null) {
			return mobileRepository.save(mobile);
		}
		return null;
	}
	
	

}
