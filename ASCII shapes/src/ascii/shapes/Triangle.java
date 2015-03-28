/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

/**
 * @author tbrad_000
 */
public class Triangle extends Shapes {

    Triangle() {
        super();
        super.shape = "triangle";
    }

    /**
     * @param height this is the total height of the shape
     * @param width this is the current height of the shape
     * @return this is a string that holds blank space to center the shape
     */
    public String spacer(int height) {
        String s = "";

        for (int i = 0; i < height; i++) {
            s += " ";
        }
        return s;
    }

    /**
     * @return The string of the shape
     */
    @Override
    public String toString() {
        String triangle = "";
        String space = spacer(height);
        boolean on = true;
        String halfBody = halfBody(height);
        int count = 1;
        String fullBody = fullBody(height);

        for (int width = 1; width <= height; width++) {
            triangle += space.substring(width - 1); // this is much faster. insted of looping (height - width)  every time it just O(1) == string - char

            if (line == width) {
                label(width);
                halfBody = halfBody(width);
                if (line % 2 == 0) {
                    triangle += halfBody;
                    triangle += super.getLabel();
                    triangle += halfBody;
                } else {
                    triangle += halfBody;
                    triangle += " " + super.getLabel() + " ";
                    triangle += halfBody;
                }
            } else {
                triangle += fullBody.substring((fullBody.length()) - count);
            }
            triangle += "\n";
            if (count == 18) {
                count += 1;
            } else {
                count += 2;
            }
        }

        return triangle;
    }
}
