package test;

import com.jme3.app.state.AbstractAppState;

/**
 * Created by Domenic on 31.03.2017.
 */
public class TestAppState extends AbstractAppState {

    private int x = 100;

    public void setX(int x) {}

    public void foo() {
        int x = 10;
    }

    public void foo2() {
        System.out.println("HALLO WELT!!!");
    }


  public int getX() {
    return x;
  }
}
