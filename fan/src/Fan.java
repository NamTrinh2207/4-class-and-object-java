public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;

    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public Fan() {
        this.speed = slow;
        this.status = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed(int i) {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void getColor() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                " speed=" + speed + ", status=" + status + ", radius=" + radius + ", color=" + color;
    }

}
