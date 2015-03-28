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
        height = height / 2;// this is for readability. a diamond will print two triangles so the true height should be half
        int halfHight = height / 2;

        String diamond = super.toString();

        int currHight = (height % 2 == 0) ? halfHight + 1 : halfHight;

        boolean on = true;

        int count = super.fullBody.length();

        for (int width = halfHight; width > 0; width--) {

            diamond += super.space.substring(width); // this is much faster. insted of looping (height - width)  every time it just O(1) == string - char

            if (line == currHight) {
              //  super.halfBody = halfBody(width);

                diamond += super.halfBody;
                diamond += super.label;
                diamond += super.halfBody;

            } else {
                diamond += super.fullBody.substring((super.fullBody.length()) - count);
            }
            diamond += "\n";

            if (count == super.fullBody.length()) {
                count -= 1;
            } else {
                count -= 2;
            }
            currHight++;
        }
        return diamond;
    }
}
