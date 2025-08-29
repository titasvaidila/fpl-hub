package fpl_hub.fplhub.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    void deleteByName(String playerName);

    Optional<Player> findByName(String name);
    // Optional to handle cases where no player is found
}
