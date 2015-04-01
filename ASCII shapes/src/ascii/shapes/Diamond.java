/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

/**
 * @author tbrad_000
 */
public class Diamond extends Shapes {

    Triangle triangle = new Triangle();
    int trueLabLength = 0;
    String fullBody = "";
    String space = "";
    String halfBody = "";

    Diamond() {
        super();
        super.shape = "diamond";
        trueLabLength = this.label.length();
    }

    public boolean isEdge(int width) {
        return (super.origLabLength == width);
    }

    /**
     *
     * @return returns a string of the shape diamond
     */
    @Override
    public String toString() {
        this.height = super.height / 2;
        this.space = this.triangle.spacer(super.height);
        this.fullBody = super.fullBody(super.height);
        this.triangle.height = super.height;
        String diamond = this.triangle.toString();
        int count = 0;
        int curFullHeight = this.height + 1;

        for (int width = super.height; width > 0; width--) {
            diamond += this.space.substring(width)+ " ";

            if (super.line == curFullHeight) {
                super.line = width;
                label(width);

                this.halfBody = halfBody(width);
                this.label = super.getLabel();

                diamond += this.halfBody;
                diamond += this.label;
                diamond += this.halfBody;

            } else {
                diamond += this.fullBody.substring(count);
            }
            diamond += "\n";
            count += 2;
            curFullHeight++;
        }
        return diamond;
    }
}
