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
        String tiangle = "";
        String space = spacer(height);
        boolean on = true;

        for (int width = 1; width <= height; width++) {
            
            tiangle += space.substring(width - 1); // this is much faster. insted of looping (height - width)  every time it just O(1) == string - char
            
            for (int charCount = 1; charCount < width * 2; charCount++) {
                if (on) {
                    if (width == super.getLine()) {
                        label(width);
                        tiangle += halfBody(width);

                        if (super.getLine() % 2 == 0) {
                            tiangle += " ";
                            tiangle += super.getLabel();
                            tiangle += " ";
                        } else {
                            tiangle += super.getLabel();
                        }
                        tiangle += halfBody(width);
                        break;
                    } else {
                        tiangle += super.getBody();
                    }
                    on = false;
                } else {
                    tiangle += " ";
                    on = true;
                }
            }
            on = true;
            tiangle += "\n";
        }
        return tiangle;
    }
}
