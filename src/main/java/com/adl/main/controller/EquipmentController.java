package com.adl.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adl.main.model.EquipmentModel;
import com.adl.main.model.PlayerModel;
import com.adl.main.repository.EquipmentRepository;
import com.adl.main.repository.PlayerRepository;

@RestController
public class EquipmentController {

	@Autowired
	EquipmentRepository equipRepo;
	
	@GetMapping("/equipment")
	public List<EquipmentModel> getEquipmentWithPlayer (){
		List<EquipmentModel> lstEquip = equipRepo.findAll();
		return lstEquip;
	}
	
	@GetMapping("/equipment/{id}")
	public EquipmentModel getEquipmentByIDPlayer (@PathVariable("id") String idplayer){
		EquipmentModel lstEquip = equipRepo.getEquipmentByIDPlayer(idplayer);
		return lstEquip;
	}
	
	@GetMapping("/equipment/armor/{armor}")
	public List<EquipmentModel> getEquipmentByArmor (@PathVariable("armor") String armor){
		List<EquipmentModel> lstEquip = equipRepo.getEquipmentByArmor(armor);
		return lstEquip;
	}

	@PostMapping("/equipment/save")
	public EquipmentModel saveEquipment(@RequestBody EquipmentModel data) {
		return equipRepo.save(data);
	}
	
	@PostMapping("/equipment/save/{id}")
	public EquipmentModel saveEquipmentId(@PathVariable("id") int idplayer, @RequestBody EquipmentModel data) {
		PlayerModel player = new PlayerModel();
		player.setId(idplayer);
		data.setIdplayer(player);
		return equipRepo.save(data);
	}
}
