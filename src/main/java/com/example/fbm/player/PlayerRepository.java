package com.example.fbm.player;

public interface PlayerRepository {

    void save(Player player);

    void delete(Long player_id);

    void modify(Player player);

    Player findByPlayer_id(Long player_id);

}
