

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExamE {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("c:/res/data.csv");
        Scanner scan = new Scanner(fis);
      
        String line = scan.nextLine();
        String line2 = scan.nextLine();
        
        for(int i=0;i<2;i++){
            System.out.println(line);
            System.out.println(line2);
        }

        // while (scan.hasNextLine()) {
        //     String line = scan.nextLine();
       
        //     for(int i=0;i<2;i++){
        //      System.out.println(line);
        //     }
        
        // 8번 메인메소드실행 - 9번 파일을 읽기위해 스트림 생성 - 10번 스캐너객체에 스트림 연결
        // 12번 파일에 첫번째줄 읽어서 line에 저장, 13번 두번째줄 line2에 저장
        // 15번 for문 루프를 2번 반복하여 line변수와 line2변수를 2번 출력
        
    }
}

