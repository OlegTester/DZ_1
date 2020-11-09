package Lesson;

public class Cat implements gto {
    public int maxRun;
    public int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public boolean run(treadmill treadmill) {
        System.out.println("Cat running");
        int length = treadmill.getLength();
        if (length <= maxRun) {
            System.out.println("Cat ran");
            return true;
        } else {
            System.out.println("Cat didn't run");
            return false;
        }

    }

    public boolean jump(wall wall) {
        System.out.println("Cat jumping");
        int height = wall.getHeight();
        if (height <= maxJump) {
            System.out.println("Cat Jumped");
            return true;
        } else {
            System.out.println("Cat didn't jump");
            return false;
        }

    }
}
