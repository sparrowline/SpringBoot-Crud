package com.jsp.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootcrud.dto.Mobile;
import com.jsp.springbootcrud.service.MobileService;

@RestController
public class MobileController {
	
	@Autowired
	MobileService mobileService ;
	
	@PostMapping("/mobile")
	public Mobile saveMobile(@RequestBody Mobile mobile) {
		return mobileService.saveMobile(mobile);
	}
	
	@GetMapping("/mobile")
	public List<Mobile> getAllMobile(){
		return mobileService.getAllMobiles();
	}
	
	
	@GetMapping("/mobile/{id}")
	public Mobile getMobileById(@PathVariable int id) {
		return mobileService.getMobileById(id);
	}
	
	@DeleteMapping("/mobile/{id}")
	public Mobile deleteMobile(@PathVariable int id) {
		return mobileService.deletMobile(id);
	}
	
	@PutMapping("/mobile/{id}")
	public Mobile updateMobile(@RequestBody Mobile mobile) {
		return mobileService.updateMobile(mobile);
	}


	
}
