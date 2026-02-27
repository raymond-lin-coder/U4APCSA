package U4T4;

public class Point {
  private int x;
  private int y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public void setX(int newX) {
    this.x = newX;
  }
  public void setY(int newY) {
    this.y = newY;
  }
  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
    /* IMPLEMENT ME */
    return Math.sqrt((other.getX() - this.x) + (other.getY() - this.y));
  }
  //You will need a getX() and getY() method
  // Returns a string in the format: (x, y)
  public String pointInfo() {
   /* IMPLEMENT ME */
    return "(" + x + ", " + y + ")";
  }
}