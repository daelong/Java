import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		int a;
		int b;
		int c;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		result = a * b * c;
		try {
			if( a < 0 || b < 0 || c < 0)
			{
				throw new Exception();
			}
			else
			{
				System.out.println("입력한 정수의 곱은 : " + result + "입니다.");
			}
			if(result < 0)
			{
				throw new Exception();

			}
		}catch(Exception me){
			System.out.println("오류가 발생하였습니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();
		return;
	}

}
