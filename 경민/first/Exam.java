

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("c:/res/data.csv");
        
        //파일을 읽기위한 스캐너 객체를 만듬
        Scanner scan = new Scanner(fis);

        
            scan.nextLine();
      
            String line = scan.nextLine();
            String[] tokens = line.split(",");
            String name = tokens[0].trim();
            int kor = Integer.parseInt(tokens[1].trim());
            int eng =  Integer.parseInt(tokens[2].trim());
            int math =  Integer.parseInt(tokens[3].trim());
            int total = kor+eng+math;
            double avg = total/3.0;
            
            System.out.println(total);
            System.out.println("허재완님의 점수");
            System.out.println("국어점수는:"+kor);
            System.out.println("영어점수는:"+eng);
            System.out.println("수학점수는:"+math);

            System.out.println("이름,국어,영어,수학,합계,평균");
            System.out.printf("%s, %d, %d, %d, %d, %.2f",name,kor,eng,math,total,avg);
        
        }

    }

