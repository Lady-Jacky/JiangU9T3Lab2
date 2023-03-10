import java.awt.*;

/**
 * Class Oval:  inherits from Shape and handles oval shapes
 * @author Barb Ericson
 */
public class Arc extends Shape {
  private int arcAngle;
  private int startAngle;
  /**
   * Constructor
   */
  public Arc() {
    super();
    this.arcAngle = 70;
    this.startAngle = 30;
  }

  /**
   * Draw the shape
   *
   * @param g the graphics context to draw to
   */
  @Override
  public void draw(Graphics g) {
    // set the color to draw the shape in
    g.setColor(getColor());

    // draw the oval given the top left corner of the enclosing
    // rectangle and the width and height
    g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle); // the getter methods here are INHERITED FROM SHAPE!
  }
}

