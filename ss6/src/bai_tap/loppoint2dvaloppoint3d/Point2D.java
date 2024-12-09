package bai_tap.loppoint2dvaloppoint3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public Point2D() {
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float[] arr) {
        this.x = arr[0];
        this.y = arr[1];
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
