package com.github.KunshuZ.celestialcataclysm.engine;

public class Camera {   
    int x;
    int y;
    
    public Camera(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int x(){
        return x;
    }
    public int y(){
        return y;
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }
}