 package test;

import com.jme3.app.SimpleApplication;
import com.jme3.bullet.BulletAppState;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * ja nein
 * @author ok diesmal ist es vielleicht Domenic ein bisschen mehr und noch mehr
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);
        geom.setLocalTranslation(1, 0, 1);

        // added comment

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geom.setMaterial(mat);

        rootNode.attachChild(geom);

        Spatial s = assetManager.loadModel("Models/Test.j3o");

        BulletAppState bulletAppState = new BulletAppState();
        stateManager.attach(bulletAppState);

        s.addControl(new RigidBodyControl(10));
        bulletAppState.getPhysicsSpace().add(s);

        rootNode.attachChild(s);
    }

    @Override
    public void simpleUpdate(float tpf) {
        rootNode.getChild(0).rotate(1 * FastMath.DEG_TO_RAD, 0, 0);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
