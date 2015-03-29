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
        int count = 0;
        int halfHeight = super.height / 2;
        super.height = (super.height % 2 != 0) ? halfHeight + 1 : halfHeight;// if the height is 21 then 1st half of diamond will be 11 an 2nd half will be 10

        int dHeight = height;

        String diamond = super.toString();

        // System.out.printf("cur = %d height = %d",  height);
        for (int width = halfHeight; width >= 1; width--) {

            if (height % 2 == 0) {
                diamond += super.space.substring(--halfHeight) + " ";
            } else {
                diamond += super.space.substring(--halfHeight);
            }

            if (height % 2 == 0 && fullBody.length() == count + 1) {
                count -= 1;
            }

            if (line == ++dHeight) {
                label(width);

                this.halfBody = halfBody(width);
                this.label = super.getLabel();

                
                diamond += super.halfBody;
                diamond += super.label;
                diamond += super.halfBody + "\n";

            } else {
                diamond += super.fullBody.substring(count += 2) + "\n";
            }
        }
        return diamond + "\n";
    }

}
