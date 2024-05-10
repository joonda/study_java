package Hello;
import java.util.Scanner;
public class gigidan_while {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("구구단을 출력할 단을 입력하세요: ");
        int dan = scanner.nextInt();
        
        if (dan < 2 || dan > 9) {
            System.out.println("2에서 9까지의 숫자를 입력해주세요.");
            return;
        }
        
        int i = 1;
        while (i <= 9) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
        
        scanner.close();
    }
}
