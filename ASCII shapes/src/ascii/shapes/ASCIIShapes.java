/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

/**
 * @author tbrad_000
 */
public class ASCIIShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //debug
        Triangle t = new Triangle();
        System.out.print(t.toString());

        Diamond d = new Diamond();
        System.out.print(d.toString());

        Square s = new Square();
        System.out.print(s.toString());
        //end debug

        BuildShapes build = new BuildShapes();

        // build.buildShapes();
    }

}
