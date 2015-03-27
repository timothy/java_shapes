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
     * @param width this is the height of the body of square, triangle and half height for diamond
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

    /**
     * body the body to set this creates the body of the shape and prints it out
     */
    public void setBody() {
        char body = 'X';

        System.out.print("What character would you like your shape to be made out of?\n");
        while (true) {
            try {
                Scanner input = new Scanner(System.in); // I usaully would not create on obect in a loop
                //but This input method is very different then the Console.ReadLine and cout methods I am used to.
                //I cannot figure out why input.nextLine() will only work once when Scanner input = new Scanner(System.in); is outside of the loop.
                body = input.next().charAt(0);
                if (body == ' ') {
                    this.body = 'X';
                } else {
                    this.body = body;
                }
                break;
            } catch (Exception e) {
                System.out.print("There is somthing worng with this input please try again\n");

            }
        }
    }

    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * the shape to set
     */
    public void setShape() {
        System.out.print("What shape would you like to print?\n");
        String s = "";
        while (true) {

            try {
                Scanner input = new Scanner(System.in); // I usaully would not create on obect in a loop
                //but This input method is very different then the Console.ReadLine and cout methods I am used to.
                //I cannot figure out why input.nextLine() will only work once when Scanner input = new Scanner(System.in); is outside of the loop.
                s = input.nextLine().toLowerCase();
                if ("diamond".equals(s) || "square".equals(s) || "triangle".equals(s)) {
                    this.shape = s;
                    break;
                } else {
                    throw new ShapeException();
                }
            } catch (ShapeException ex) {
                System.out.printf("The shape of " + s + " is not a valid shape\nplease enter one of the following shapes\n"
                        + "   Diamond\n   Square\n   Triangle\n");

            } catch (Exception e) {
                System.out.print("There is somthing worng with this input please try again\n");

            }
        }
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * this lets the user set the height
     */
    public void setHeight() {
        System.out.print("Please enter the height you would like your shape to be\n");
        int height = 4;

        while (true) {
            try {
                Scanner input = new Scanner(System.in); // I usaully would not create on obect in a loop
                //but This input method is very different then the Console.ReadLine and cout methods I am used to.
                //I cannot figure out why input.nextLine() will only work once when Scanner input = new Scanner(System.in); is outside of the loop.
                height = input.nextInt();

                if (height < 0 || height == 1 || height > 250) {
                    throw new ShapeException();
                } else if (height == 0) {
                    this.height = 10;
                } else {
                    this.height = height;
                    break;
                }
            } catch (ShapeException ex) {
                System.out.printf("The height of %d is too small or too large\nPlease try something bigger than 1 and less than 250\n", height);

            } catch (Exception e) {
                System.out.print("There is somthing worng with this input please try again\n");

            }
        }
    }

    /**
     * @return the line
     */
    public int getLine() {
        return line;
    }

    /**
     * this lets the user set what line the label will show up on
     */
    public void setLine() {
        int line = 10;

        System.out.print("What line would you like your label to show on?\n");
        while (true) {
            try {
                Scanner input = new Scanner(System.in); // I usaully would not create on obect in a loop
                //but This input method is very different then the Console.ReadLine and cout methods I am used to.
                //I cannot figure out why input.nextLine() will only work once when Scanner input = new Scanner(System.in); is outside of the loop.
                line = input.nextInt();
                if ("diamond".equals(this.shape) && height == (line + 1))// for some reason "diamond".equals(this.shape) is not working
                {
                    throw new DiamondException();

                } else if (line > this.height || line < 0) {
                    throw new ShapeException();
                } else {
                    this.line = line;
                    break;
                }
            } catch (ShapeException ex) {
                System.out.printf("This shape does not have %d lines\nTry something smaller than %d\n", line, this.height);
            } catch (DiamondException d) {
                System.out.print("as you get closer to the top of a diamond it gets smaller this is the tip of your label try a smaller line\n");
            } catch (Exception e) {
                System.out.print("There is somthing worng with this input please try again\n");
            }
        }
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * this lets the user set the label
     */
    public void setLabel() {
        String label = "LU";
        System.out.print("What label would you like?\n");
        int test = height - line;
      int halfHeight = height /2;
      int size = label.length();
      String is = this.getShape();
        while (true) {
            try {
                Scanner input = new Scanner(System.in); // I usaully would not create on obect in a loop
                //but This input method is very different then the Console.ReadLine and cout methods I am used to.
                //I cannot figure out why input.nextLine() will only work once when Scanner input = new Scanner(System.in); is outside of the loop.
                label = input.nextLine();
                size = label.length();

                if ("diamond".equals(this.getShape()) && line > halfHeight && label.length() > test)//this if statment is not being hit.. I think it is because ("diamond".equals(this.shape)
                // its should stop the user from putting labels that are too big for the line in diamond...
                {
                    throw new DiamondException();
                } else if (label.length() > line) {
                    throw new ShapeException();
                } else if (label.equals(" ") || label.equals("") || label.toLowerCase().equals("default")) {
                    this.label = "LU";
                    break;
                } else {
                    this.label = label;
                    break;
                }
            } catch (ShapeException ex) {
                System.out.printf("The label \"" + label + "\"\n is too big to fit on line %d. Try a word smaller then %d letters\n", line, height);
            } catch (DiamondException d) {
                System.out.print("as you get closer to the top of a diamond it gets smaller and your label is too large for this line height\n");
            } catch (Exception e) {
                System.out.print("There is somthing worng with this input please try again\n");
            }
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
