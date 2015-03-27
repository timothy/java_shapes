/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

/**
 * @author tbrad_000
 */
public class GoodShapeInput extends Goodinput {

    GoodShapeInput() {
        super();
    }

    public char GoodBody(char newBody) {
        try {
            if (newBody == ' ') {
                return 'x';
            } else {
                return newBody;
            }
        } catch (Exception e) {
            System.out.print("There is something wrong with this input please give me a different character again\n");
            GoodBody(charClean());
        }
        return 'x';
    }

    public String GoodShape(String s) {
        try {
            if ("diamond".equals(s) || "square".equals(s) || "triangle".equals(s)) {
                return s;
            } else {
                throw new ShapeException();
            }
        } catch (ShapeException ex) {
            System.out.printf("The shape of " + s + " is not a valid shape\nplease enter one of the following shapes\n"
                    + "   Diamond\n   Square\n   Triangle\n");
            GoodShape(super.stringClean().toLowerCase());
            return "triangle";
        }
    }

    public int GoodHeight(int height) {
        try {
            if (height < 0 || height == 1 || height > 250) {
                throw new ShapeException();
            } else if (height == 0) {
                return 10;
            } else {
                return height;
            }
        } catch (ShapeException ex) {
            System.out.printf("The height of %d is too small or too large\nPlease try something bigger than 1 and less than 250\n", height);
            GoodHeight(super.intClean());
            return 10;
        }
    }

    public int GoodLine(int line, String shape, int height) {
        try {
            if ("diamond".equals(shape) && height >= line) {
                throw new DiamondException();
            } else if (line > height || line < 0) {
                throw new ShapeException();
            } else {
                return line;
            }
        } catch (ShapeException ex) {
            System.out.printf("This shape does not have %d lines\nTry something smaller than %d\n", line, height);
            GoodLine(super.intClean(), shape, height);
            return 4;
        } catch (DiamondException d) {
            System.out.print("as you get closer to the top of a diamond it gets smaller this is the tip of your label try a smaller line\n");
            GoodLine(super.intClean(), shape, height);
            return 4;
        }
    }

    public String GoodLabel(String label, String shape, int line, int height) {
        int lineWidth = height - line;// this is for readability
        int halfHeight = height / 2;// this is for readability
        try {
            if ("diamond".equals(shape) && line > halfHeight && label.length() > lineWidth) {
                throw new DiamondException();
            } else if (label.length() > line) {
                throw new ShapeException();
            } else if (label.equals(" ") || label.equals("") || label.toLowerCase().equals("default")) {
                return "LU";
            } else {
                return label;
            }
        } catch (ShapeException ex) {
            System.out.printf("The label \"" + label + "\"\n is too big to fit on line %d. Try a word smaller then %d letters\n", line, height);
            GoodLabel(super.stringClean(), shape, line, height);
            return "LU";
        } catch (DiamondException d) {
            System.out.print("as you get closer to the top of a diamond it gets smaller and your label is too large for this line height\n");
            GoodLabel(super.stringClean(), shape, line, height);
            return "LU";
        }
    }

}

class ShapeException extends Exception {

    //Parameterless Constructor
    public ShapeException() {
    }

    //Constructor that accepts a message
    public ShapeException(String message) {
        super(message);
    }
}

class DiamondException extends Exception {

    //Parameterless Constructor
    public DiamondException() {
    }

    //Constructor that accepts a message
    public DiamondException(String message) {
        super(message);
    }
}

class TriangleException extends Exception {

    //Parameterless Constructor
    public TriangleException() {
    }

    //Constructor that accepts a message
    public TriangleException(String message) {
        super(message);
    }
}
