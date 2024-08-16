

import java.util.Scanner;

public class Exam3 {
    
     static int add(int x,int y) {
       
        return x+y;
    }

     static int sub(int x,int y) {
       
        return x-y;
    }

     static int mul(int x,int y) {
       
        return x*y;
    }

     static double divide(int x,int y) {
       
        return x/y;
    }
    
    public static void main(String[] args) {
        
        //사용자의 입력을 받기위해 스캐너를 사용
        Scanner scan = new Scanner(System.in);
        
        System.out.print("첫번째숫자를입력:");
        int x = scan.nextInt();
        System.out.print("두번째숫자를입력:");
        int y = scan.nextInt();
        
        System.out.println("덧셈결과:"+add(x,y));
        System.out.println("뺄셈결과:"+sub(x,y));
        System.out.println("곱셈결과:"+mul(x,y));
        System.out.println("나눗셈결과:"+divide(x,y));
        
        // 메인메소드가 실행됨 - 콘솔 입력을 위해 Scanner 클래스 호출로 scan 객체 생성 
        // 콘솔창에 사용자 입력받을 준비가됨 - 두개의 정수를 선언해준 변수x,y에 저장
        // add,sub,mul,divide 메소드를 순서대로 호출 - 메소드의 실행결과가 반환됨
        // 메소드들의 반환값으로 화면에 결과 출력
    }
    
}
