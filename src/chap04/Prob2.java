package chap04;
/*���� 2. 
 * �ʱ� ��, ������ ��, �������� �Է� �޾Ƽ�, �ʱⰪ���� ������ ������, 
 * �����о� ���� ������Ű�鼭 �� ������ ������ ���ϴ� ���α׷��� �ۼ��ϼ���. 
 * ��, ���� ���� ����� 1000 �� ������, ����� 2000 �� �ѹ� �� ���Ͽ� ����մϴ�.   
 * ���� �� 1)
 * �ʱⰪ�� ������ �Է��ϼ���. : 1 
 * ������ ���� ������ �Է��ϼ���. : 10    
 * �������� ������ �Է��ϼ���. : 1   
 * ������ 55 �Դϴ�.  
 * ���� �� 2) 
 * �ʱⰪ�� ������ �Է��ϼ���. : 10 
 * ���������� ������ �Է��ϼ���. : 100  
 * �������� ������ �Է��ϼ���. : 5   
 * ������ 3045 �Դϴ�.  
 */
import java.util.Scanner;
public class Prob2 {
	
	public static void main(String[] args) {
		int start = 0 ;
		int end = 0;
		int step = 0 ;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in); 

		System.out.print("�ʱ� ���� ������ �Է��ϼ���. : ");
		start = keyboard.nextInt();
		System.out.print("������ ���� ������ �Է��ϼ���. : ");
		end = keyboard.nextInt();
		System.out.print("�������� ������ �Է��ϼ���. : ");
		step =  keyboard.nextInt();
		
		/*  �̰��� ���α׷��� �ϼ��Ͻʽÿ�. */
		int count=0;  
	
		for(int i=start; i<=end; i=i+step){
			sum = sum + start + (step*count);
			count++;
		}
		if(sum>1000){
			sum = sum+2000;
		}
		System.out.println("������ " + sum +" �Դϴ�. "); 
		
	} 
	
}
