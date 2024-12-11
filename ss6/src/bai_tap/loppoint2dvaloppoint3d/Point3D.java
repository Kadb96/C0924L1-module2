package baitap.loppoint2dvaloppoint3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float[] array) {
        super.setX(array[0]);
        super.setY(array[1]);
        this.z = array[2];
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), this.z};
    }

    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")";
    }
}
