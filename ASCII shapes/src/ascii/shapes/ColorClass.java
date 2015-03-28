/*
 * Copyright (C) 2015 tbrad_000
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ascii.shapes;

/**
 *
 * @author tbrad_000
 */
public class ColorClass extends Goodinput {

    public final String ANSI_RESET = "\u001B[0m";
    public final String ANSI_BLACK = "\u001B[30m";
    public final String ANSI_RED = "\u001B[31m";
    public final String ANSI_GREEN = "\u001B[32m";
    public final String ANSI_YELLOW = "\u001B[33m";
    public final String ANSI_BLUE = "\u001B[34m";
    public final String ANSI_PURPLE = "\u001B[35m";
    public final String ANSI_CYAN = "\u001B[36m";
    public final String ANSI_WHITE = "\u001B[37m";

    public void colorPromt() {
        System.out.print("^_^ What color would you like your label to be? ^_^\n"
                + "^_^ BLACK ^_^\n"
                + "^_^ RED ^_^\n"
                + "^_^ GREEN ^_^\n"
                + "^_^ YELLOW ^_^\n"
                + "^_^ BLUE ^_^\n"
                + "^_^ PURPLE ^_^\n"
                + "^_^ CYAN ^_^\n"
                + "^_^ WHITE ^_^\n");
    }

    public String colorInput(String color) {
        switch (color.toLowerCase()) {
            case "black":
                return ANSI_BLACK;
            case "red":
                return ANSI_RED;
            case "green":
                return ANSI_GREEN;
            case "yellow":
                return ANSI_YELLOW;
            case "blue":
                return ANSI_BLUE;
            case "purple":
                return ANSI_PURPLE;
            case "cyan":
                return ANSI_CYAN;
            case "white":
                return ANSI_WHITE;
            default:
                System.out.print("^_^ Choose any of the following colors ^_^\n"
                        + "^_^ BLACK ^_^\n"
                        + "^_^ RED ^_^\n"
                        + "^_^ GREEN ^_^\n"
                        + "^_^ YELLOW ^_^\n"
                        + "^_^ BLUE ^_^\n"
                        + "^_^ PURPLE ^_^\n"
                        + "^_^ CYAN ^_^\n"
                        + "^_^ WHITE ^_^\n");
                return colorInput(super.stringClean());
        }
    }
}
