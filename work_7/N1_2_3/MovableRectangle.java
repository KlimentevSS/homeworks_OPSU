package N1_2_3;
public class MovableRectangle implements Movable {
    Point topLeft, topRight, bottomLeft, bottomRight;
    MovableRectangle(int topLeftX, int topLeftY, int width, int height) {
        topLeft = new Point(topLeftX, topLeftY);
        topRight = new Point(topLeftX + width, topLeftY);
        bottomLeft = new Point(topLeftX, topLeftY - height);
        bottomRight = new Point(topLeftX + width, topLeftY - height);
    }
    public void moveUp(int pixels) {
        topLeft.moveUp(pixels);
        topRight.moveUp(pixels);
        bottomLeft.moveUp(pixels);
        bottomRight.moveUp(pixels);
    }
    public void moveDown(int pixels) {
        topLeft.moveDown(pixels);
        topRight.moveDown(pixels);
        bottomLeft.moveDown(pixels);
        bottomRight.moveDown(pixels);
    }
    public void moveLeft(int pixels) {
        topLeft.moveLeft(pixels);
        topRight.moveLeft(pixels);
        bottomLeft.moveLeft(pixels);
        bottomRight.moveLeft(pixels);
    }
    public void moveRight(int pixels) {
        topLeft.moveRight(pixels);
        topRight.moveRight(pixels);
        bottomLeft.moveRight(pixels);
        bottomRight.moveRight(pixels);
    }
    @Override
    public String toString() {
        return "Rectangle:\n" +
                "topLeft = " + topLeft.toString() + "\n" +
                "topRight = " + topRight.toString() + "\n" +
                "bottomLeft = " + bottomLeft.toString() + "\n" +
                "bottomRight = " + bottomRight.toString();
    }
}
