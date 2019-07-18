package chap13;

//Canvas��� ���� �̿��ؼ� �׸��� �׸� �� �ֵ���
//Canvas�� ��� ������ �����ϴ� ������Ʈ
//�׸��� �׸��ų� ���ڸ� ��Ÿ���ų� �� �� �ִ�.
//paint�޼ҵ带 �������̵��ؼ� ���ϴ� �׸��� �׸���.
//paint�޼ҵ��� �Ű������� Graphics�� ������� �̿��ؼ� �׸��� �׸���.
//�׸��� �׷������� �Ϸ��� Canvas�� repaint�޼ҵ带 ȣ���ؾ� �������̵��� paint�� ȣ��ȴ�.
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Horse extends Canvas implements Runnable {
	private int x; // Horse�� x��ǥ���� ��� ����� �� �̹Ƿ� ������ ����
	private int randNum;

	public Horse() {
		// nextInt���� �ٸ����
		double num = Math.random();
		System.out.println(num);
		randNum = (int) (num * 5);
		System.out.println(randNum);
	}

	@Override
	public void paint(Graphics g) {// �������̵� �ؼ�(source)
		setBackground(Color.yellow);
		// Line�� �׸��� x�� ���۰��� 0�̰� y�� ��ü Canvas�� 1/2
		g.drawLine(0, this.getSize().height / 2, this.getSize().width, this.getSize().height / 2);
		g.fillOval(x, 0, 10, this.getSize().height);	//ĵ������ ���� ���ƾ��ϹǷ�  -> x���� �������� �����̴� �� ó�� ����
	}

	public void startThread() {
		new Thread(this).start(); // implements Runnable�ϸ� .start�ȵǴϱ� �̷��� �������.
	}

	@Override
	public void run() {	//Canvas�� ��������
		//repaint(); //Canvas�� paint()�� ȣ��
		while(true){
			try {
				Thread.sleep(100);	//Horse�� �޸��� �ӵ��� ���� 0.1�ʸ��� �� ������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Canvas�� x��ǥ�� ����
			//���⼭ ���� ���� �����൵ �ǰ�, x�� ������ �����൵�ǰ�.
			x = x + 10+randNum; //+�������ϴ°��Ϲ��������� �ٸ���� => randNum
			//x��ǥ���� Canvas�� width���� Ŀ���� �ݺ����� ����������.
			if(x>this.getSize().width-10){//g.fillOval���� 10�־����� ����
				
				break;
			}
			repaint();
			
		}
	}

}
