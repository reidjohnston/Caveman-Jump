/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gdxr.eid;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 *
 * @author johnr5818
 */

public class ScrMenu implements Screen{
    Game game;
    public ScrMenu(Game game){
       this.game = game;
    }
    @Override
    public void show() {
        return;
    }

    @Override
    public void render(float f) {
        Gdx.gl.glClearColor( 1, 0, 0, 1 );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
        
    }

    @Override
    public void resize(int i, int i1) {
        return;
    }

    @Override
    public void pause() {
        return;
    }

    @Override
    public void resume() {
        return;
    }

    @Override
    public void hide() {
        return;
    }

    @Override
    public void dispose() {
        return;
    }
    
}
