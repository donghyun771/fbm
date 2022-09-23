package com.example.fbm.player;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class MemoryPlayerRepository implements PlayerRepository{

    private static Map<Long, Player> playerMap = new ConcurrentHashMap<>();

    @Override
    public void save(Player player) {
        playerMap.put(player.getPlayer_id(), player);
    }

    @Override
    public void delete(Long player_id) {
        playerMap.clear();
    }

    @Override
    public void modify(Player player) {
        playerMap.put(player.getPlayer_id(), player);
    }

    @Override
    public Player findByPlayer_id(Long player_id) {
        return playerMap.get(player_id);
    }
}
