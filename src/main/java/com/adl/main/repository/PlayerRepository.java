package com.adl.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adl.main.model.PlayerModel;
import com.adl.main.model.ResponsePlayer;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel, Integer>{

	@Query(value="select * from player where username = ?1",nativeQuery = true)
	PlayerModel getPlayerUsername(String username);


	@Query(value = "select p.username,p.level from player p where kelas = ?1"
			,nativeQuery = true)
	List<ResponsePlayer> getPlayerByKelas(String kelas);

	
//	@Query("select p from PlayerModel p where p.username = ?1")
//	PlayerModel getPlayerUsername(String username);
}
