package org.java.variableex;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		System.out.println("Scanner");
		
		System.out.println("�����͸� �Է��Ͻÿ�: ");
		Scanner scn= new Scanner(System.in);
		String str1= scn.nextLine();
		System.out.println("�Է°�: "+str1);
		System.out.println();

		
		System.out.println("���� �Է�:");
		int age= scn.nextInt();
		System.out.println("����� ����: " +age);
	
		scn.close();
		
		
	} 

}