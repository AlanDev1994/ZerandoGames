package alan.zerando.games.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import alan.zerando.games.manager.ZerandoGamesManager;
import alan.zerando.games.model.DefaultResponse;
import alan.zerando.games.model.ZerandoGames;

@RestController
public class ZerandoGamesController {

	@Autowired
	private ZerandoGamesManager zerandoGamesManager;
	
	@GetMapping("/get-games-zerar")
	public List<ZerandoGames> buscarGamesAzerar(){
		return zerandoGamesManager.buscarGamesAzerar();
	}
	
	@DeleteMapping("/delete-game")
	public void deletarGame(Long idGame) {
		zerandoGamesManager.excluirGame(idGame);
	}
	
	@PostMapping("/criar-novo-game")
	public ResponseEntity<DefaultResponse> criarNovoGame(@RequestBody ZerandoGames zerandoGames){
		
		DefaultResponse response = new DefaultResponse();
		
		try {
			response.setData(zerandoGamesManager.criarNovoGame(zerandoGames));
			response.setStatus(HttpStatus.CREATED.value());
			response.setMsg("Game Criado com sucesso");
			
		}catch (Exception e) {
			response.setMsg("Erro ao criar game");
			response.setDataHora(LocalDateTime.now());
			response.setStatus(HttpStatus.NOT_FOUND.value());
		}
		
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}
	
}
