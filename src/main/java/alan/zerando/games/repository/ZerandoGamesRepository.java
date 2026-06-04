package alan.zerando.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import alan.zerando.games.model.ZerandoGames;

public interface ZerandoGamesRepository extends JpaRepository<ZerandoGames, Long> {

}
