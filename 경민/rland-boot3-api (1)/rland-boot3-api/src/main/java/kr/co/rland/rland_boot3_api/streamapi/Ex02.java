package kr.co.rland.rland_boot3_api.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        int[] ages = {10,20,30,43,23,45,12,32,42};
        IntStream stream = IntStream.of(ages);

        int[] result = stream
                .filter(a->a>20)    // 배열 필터링
                .sorted()           // 정렬
                .map(a->a/10*10)    // 매핑
                .toArray();
//        System.out.println(Arrays.toString(result));

//        List<Exam> exams =
//                long sum =
        OptionalInt max =
                Files
                .lines(Path.of("exam.txt"))
                .skip(1)
                .map(Exam::of)
                .filter(exam -> exam.total() <= 100)
                .mapToInt(exam->exam.getKor())
                .max();
//                        .sum();   // long sum
//                .count()
//                .sorted(Exam::compareTo)
//                .forEach(exam -> {
//                    System.out.println(exam.total());
//                });
//                .toList();

        System.out.println(max);
    }
}
