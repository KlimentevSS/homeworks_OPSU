public class Ball {
    private double x, y, x2, y2;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX2(){
        return x2;
    }
    public void setX2(double x2){this.x2=x2;}

    public double getY2(){
        return y2;
    }
    public void setY2(double y2){this.y2=y2;}

    public double getXnew(){return this.getX()+this.getX2();}
    public double getYnew(){return this.getY()+this.getY2();}

    @Override
    public String toString() {
        return "Ball{" + "x: " + x + ", " + "y: " + y + "}";
    }
}