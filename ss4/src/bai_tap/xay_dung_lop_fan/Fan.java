package bai_tap.xay_dung_lop_fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    boolean isOn = false;
    double radius = 5;
    String color = "blue";
    public Fan() {};

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.isOn) {
            return "speed is " + speed + "\n"
                    + "color is " + color + "\n"
                    + "radius is " + radius + "\n"
                    + "fan is on";
        } else {
            return "fan is off";
        }
    }
}
