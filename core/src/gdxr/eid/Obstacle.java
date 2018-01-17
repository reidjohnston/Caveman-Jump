
package gdxr.eid;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 *
 * @author johnr5818
 */
public class Obstacle extends Sprite{
   int nX, nY, nW, nH;
    public Obstacle(int _nX, int _nY, int _nW, int _nH, String sFile){
        super(new Texture(Gdx.files.internal(sFile)));
        nX = _nX;
        nY = _nY;
        nW = _nW;
        nH = _nH;
        setPosition(nX, nY);
        setFlip(false, true);
        setSize(nW, nH);
    }
    public boolean isHit(){
        if(this.getBoundingRectangle().contains(Gdx.input.getX(), Gdx.input.getY())){ 
            return true;
        }
       return false;
    }
}

