package Lesson;

public class Robot implements gto {
    public int maxRun;
    public int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public boolean run(treadmill treadmill) {
        System.out.println("Robot running");
        int length = treadmill.getLength();
        if (length <= maxRun) {
            System.out.println("Robot ran");
            return true;
        } else {
            System.out.println("Robot didn't run");
            return false;
        }

    }

    public boolean jump(wall wall) {
        System.out.println("Robot jumping");
        int height = wall.getHeight();
        if (height <= maxJump) {
            System.out.println("Robot Jumped");
            return true;
        } else {
            System.out.println("Robot didn't jump");
            return false;
        }

    }
}
