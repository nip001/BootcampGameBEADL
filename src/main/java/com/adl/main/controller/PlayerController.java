package com.adl.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adl.main.model.PlayerModel;
import com.adl.main.repository.PlayerRepository;

@RestController
public class PlayerController {
	@Autowired
	PlayerRepository playerRepo;

	@GetMapping("/")
	public List<PlayerModel> getAllPlayer() {
		List<PlayerModel> lstPlayer = playerRepo.findAll();
		return lstPlayer;
	}
	
	@GetMapping("/{username}")
	public PlayerModel getPlayerUsername(@PathVariable("username") String username) {
		PlayerModel player = playerRepo.getPlayerUsername(username);
		return player;
	}
	

	@GetMapping("/search")
	public PlayerModel getPlayerUsernameRequest(@RequestParam(value="username") String username) {
		PlayerModel player = playerRepo.getPlayerUsername(username);
		return player;
	}
}
