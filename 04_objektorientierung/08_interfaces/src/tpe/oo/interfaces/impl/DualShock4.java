package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController,DigitalController{

    private AnalogController analog = new AnalogControllerImpl();
    private DigitalController digital = new DigitalControllerImpl();
    @Override
    public void up() {
        digital.up();
        
    }
    @Override
    public void down() {
        digital.down();
        
    }
    @Override
    public void left() {
        digital.left();
        
    }
    @Override
    public void right() {
        digital.right();
        
    }
    @Override
    public void up(double p) {
        analog.up(p);
        
    }
    @Override
    public void down(double p) {
        analog.down(p);
        
    }
    @Override
    public void left(double p) {
        analog.left(p);
        
    }
    @Override
    public void right(double p) {
        analog.right(p);
        
    }
    @Override
    public Point getPosition() {
        return new Point((int)(analog.getPosition().getX()+digital.getPosition().getX()),
                         (int)(analog.getPosition().getY()+digital.getPosition().getY()));
    }
    
    
   

}
