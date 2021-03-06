package ascii.shapes;

/**
 * @author tbrad_000
 */
public class Shapes {

    protected String shape = ""; // the shape of the ASCII
    protected int height;
    protected char body;// What character the shape is made out of
    protected int line;
    protected String label;
    protected GoodShapeInput clean = new GoodShapeInput();
    private ColorClass color = new ColorClass();
    protected boolean labeleven;
    int origLabLength = 0;

    /**
     * default constructor
     */
    Shapes() {
        this.body = 'X';
        this.label = "LU";
        this.line = 7;
        this.height = 11;
    }

    Shapes(char body, String label, int line, int height) {
        this.body = body;
        this.label = label;
        this.line = line;
        this.height = height;
    }

    /**
     *
     * @param width this is the current width of the shape
     */
    protected void label(int width) {
        origLabLength = this.label.length();
        String s = "";
        for (int b = 0; b < getLabel().length(); b++) {
            if (b != (this.label.length() - 1)) {// if it is not the last char
                s += this.label.charAt(b) + " ";
            } else {
                s += this.label.charAt(b) + "";
            }
        }
        if (spaceThinker(width, origLabLength)) {
            this.label = " " + s + " ";
        } else {
            this.label = s;
        }
    }

    protected boolean spaceThinker(int width, int origLabLength) {
        labeleven = this.label.length() % 2 == 0;
        boolean labelEdge = (origLabLength) == (width);
        switch (this.shape) {
            case "triangle":
                return ((labeleven && this.line % 2 == 0 && this.line != 2) || ((!labeleven && this.line % 2 != 0) && !labelEdge));
            case "diamond":
                return ((labeleven && this.line % 2 == 0 && this.line != 2) || ((!labeleven && this.line % 2 != 0) && !labelEdge));

            case "square":
                return ((labeleven && this.height % 2 == 0) || (!labeleven && this.height % 2 != 0));

            default:
                System.out.print("^_^ Something went wrong ^_^\n");
                return false;
        }
    }

    /**
     * @param width this is the height of the body of square, triangle and half
     * height for diamond
     * @return This will return a string to be put on each side of the label
     */
    protected String halfBody(int width) {
        boolean on = true;
        String s = "";

        int half = (((width * 2) - 1) - this.getLabel().length()) / 2;

        for (int z = 0; z < half; z++) {
            if (on) {
                s += body;
                on = false;
            } else if (half - 1 == z) {
                break;
            } else {
                s += " ";
                on = true;
            }
        }
        color.colorPromt();
        this.label = color.colorInput(clean.stringClean()) + this.label + color.ANSI_RESET;
//        this.label = color.colorInput("green") + this.label + color.ANSI_RESET; //debug
        return s;
    }

    protected String fullBody(int width) {
        boolean on = true;
        String s = "";

        for (int z = 0; z < width * 2; z++) {
            if (on) {
                s += body;
                on = false;
            } else if ((width * 2) - 1 == z) {
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
     * @param newBody this is a char that the body of the shape will be made out
     * of
     */
    public void setBody(char newBody) {
        this.body = clean.GoodBody(newBody);
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
        this.shape = clean.GoodShape(s);
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
        this.height = clean.GoodHeight(height);
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
     * @param line set the line the label will show up on
     */
    public void setLine(int line) {
        this.line = clean.GoodLine(line, this.shape, this.height);
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
        this.label = clean.GoodLabel(label, shape, line, height);
    }
}
