package gdxr.eid;

import com.badlogic.gdx.Game;

public class GdxGame extends Game {

    @Override
    public void create() {
        this.setScreen(new ScrMenu(this));
        //this.setScreen(new ScrPlay(this));
    }

    @Override
    public void render() {
        super.render();
    }
}
