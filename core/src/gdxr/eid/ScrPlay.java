package gdxr.eid;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ScrPlay implements Screen {

    Game game;
    SpriteBatch batch;
    OrthographicCamera oc;
    Hero Hero1;

    public ScrPlay(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
        oc = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        oc.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        oc.update();
        batch = new SpriteBatch();
        Hero1 = new Hero(100, 100, Gdx.graphics.getWidth() / 2 - 50, Gdx.graphics.getHeight() - 100);

    }

    private void changeScreen() {
        if (Gdx.input.isKeyPressed(Input.Keys.M)) {
            game.setScreen(new ScrMenu(game));
        }
        if (Gdx.input.isKeyPressed(Input.Keys.C)) {
            game.setScreen(new ScrContr(game));
        }
    }
    
    

    @Override
    public void render(float f) {
        Gdx.gl.glClearColor(1, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        batch.begin();
        batch.setProjectionMatrix(oc.combined);
        Hero1.draw(batch);
        batch.end();
        changeScreen();
        KeyPressed();
    }

    public void KeyPressed () {      
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            Hero1.setY(Hero1.getY() - 5);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            Hero1.setY(Hero1.getY() + 5);
        }       
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
