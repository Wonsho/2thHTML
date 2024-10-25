package kr.co.rland.rland_boot3_api.streamapi;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String[] stringArray = {"Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda"};

        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray, (o1, o2) -> o1.compareTo(o2));
//        Arrays.sort(stringArray, String::compareTo);
        System.out.println(Arrays.toString(stringArray));

        Exam[] exams = {
                new Exam(2, 2, 2),
                new Exam(3, 3, 3),
                new Exam(1, 1, 1),
                new Exam(4, 4, 4)
        };
        Arrays.sort(exams, Exam::compareTo);
        System.out.println(Arrays.toString(exams));
    }
}
