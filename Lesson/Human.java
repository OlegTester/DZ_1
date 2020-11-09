package Lesson;

public class Human implements gto {
    public int maxRun;
    public int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public boolean run(treadmill treadmill) {
        System.out.println("Human running");
        int length = treadmill.getLength();
        if (length <= maxRun) {
            System.out.println("Human ran");
            return true;
        } else {
            System.out.println("Human didn't run");
            return false;
        }

    }

    public boolean jump(wall wall) {
        System.out.println("Human jumping");
        int height = wall.getHeight();
        if (height <= maxJump) {
            System.out.println("Human Jumped");
            return true;
        } else {
            System.out.println("Human didn't jump");
            return false;
        }

    }
}
