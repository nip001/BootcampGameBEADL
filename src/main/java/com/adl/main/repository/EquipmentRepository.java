package com.adl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adl.main.model.EquipmentModel;

@Repository
public interface EquipmentRepository extends JpaRepository<EquipmentModel, Integer>{

}
