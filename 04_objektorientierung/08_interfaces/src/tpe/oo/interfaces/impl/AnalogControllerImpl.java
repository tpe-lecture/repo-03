package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

        private double x;
        private double y;

        @Override
        public void up(double p) {
            y=y-p;

        }

        @Override
        public void down(double p) {
            y=y+p;

        }

        @Override
        public void left(double p) {
            x=x-p;

        }

        @Override
        public void right(double p) {
            x=x+p;

        }

        @Override
        public Point getPosition() {
            return new Point ((int) x,(int) y);
        }
}
