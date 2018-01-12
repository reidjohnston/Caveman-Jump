package gdxr.eid;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.Gdx;

public class Hero extends Sprite{
    public Hero(int nW, int nH, int nX, int nY){
        super(new Texture(Gdx.files.internal("Hero1.png")));
        setSize(nW, nH);
        setPosition(nX, nY);
        setFlip(false, true);
    }
}
