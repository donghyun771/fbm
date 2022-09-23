package com.example.fbm.player;

public interface PlayerService {

    void addPlayer(Player player);

    Player findPlayer(Long player_id);

    void modifyPlayer(Player player);

    void deletePlayer(Long player_id);

}
