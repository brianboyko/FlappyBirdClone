package com.brianboyko.flappy.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by brianboyko on 11/12/15.
 */
public abstract class State {
    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();
    }

    protected abstract void handleInput();
    public abstract void update(float dt); // delta time
    public abstract void render(SpriteBatch sb); // all the stuff we need to render to the screen.
    public abstract void dispose(); // because we want to drop the stuff we're done with out of memory.
}
