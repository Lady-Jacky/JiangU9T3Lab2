import java.awt.*;

/**
 * Class Oval:  inherits from Shape and handles oval shapes
 * @author Barb Ericson
 */
public class Line extends Shape {
  /**
   * Constructor
   */
  public Line() {
    super();
  }

  /**
   * Draw the shape
   *
   * @param g the graphics context to draw to
   */
  @Override
  public void draw(Graphics g) {
    // set the color to draw the shape in
    g.setColor(Color.BLUE);

    // draw the oval given the top left corner of the enclosing
    // rectangle and the width and height
    g.drawLine(getP1X(), getP1Y(), getP2X(), getP2Y()); // the getter methods here are INHERITED FROM SHAPE!
  }
}

