package alan.zerando.games.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import alan.zerando.games.model.ZerandoGames;
import alan.zerando.games.repository.ZerandoGamesRepository;

@Service
public class ZerandoGamesManager {

	@Autowired
	private ZerandoGamesRepository zerandoGamesRepository;
	
	public List<ZerandoGames> buscarGamesAzerar(){
		
		return zerandoGamesRepository.findAll();
	}
}
