/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

import java.util.Scanner;

/**
 * @author tbrad_000
 */
public class BuildShapes {

    Goodinput input = new Goodinput();

    public void question() {
        System.out.print("Would you like to build another shape?\n");

        String s = input.stringClean().toLowerCase();

        switch (s) {
            case "y":
            case "ya":
            case "yep":
            case "yes":
            case "sure":
            case "ok":
            case "I want to go again":
            case "lets keep going":
            case "sounds good":
                buildShapes();
                break;
            case "n":
            case "not right now":
            case "no":
            case "nop":
            case "done":
            case "i am done":
                System.out.print("I hope you had fun!! Good Bye ^_^\n");
                break;
            default:
                System.out.print("^_^ try something like \"yes\" or \"no\" ^_^\n");
                question();
                break;
        }
    }

    public void buildShapes() {
        Shapes shape = new Shapes();

        shape.shapeMessage();

        shape.setShape(new Scanner(System.in).nextLine().toLowerCase());
        switch (shape.getShape()) {
            case "triangle":
                Triangle t = new Triangle();

                t.bodyMessage();
                t.setBody(input.charClean());

                t.heightMessage();
                t.setHeight(input.intClean());

                t.lineMessage();
                t.setLine(input.intClean());

                t.labelMessage();
                t.setLabel(input.stringClean());

                System.out.print(t.toString());
                question();
                break;

            case "square":
                Square s = new Square();

                s.bodyMessage();
                s.setBody(input.charClean());

                s.heightMessage();
                s.setHeight(input.intClean());

                s.lineMessage();
                s.setLine(input.intClean());

                s.labelMessage();
                s.setLabel(input.stringClean());

                System.out.print(s.toString());
                question();
                break;
            case "diamond":
                Diamond d = new Diamond();

                d.bodyMessage();
                d.setBody(input.charClean());

                d.heightMessage();
                d.setHeight(input.intClean());

                d.lineMessage();
                d.setLine(input.intClean());

                d.labelMessage();
                d.setLabel(input.stringClean());

                System.out.print(d.toString());
                question();
                break;
            default:
                System.out.print("I do not know how you got here but some how you found a way ^_^ \n");
                break;
        }
    }

}
