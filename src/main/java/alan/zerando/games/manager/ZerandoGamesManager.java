package alan.zerando.games.manager;

import java.util.List;
import java.util.Objects;

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
	
	public ZerandoGames criarNovoGame(ZerandoGames zerandoGames) {
		
		if (Objects.isNull(zerandoGames.getDataInicio())
		        || Objects.isNull(zerandoGames.getNomeGame())
		        || zerandoGames.getNomeGame().isBlank()
		        || zerandoGames.getGenero().isBlank()
		        || zerandoGames.getTipo().isBlank()) {

		    throw new IllegalArgumentException("Todos os campos são obrigatórios");
		}
		
		zerandoGamesRepository.save(zerandoGames);
		
		return zerandoGames;
	}
	
	public void excluirGame(Long idGame) {
		zerandoGamesRepository.deleteById(idGame);
	}
	
	public void editarGame(ZerandoGames zerandoGames) {
		zerandoGamesRepository.save(zerandoGames);
	}
}
