package org.java.variableex;

public class CastingEx {
public static void main(String[] args) {
	
	System.out.println("형변환");
	System.out.println("자동형변환");
	

	int i=10;
	double d=1.1;
//	int i2+ i+d; //int +double
	double d2= i+d;//int +double
	double d3= 20+1.5;
	
	byte b1=10;
	byte b2=20;
//byte b3=b1+b2; //byte+byte int
	int i3=b1+b2;
	short s1= 10;
	int s2=b1+s1;
	
	System.out.println("자동형변환");
	int j=(int)1.1;
	System.out.println(j);
	
	int j2= 10+ (int)1.1;
	System.out.println(j2);
	
	byte b4 = 10;
	byte b5 = 10;
	byte b6 = (byte)(b4+b5);
	System.out.println(b6);

	
 }
}
