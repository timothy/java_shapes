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
public class Goodinput {

    public Goodinput() {
    }

    public String stringClean() {
        while (true) {
            try {
                String s = new Scanner(System.in).nextLine();
                return s;
            } catch (Exception e) {
                System.out.print("something went wrong? Try again!\n");
            }
        }
    }

    public char charClean() {
        while (true) {
            try {
                char c = new Scanner(System.in).next().charAt(0);
                return c;
            } catch (Exception e) {
                System.out.print("something went wrong? Try again!\n");
            }
        }
    }

    public int intClean() {
        while (true) {
            try {
                int c = new Scanner(System.in).nextInt();
                return c;
            } catch (Exception e) {
                System.out.print("something went wrong? Try again!\n");
            }
        }
    }
}
