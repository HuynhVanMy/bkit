package bai04;

import java.text.DecimalFormat;

public class TienDien {

	private String diaChi;
	private String tenChuHo;
	private int soDienTieuThu;
	private double thue;
	private double tongTien;

	public TienDien() {
		// TODO Auto-generated constructor stub
	}

	public TienDien(String diaChi, String tenChuHo, int soDienTieuThu, double thue, double tongTien) {
		this.diaChi = diaChi;
		this.tenChuHo = tenChuHo;
		this.soDienTieuThu = soDienTieuThu;
		this.thue = thue;
		this.tongTien = tongTien;
	}

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		return "Địa chỉ: " + diaChi + "\nTên chủ hộ: " + tenChuHo + "\nSố điện tiêu thụ: " + soDienTieuThu + "\nThuế: "
				+ decimalFormat.format(thue) + "\nTổng tiền: " + decimalFormat.format(tongTien);
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getTenChuHo() {
		return tenChuHo;
	}

	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
	}

	public int getSoDienTieuThu() {
		return soDienTieuThu;
	}

	public void setSoDienTieuThu(int soDienTieuThu) {
		this.soDienTieuThu = soDienTieuThu;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

}
