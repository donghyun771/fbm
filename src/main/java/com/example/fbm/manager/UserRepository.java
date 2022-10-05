package com.example.fbm.manager;

import com.example.fbm.player.Player;

public interface UserRepository {
    void save(Player player);

    void delete(Long player_id);

    void modify(Player player);

    Player findByPlayer_id(Long player_id);
}
