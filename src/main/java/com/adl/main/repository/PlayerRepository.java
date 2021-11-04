package com.adl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adl.main.model.PlayerModel;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel, Integer>{

	@Query(value="select * from player where username = ?1",nativeQuery = true)
	PlayerModel getPlayerUsername(String username);
//	@Query("select p from PlayerModel p where p.username = ?1")
//	PlayerModel getPlayerUsername(String username);
}
