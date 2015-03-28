/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

/**
 * @author tbrad_000
 */
public class Diamond extends Triangle {

    Diamond() {
        super();
        super.shape = "diamond";
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
        String space = spacer(halfHight);
        String halfBody = "";
        String fullBody = fullBody(height);
        int count = fullBody.length();

        for (int width = halfHight; width > 0; width--) {

            diamond += " " + space.substring(width); // this is much faster. insted of looping (height - width)  every time it just O(1) == string - char

            if (line == currHight) {
                label(width);
                halfBody = halfBody(width);
                if (line % 2 == 0) {
                    diamond += halfBody;
                    diamond += super.getLabel();
                    diamond += halfBody;
                } else {
                    diamond += halfBody;
                    diamond += " " + super.getLabel() + " ";
                    diamond += halfBody;
                }
            } else {
                diamond += fullBody.substring((fullBody.length()) - count);
            }
            diamond += "\n";
            if (count == 18) {
                count -= 1;
            } else {
                count -= 2;
            }
            currHight++;
        }
        return diamond;
    }
}
