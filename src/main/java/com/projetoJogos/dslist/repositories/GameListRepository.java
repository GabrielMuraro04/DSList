package com.projetoJogos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoJogos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
