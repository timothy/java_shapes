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

    protected String halfBody = "";
    protected String fullBody = "";
    protected String space = "";
    protected String label = "";

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
        this.fullBody = super.fullBody(super.height);
        this.space = spacer(super.height);
        String triangle = "";
        boolean on = true;
        int count = 1;

        for (int width = 1; width <= super.height; width++) {
            triangle += this.space.substring(width - 1); // this is much faster. insted of looping (height - width)  every time it just O(1) == string - char

            if (super.line == width) {
                label(width);

                this.halfBody = halfBody(width);
                this.label = super.getLabel();

                triangle += this.halfBody;
                triangle += this.label;
                triangle += this.halfBody;

            } else {
                triangle += this.fullBody.substring((this.fullBody.length()) - count);
            }
            triangle += "\n";
            count += 2;
        }
        return triangle;
    }
}
