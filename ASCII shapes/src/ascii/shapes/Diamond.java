/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

/**
 *
 * @author tbrad_000
 */
public class Diamond extends Triangle {

    Diamond() {
        super();
        super.shape = "diamond";
    }
/**
 * 
 * @param body what the shape is made out of
 * @param line where the label shows up
 * @param label what label is to be shown
 * @param shape the shape to be shown
 */
    Diamond(char body, int line, String label, String shape) {
        super(body, line, label, shape);
    }

/**
 * 
 * @return returns a string of the shape diamond
 */
    @Override
    public String toString() {
        //System.out.print(super.to_String(hight));
        height = height / 2;
        int halfHight = height;
        String diamond = super.toString();
        int currHight = (height % 2 == 0) ? halfHight + 1 : halfHight;
        boolean on = true;

        for (int width = halfHight; width > 0; width--) {

            diamond += spacer(halfHight, width);

            for (int charCount = 1; charCount < width * 2; charCount++) {
                if (on) {
                    if ((currHight) == super.getLine()) {

                        diamond += halfBody(width);
                        label(width);
                        if (super.getLine() % 2 != 0) {
                            diamond += " " + getLabel();
                            diamond += " ";
                        } else {
                            diamond += getLabel();
                        }
                        diamond += halfBody(width);

                        break;
                    } else {
                        diamond += super.getBody();
                    }
                    on = false;
                } else {
                    diamond += " ";
                    on = true;
                }
            }
            on = true;
            diamond += "\n";
            currHight++;
        }
        return diamond;
    }
}
