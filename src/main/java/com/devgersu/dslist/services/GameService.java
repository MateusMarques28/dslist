package com.devgersu.dslist.services;

import com.devgersu.dslist.dto.GameMinDTO;
import com.devgersu.dslist.entities.Game;
import com.devgersu.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }
}
