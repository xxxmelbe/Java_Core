package HomeWork_1;

public class Robot extends JumpAndRun {
    int maxHeight;
    int maxLength;
    String RobotName;

    public Robot(int maxHeight, int maxLength, String RobotName) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.RobotName = RobotName;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public String toString() {
        return "Робот по имени " + RobotName;
    }
}