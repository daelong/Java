import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		int a;
		int b;
		int c;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
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
				System.out.println("�Է��� ������ ���� : " + result + "�Դϴ�.");
			}
			if(result < 0)
			{
				throw new Exception();

			}
		}catch(Exception me){
			System.out.println("������ �߻��Ͽ����ϴ�.");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		sc.close();
		return;
	}

}
