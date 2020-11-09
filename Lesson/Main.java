package Lesson;

import com.sun.xml.internal.bind.v2.runtime.SwaRefAdapter;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<gto> participant = new ArrayList<>();
        participant.add(new Cat(40,10));
        participant.add(new Human(30,20));
        participant.add(new Robot(5,1));

        List<Object> obstacles = new ArrayList<>();
        obstacles.add(new wall(30));
        obstacles.add(new treadmill(15));

        for (gto action : participant) {
            for (Object object : obstacles) {
                boolean result;
                if (object instanceof wall) {
                    result = action.jump((wall) object);
                } else {
                    result = action.run((treadmill) object);
                }
                if (!result) {
                    break;
                }
            }
        }



    }
}


