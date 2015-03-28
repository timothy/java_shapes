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
     * @return returns a string of the shape square
     */
    @Override
    public String toString() {
        String s = "";
        String bodyLine = "";
        bodyLine = super.fullBody(super.height);
        label(height);

        for (int i = 0; i < super.height; i++) {
            if (super.getLine() == i) {
                String halfBody = super.halfBody(super.height);
                s += halfBody;
                s += super.getLabel();
                s += halfBody + "\n";
            } else {
                s += bodyLine + "\n";
            }
        }
        return s + "\n";
    }
}
