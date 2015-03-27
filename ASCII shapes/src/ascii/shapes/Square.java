/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

/**
 *
 * @author tbrad_000
 */
public class Square extends Shapes {

    Square() {
        super();
        super.shape = "square";
    }
/**
 * 
 * @param body what the shape is made out of
 * @param line where the label shows up
 * @param label what label is to be shown
 * @param shape the shape to be shown
 */
    Square(char body, int line, String label, String shape) {
        super(body, line, label, shape);
    }
/**
 * 
 * @return returns a string of the shape square
 */
    @Override
    public String toString() {
        String s = "";
        label(height);
        if (super.getLine() == 1) {
            s += super.halfBody(height);
            s += super.getLabel() + " ";
            s += super.halfBody(height);
        }
        String bodyLine = "";
        for (int i = 0; i < height; i++) {
            if (height - i == 1) {
                bodyLine += super.getBody() + "";
            } else {
                bodyLine += super.getBody() + " ";
            }
        }
        String temp = bodyLine;
        int add = 0;
        if (super.getLine() != 1) {
            add = height + 1;
        } else {
            add = height;
        }
        for (int q = 1; q < add; q++) {
            if (super.getLine() == q && super.getLine() != 1) {
                s += "\n" + super.halfBody(height) + " ";
                s += super.getLabel();
                s += " " + super.halfBody(height);
            } else if (q == 1) {
                s += temp;
            } else {
                s += "\n" + temp;
            }
        }

        return s + "\n";
    }
}
