package com.projetoJogos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoJogos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
