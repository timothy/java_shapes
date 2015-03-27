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
public class ASCIIShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Diamond d = new Diamond();
        Square s = new Square();
        Shapes shape = new Shapes();
        boolean repeat = true;

        while (repeat) {
            Scanner input = new Scanner(System.in); // I usaully would not create on obect in a loop
            //but This input method is very different then the Console.ReadLine and cout methods I am used to.
            //I cannot figure out why input.nextLine() will only work once when Scanner input = new Scanner(System.in); is outside of the loop.

            shape.setShape();
            switch (shape.getShape()) {
                case "triangle":
                    t.setBody();
                    t.setHeight();
                    t.setLine();
                    t.setLabel();
                    System.out.print(t.toString());
                    break;
                case "square":
                    s.setBody();
                    s.setHeight();
                    s.setLine();
                    s.setLabel();
                    System.out.print(s.toString());
                    break;
                case "diamond":
                    d.setBody();
                    d.setHeight();
                    d.setLine();
                    d.setLabel();
                    System.out.print(d.toString());
                    break;
                default:
                    System.out.print("I do not know how you got here but some how you found a way ^_^ \n");
                    break;
            }
        }
    }
//Recursion is slow and less efficient. But I thought I would throw it here at least once.

//    public void start() {
//        Triangle t = new Triangle();
//        Diamond d = new Diamond();
//        Square s = new Square();
//        Shapes shape = new Shapes();
//
//        shape.setShape();
//        switch (shape.getShape()) {
//            case "triangle":
//                t.setBody();
//                t.setHeight();
//                t.setLine();
//                t.setLabel();
//                System.out.print(t.to_String());
//                start();
//                break;
//            case "square":
//                s.setBody();
//                s.setHeight();
//                s.setLine();
//                s.setLabel();
//                System.out.print(s.to_String());
//                break;
//            case "diamond":
//                d.setBody();
//                d.setHeight();
//                d.setLine();
//                d.setLabel();
//                System.out.print(d.print());
//                break;
//            default:
//                System.out.print("I do not know how you got here but some how you found a way ^_^ \n");
//                break;
//        }
//    }
}
