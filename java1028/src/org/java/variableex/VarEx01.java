package org.java.variableex;

public class VarEx01 {
	public static void main(String[] args) {
		//1. ����
		/*
		 1.������ ����                                           
         2.������ �ʱ�ȭ- data�� �߰�
         3.������ �޸𸮿� �Ҵ�
		 */
		//�ڹ��� �⺻ Ÿ��  primitive types
		//������
		byte  b;//byte���� ���� b�� �����ߴ�
		b= 10;// ���� b�� ������ data 10���� �ʱ�ȭ�ߴ�- �޸𸮿� �Ҵ�
		byte b2=100;//byte���� ���� b2�� �����ϰ� 10���� �ʱ�ȭ�ߴ�
		short s =10; //short���� ���� s�� �����ϰ� 10����  �ʱ�ȭ�ߴ�
		int i=10;//int���� ���� i�� �����ϰ� 10����  �ʱ�ȭ�ߴ�
		long l=10;//long���� ���� l�� �����ϰ� 10����  �ʱ�ȭ�ߴ�
 
		//�Ǽ���, �⺻Ÿ���� double 
		float f=1.1f;//float�� ���� f�� �����ϰ� 1.1�� �ʱ�ȭ �ߴ�.
		double d= 1.1;//double�� ���� d�� �����ϰ� 1.1�� �ʱ�ȭ �ߴ�.
		
		//������ c������ 1byte
		char ch='a';//char�� ���� ch�� �����ϰ� 'a'�� �ʱ�ȭ �ߴ�.
		
		//���� 
		boolean bool1 = true;
		boolean bool2 = false;
	
		//�ֿܼ� ��� 
		
		System.out.println("�ڹ��� �⺻ �ڷ��� ");
		b2= 50;
		System.out.println("b2->"+b2);
		System.out.println("s->"+s);
		System.out.println("i->"+i);
		System.out.println("l->"+l);
		System.out.println("ch->"+ch);
		System.out.println("bool1->"+bool1);
		System.out.println("bool2>"+bool2);
		System.out.println("f->"+f);
		System.out.println("d->"+d);
		System.out.println("i->"+i);
		System.out.println();
		System.out.println();
		
		  //Ŭ����(��������� Ÿ��)  //BasicClass ��ü����
		BasicClass clas1=new BasicClass();
		
		
	}

}
