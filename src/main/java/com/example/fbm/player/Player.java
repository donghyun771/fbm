package com.example.fbm.player;

public class Player {

    private long player_id;

    private String player_nm;

    private String backNum;

    private Position position;

    public long getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(long player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_nm() {
        return player_nm;
    }

    public void setPlayer_nm(String name) {
        player_nm = name;
    }

    public String getBackNum() {
        return backNum;
    }

    public void setBackNum(String backNum) {
        this.backNum = backNum;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
