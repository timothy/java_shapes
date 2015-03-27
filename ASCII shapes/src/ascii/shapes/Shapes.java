/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

import java.util.Scanner;

/**
 *
 * @author tbrad_000
 */
public class Shapes {

    protected char body;// What character the shape is made out of
    protected String shape = ""; // the shape of the ASCII
    protected int height;
    protected int line;
    protected String label;

    /**
     * default constructor
     */
    Shapes() {
        this.body = '8';
        this.label = "LU";
        this.line = 4;
        this.height = 10;
    }

    /**
     *
     * @param body the char that the body is made out of
     * @param line what line the label will be displayed on
     * @param label a label to be displayed in the shape
     * @param shape the shape that the user chooses
     */
    Shapes(char body, int line, String label, String shape) {
        this.body = body;
        this.label = label.toUpperCase();
        this.line = line;
        this.shape = shape;
    }

    /**
     *
     * @param width this is the current width of the shape
     */
    protected void label(int width) {
        String s = "";
        for (int b = 0; b < getLabel().length(); b++) {
            if (b != (getLabel().length() - 1)) {// if it is not the last char
                s += getLabel().charAt(b) + " ";
            } else {
                s += getLabel().charAt(b) + "";
            }
        }
        this.label = s;
    }

    /**
     *
     * @param width this is the height of the body of square, triangle and half
     * height for diamond
     *
     * @return This will return a string to be put on each side of the label
     */
    protected String halfBody(int width) {
        boolean on = true;
        String s = "";

        int half = (((width * 2) - 1) - this.getLabel().length()) / 2;

        for (int z = 0; z < half; z++) {
            if (on) {
                s += getBody();
                on = false;
            } else if (half - 1 == z) {
                break;
            } else {
                s += " ";
                on = true;
            }
        }
        return s;
    }

    /**
     * @return the body
     */
    public char getBody() {
        return body;
    }

    public void bodyMessage() {
        System.out.print("Please give me the character you would like me to build your shape with.\n");
    }

    /**
     *
     * @param newBody this is a char that the body of the shape will be made out
     * of
     */
    public void setBody(char newBody) {
        try {
            if (body == ' ') {
                this.body = 'X';
            } else {
                this.body = newBody;
            }
        } catch (Exception e) {
            System.out.print("There is something wrong with this input please give me a different character again\n");
            setBody(new Scanner(System.in).next().charAt(0));
        }
    }

    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    public void shapeMessage() {
        System.out.print("What shape would you like to print?\n");
    }

    /**
     * the shape to set
     */
    public void setShape(String s) {
        try {
            if ("diamond".equals(s) || "square".equals(s) || "triangle".equals(s)) {
                this.shape = s;

            } else {
                throw new ShapeException();
            }
        } catch (ShapeException ex) {
            System.out.printf("The shape of " + s + " is not a valid shape\nplease enter one of the following shapes\n"
                    + "   Diamond\n   Square\n   Triangle\n");
            setShape(new Scanner(System.in).nextLine().toLowerCase());
        } catch (Exception e) {
            System.out.print("There is somthing worng with this input please enter shape again\n");
            setShape(new Scanner(System.in).nextLine().toLowerCase());
        }
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    public void heightMessage() {
        System.out.print("Please enter the height you would like your shape to be\n");
    }

    /**
     * this lets the user set the height
     */
    public void setHeight(int height) {
        try {
            if (height < 0 || height == 1 || height > 250) {
                throw new ShapeException();
            } else if (height == 0) {
                this.height = 10;
            } else {
                this.height = height;
            }
        } catch (ShapeException ex) {
            System.out.printf("The height of %d is too small or too large\nPlease try something bigger than 1 and less than 250\n", height);
            setHeight(new Scanner(System.in).nextInt());
        } catch (Exception e) {
            System.out.print("There is somthing worng with this input please try again\n");
            setHeight(new Scanner(System.in).nextInt());
        }
    }

    /**
     * @return the line
     */
    public int getLine() {
        return line;
    }

    public void lineMessage() {
        System.out.print("What line would you like your label to show up on?\n");
    }

    /**
     *
     * @param line set the line the label will show up on
     */
    public void setLine(int line) {
        try {
            if ("diamond".equals(this.shape) && height >= line)
            {
                throw new DiamondException();
            } else if (line > this.height || line < 0) {
                throw new ShapeException();
            } else {
                this.line = line;
            }
        } catch (ShapeException ex) {
            System.out.printf("This shape does not have %d lines\nTry something smaller than %d\n", line, this.height);
            setLine(new Scanner(System.in).nextInt());
        } catch (DiamondException d) {
            System.out.print("as you get closer to the top of a diamond it gets smaller this is the tip of your label try a smaller line\n");
            setLine(new Scanner(System.in).nextInt());
        } catch (Exception e) {
            System.out.print("There is somthing worng with this input. make sure you enter a positive number\n");
            setLine(new Scanner(System.in).nextInt());
        }
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    public void labelMessage() {
        System.out.print("What label would you like?\n");
    }

    /**
     * @param label this lets the user set the label
     */
    public void setLabel(String label) {
        int lineWidth = height - line;// this is for readability
        int halfHeight = height / 2;// this is for readability

        try {
            if ("diamond".equals(this.shape) && line > halfHeight && label.length() > lineWidth) {
                throw new DiamondException();
            } else if (label.length() > line) {
                throw new ShapeException();
            } else if (label.equals(" ") || label.equals("") || label.toLowerCase().equals("default")) {
                this.label = "LU";
            } else {
                this.label = label;
            }
        } catch (ShapeException ex) {
            System.out.printf("The label \"" + label + "\"\n is too big to fit on line %d. Try a word smaller then %d letters\n", line, height);
            setLabel(new Scanner(System.in).nextLine());// Recursion is less efficient but I did this because it is easy to read and fun to do.
        } catch (DiamondException d) {
            System.out.print("as you get closer to the top of a diamond it gets smaller and your label is too large for this line height\n");
            setLabel(new Scanner(System.in).nextLine());// Recursion is less efficient but I did this because it is easy to read and fun to do.
        } catch (Exception e) {
            System.out.print("There is somthing worng with this input please retype label\n");
            setLabel(new Scanner(System.in).nextLine());
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
