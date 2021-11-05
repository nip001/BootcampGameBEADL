package com.adl.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adl.main.model.EquipmentModel;
import com.adl.main.repository.EquipmentRepository;

@RestController
public class EquipmentController {

	@Autowired
	EquipmentRepository equipRepo;
	
	@GetMapping("/equipment")
	public List<EquipmentModel> getEquipmentWithPlayer (){
		List<EquipmentModel> lstEquip = equipRepo.findAll();
		return lstEquip;
	}
}
