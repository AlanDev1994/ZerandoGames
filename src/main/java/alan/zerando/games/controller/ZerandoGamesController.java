package alan.zerando.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import alan.zerando.games.manager.ZerandoGamesManager;
import alan.zerando.games.model.ZerandoGames;

@RestController
public class ZerandoGamesController {

	@Autowired
	private ZerandoGamesManager zerandoGamesManager;
	
	@GetMapping("/get-games-zerar")
	public List<ZerandoGames> buscarGamesAzerar(){
		return zerandoGamesManager.buscarGamesAzerar();
	}
	
}
