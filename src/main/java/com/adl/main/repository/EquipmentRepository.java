package com.adl.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adl.main.model.EquipmentModel;

@Repository
public interface EquipmentRepository extends JpaRepository<EquipmentModel, Integer>{

	@Query(value = "Select * FROM equipment JOIN player ON player.id = equipment.idplayer WHERE player.id = ?1",nativeQuery = true)
	EquipmentModel getEquipmentByIDPlayer(String idPlayer);
	
	List<EquipmentModel> getEquipmentByArmor(String armor);
}
