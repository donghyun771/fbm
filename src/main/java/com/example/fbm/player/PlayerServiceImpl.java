package com.example.fbm.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    @Override
    public void addPlayer(Player player) {
        playerRepository.save(player);
    }

    @Override
    public Player findPlayer(Long player_id) {
        return playerRepository.findByPlayer_id(player_id);
    }

    @Override
    public void modifyPlayer(Player player) {
        playerRepository.modify(player);
    }

    @Override
    public void deletePlayer(Long player_id) {
        playerRepository.delete(player_id);
    }
}
