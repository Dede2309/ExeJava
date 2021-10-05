	package baiTapOOP;

import java.util.Scanner;

public class HinhChuNhat  {
	public int chieuDai,chieuRong;
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	public void Nhap() {
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Nhap chieu dai");
		chieuDai=scan.nextInt();
		System.out.println("Nhap chieu rong");
		chieuRong = scan.nextInt();} while(chieuDai < 0 && chieuRong < 0);
	}
	public void Xuat() {
		System.out.println("Chieu Dai: " + chieuDai + " Chieu Rong: " + chieuRong);
	}

	public HinhChuNhat() {
		
	}

	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public static int tinhChuVi (int chieuDai, int chieuRong) {
		int chuVi = (chieuDai + chieuRong)/2;
		return chuVi;
	}
	public static int tinhDienTich(int chieuDai, int chieuRong) {
			int dienTich = chieuDai * chieuRong;
			return dienTich;
	}
	public void displayChuViVaDienTich(double cv, double dt) {
		 System.out.println("Chu vi hình chữ nhật = " + cv);
	        System.out.println("Diện tích hình chữ nhật = " + dt);
	}
	
	

}
