/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

import java.util.ArrayList;

/**
 *
 * @author tbrad_000
 */
class TriangleException extends Exception {

    //Parameterless Constructor
    public TriangleException() {
    }

    //Constructor that accepts a message
    public TriangleException(String message) {
        super(message);
    }
}

public class Triangle extends Shapes {

    Triangle() {
        super();
        super.shape = "triangle";
    }

    /**
     *
     * @param body what the shape is made out of
     * @param line where the label shows up
     * @param label what label is to be shown
     * @param shape the shape to be shown
     */
    Triangle(char body, int line, String label, String shape) {
        super(body, line, label, shape);
    }
//    Triangle(char body, int line, String label, String shape) {
//        super(body, line, label, shape);
//        try {
//            if (label.length() > line) {
//                throw new TriangleException();
//            } else {
//
//            }
//        } catch (TriangleException ex) {
//            System.out.println("Both height and width need to be greater than or eqaul 0 to form a Rectangle\n");
//        }
//
//    }

    /**
     *
     * @param height this is the total height of the shape
     * @param width this is the current height of the shape
     * @return this is a string that holds blank space to center the shape
     */
    public String spacer(int height, int width) {
        String s = "";

        for (int i = 0; i < height - (width); i++) {
            s += " ";
        }
        return s;
    }

    /**
     *
     * @return The string of the shape
     */
    @Override
    public String toString() {
        String tiangle = "";

        boolean on = true;

        for (int width = 1; width <= height; width++) {
            tiangle += spacer(height, width);

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
