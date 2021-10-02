package Exe;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n;
//		do {
//		System.out.println("Nhap n");
//		n = scan.nextInt();
//		}while(n<1);
//		int[] array = new int [n];
//		nhapM(array,n,scan);
//		xuatM(array,n);
//		printJava();
//		printTime();
//		 check(scan);
//		demSo(scan);
//		tinhTong(n);
//		checkArray(array,n);
//		checkString(scan);

	}
	

	public static void nhapM(int[] array, int n,Scanner scan) {
		System.out.println("Nhap phan tu mang: ");
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
	}
	
	public static void xuatM(int[] array, int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Phan tu thu: "+i+" "+array[i]);
		}
	}
	public static void printJava() {
		System.out.print("   J   a  v      v  a  ");
		System.out.print("   J  a a  v   v   a a  ");
		System.out.print("J  J aaaaa  v v   aaaaa  ");
		System.out.print(" JJ a     a  v   a     a  ");
	}

	public static void printTime() {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
	}

	public static void check(Scanner scan) {
		System.out.println("Enter a");
		int a = scan.nextInt();
		System.out.println("Enter b");
		int b = scan.nextInt();
		System.out.println("Enter c");
		int c = scan.nextInt();
		if (a <= b && b < c) {
			System.out.println("Tang dan");
		} else if (a >= b && b > c) {
			System.out.println("Giam dan");
		} else {
			System.out.println("Khong sap xep");
		}
	}
	public static void demSo(Scanner scan) {
		System.out.println("Enter n");
		int n = scan.nextInt();
		int dem=1;
		while(n>=10) {
			n/=10;
			dem++;
		}
		System.out.println("So chu so: " + dem);
	}
	public static void tinhTong(int n) {
		float sum = 0;
		for(int i = 1; i <= n; i++){
		    sum +=  1.0/(i*(i+1)*(i+2));
		  }
		System.out.println("Tong: "+sum);
	}
	public static void checkArray(int[] array,int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(array[i] == array[j]) {
					System.out.println("Vi tri i va j la: "+i+" "+j);
				}
			}
			break;
		}
	}
	public static void checkString(Scanner scan) {
		String chuoi1 = scan.nextLine();
		String chuoi2 = scan.nextLine();
		if(chuoi1 == chuoi2) {
			System.out.println("Bang nhau phan biet hoa thuong");
		}
		else if (chuoi1.toUpperCase() == chuoi2.toUpperCase() || chuoi2.toLowerCase() == chuoi2.toLowerCase()){
			System.out.println("Bang nhau khong phan biet hoa thuong");
		}
		else {
			System.out.println("Khong bang nhau");
		}
	}
}
