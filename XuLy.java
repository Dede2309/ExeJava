package baiTapOOP;

public class XuLy {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.Nhap();
		hcn.Xuat();
		double chuVi = hcn.tinhChuVi(hcn.chieuDai, hcn.chieuRong);
		double dienTich = hcn.tinhDienTich(hcn.chieuDai,hcn.chieuRong);
		hcn.displayChuViVaDienTich(chuVi, dienTich);
	}

}
