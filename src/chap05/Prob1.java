package chap05;
/*����1.
 * Prob1�� main()�޼ҵ忡�� ������ �迭�� �ʱ�ȭ�Ǿ� �ִ�.
 * �� �迭�� �Ű������� �޾Ƽ� �迭�� ������ Ȧ��, ¦������ �����Ͽ�
 * Ȧ���� �հ� ¦���� ���� �Ʒ��� ���� ����� �� �ֵ��� �����ϼ���.
 * [��°��]
 * (�迭 ia)
 * Ȧ���� �� : 26
 * ¦���� �� : 32
 * (�迭 ib)
 * Ȧ���� �� : 9
 * ¦���� ��: 6
*/
public class Prob1 {
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		int iaOddSum =0; //iaȦ����
		int iaEvenSum=0; //ia¦����
		int ibOddSum =0; //ibȦ����
		int ibEvenSum=0; //ib¦����
		
		for(int i=0;i<ia.length;i++){
			int num = ia[i];
			if(num%2==0){
				iaEvenSum=iaEvenSum+num;
			}else{
				iaOddSum=iaOddSum+num;
			}
		}
		for(int i=0;i<ib.length;i++){
			int num = ib[i];
			if(num%2==0){
				ibEvenSum=ibEvenSum+num;
			}else{
				ibOddSum=ibOddSum+num;
			}
		}
		
		System.out.println("(�迭 ia)");
		System.out.println("Ȧ���� �� : "+iaOddSum);
		System.out.println("¦���� �� : "+iaEvenSum);
		System.out.println("(�迭 ib)");
		System.out.println("Ȧ���� �� : "+ibOddSum);
		System.out.println("¦���� �� : "+ibEvenSum);
	
	}
}