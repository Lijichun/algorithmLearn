package arithmetic;

import java.util.Scanner;

//����Բ������
class Clinder{
	private double r;
	private double h;
	//��ʼ��Բ��
	public Clinder(double r, double h){
		this.r = r;
		this.h = h;
	}
	//�������
	public double Volume(){
		return 3.14159*r*r*h;
	}
}
//������
public class CTest {
	public static void main(String[] args){
		double r, h, v;
		Scanner input = new Scanner(System.in);		//�����������
		r = input.nextDouble();			//�Ӽ����϶�ȡ�뾶
		h = input.nextDouble();			//��ȡ��
		Clinder c = new Clinder(r, h);	//����Բ������	
		v = c.Volume();					//����Բ�������������ķ���
		System.out.println(v);			//������v
		input.close();					//�ر�scanner����
	}
}
