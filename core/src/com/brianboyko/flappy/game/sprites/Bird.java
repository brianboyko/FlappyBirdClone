package com.brianboyko.flappy.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;


/**
 * Created by brianboyko on 11/12/15.
 */

public class Bird {
    private static final int GRAVITY = -15;
    private static final int MOVEMENT = 100;


    private Vector3 position;
    private Vector3 velocity;
    private Texture bird;

    public Bird(int x, int y){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0, 0, 0);
        bird = new Texture("bird.png");
    }

    public void update(float dt){
        if (position.y > 0){
            velocity.add(0, GRAVITY, 0);
        }
        velocity.scl(dt); // scale by delta time.
        position.add(0, velocity.y, 0);
        velocity.scl(1/dt);
        position.add(MOVEMENT * dt, velocity.x, 0);

        if (position.y < 0){
            position.y = 0;
        }


    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return bird;
    }

    public void jump(){
        velocity.y = 250;
    }
}