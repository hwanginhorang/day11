package homework;

import java.util.Scanner;

public class MainService {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      TestService ts = new TestService();
      String power;
      int control=1, timer=0,num;
      while(true) {
         System.out.println("1.전원");
         System.out.println("2.밝기");
         System.out.println("3.타이머");
         System.out.println("4.설정 보기");
         System.out.println(">>> : ");
         num = sc.nextInt();
         switch(num) {
         case 1:
            System.out.println("전원 on/off : ");
            power = sc.next();
            ts.Power(power);
            break;
         case 2:
            System.out.println("밝기 (1,2,3,4,5) : ");
            control = sc.nextInt();
            ts.control(control);
            break;
         case 3:
            System.out.println("타이머 설정 : (m)");
            timer = sc.nextInt();
            ts.timer(timer);
            break;
         case 4:
            TestDTO dto = ts.getTest();
            System.out.println("전원 : "+dto.getPower());
            System.out.println("밝기 : "+dto.getControl());
            System.out.println("타이머 : "+dto.getTimer());
         
         }
      }
   }
}
