package bai02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyCuaHangCDController {

	public int menu() {
		System.out.println("---QUẢN KÝ CỬA HÀNG CD---" + "\n1. Tạo danh sách CD" + "\n2. Thêm 1 CD vào danh sách"
				+ "\n3. Số lượng CD có trong danh sách" + "\n4. Tổng giá thành của các CD"
				+ "\n5. Sắp xếp danh sách giảm dần theo giá thành" + "\n6. Sắp xếp danh sách tĕng dần theo tựa CD"
				+ "\n7. Xuất danh sách CD" + "\n8. Thoát");
		int n = (int) checkNumer("chức năng tương ứng");
		return n;
	}

	public QuanLyCuaHangCD[] sortByChuDe(QuanLyCuaHangCD[] arrayCD) {
		int soLuong = laySoLuongCD(arrayCD);
		QuanLyCuaHangCD[] tmpArr = new QuanLyCuaHangCD[soLuong];
		for (int i = 0; i < soLuong; i++) {
			tmpArr[i] = arrayCD[i];
		}

		Arrays.sort(tmpArr, new Comparator<QuanLyCuaHangCD>() {

			public int compare(QuanLyCuaHangCD cd1, QuanLyCuaHangCD cd2) {
				return cd1.getChuDeCD().compareToIgnoreCase(cd2.getChuDeCD());
			}
		});
		for (int i = 0; i < soLuong; i++) {
			arrayCD[i] = tmpArr[i];
		}

		return arrayCD;
	}

	/**
	 * sắp xếp giảm dần theo giá thành sao chép thông tin hiện có ra mảng khác
	 * để sắp xếp rồi gán vào lại mảng cũ sao chép để tránh trường hợp mảng hiện
	 * tại chưa đầy. mảng chưa đủ phần tử => k sắp xếp ngay đc
	 */
	public QuanLyCuaHangCD[] sortByGiaThanh(QuanLyCuaHangCD[] arrayCD) {
		int soLuong = laySoLuongCD(arrayCD);
		QuanLyCuaHangCD[] tmpArr = new QuanLyCuaHangCD[soLuong];
		for (int i = 0; i < soLuong; i++) {
			tmpArr[i] = arrayCD[i];
		}

		Arrays.sort(tmpArr, new Comparator<QuanLyCuaHangCD>() {
			@Override
			public int compare(QuanLyCuaHangCD cd1, QuanLyCuaHangCD cd2) {
				return (int) (cd2.getGiaThanh() - cd1.getGiaThanh());
			}
		});
		for (int i = 0; i < soLuong; i++) {
			arrayCD[i] = tmpArr[i];
		}
		return arrayCD;
	}

	// tính tổng tiền
	public double tongGiaThanh(QuanLyCuaHangCD[] arrayCD) {
		int soLuong = laySoLuongCD(arrayCD);
		double tongTien = 0;
		for (int i = 0; i < soLuong; i++) {
			tongTien += arrayCD[i].getGiaThanh();
		}
		return tongTien;
	}

	// thêm 1 CD vào mảng
	public QuanLyCuaHangCD[] addCD(QuanLyCuaHangCD[] arrayCD) {
		int soLuong = laySoLuongCD(arrayCD);
		if (soLuong == arrayCD.length) {
			System.out.println("Không thể thêm .Danh sách đã đầy !!!");
		} else {
			System.out.println("Nhập thông tin CD cần thêm vào: ");
			QuanLyCuaHangCD tmpCD = new QuanLyCuaHangCD();
			tmpCD = inputData();
			System.out.println();
			for (int i = 0; i < soLuong; i++) {
				if (checkmaCD(arrayCD, i, tmpCD)) {
					arrayCD[soLuong] = tmpCD;
				} else {
					System.out.println("Mã CD đã tồn tại !!!");
					break;
				}
			}

		}
		System.out.println();
		return arrayCD;
	}

	// in danh sách
	public void output(QuanLyCuaHangCD[] arrayCD) {
		int soLuong = laySoLuongCD(arrayCD);
		for (int i = 0; i < soLuong; i++) {
			System.out.println(arrayCD[i].toString());
		}
		System.out.println();
	}

	// nhập danh sách CD
	public QuanLyCuaHangCD[] arrayCD(int n) {
		QuanLyCuaHangCD[] arrayCD = new QuanLyCuaHangCD[n];
		int soLuong = 0;
		do {
			soLuong = (int) checkNumer("số lượng CD cần thêm vào");
			if (soLuong > n) {
				System.out.println("Vuợt quá số lượng tối đa !!!");
			}
		} while (soLuong > n);
		for (int i = 0; i < soLuong; i++) {
			System.out.println("CD thứ " + (i + 1) + ":");
			QuanLyCuaHangCD tmpCD = new QuanLyCuaHangCD();
			tmpCD = inputData();
			System.out.println();
			if (checkmaCD(arrayCD, i, tmpCD)) {
				arrayCD[i] = tmpCD;
			} else {
				System.out.println("Mã CD đã tồn tại !!!");
				i--;
			}
			System.out.println();
		}
		return arrayCD;
	}

	// lấy ra số lượng CD hiện tại mảng
	public int laySoLuongCD(QuanLyCuaHangCD[] arrayCD) {
		int soLuong = 0;
		for (int i = 0; i < arrayCD.length; i++) {
			if (arrayCD[i] != null) {
				soLuong++;
			}
		}
		return soLuong;
	}

	// kiểm tra mã CD có trùng nhau
	public boolean checkmaCD(QuanLyCuaHangCD[] arrayCD, int k, QuanLyCuaHangCD item) {
		for (int i = 0; i < k; i++) {
			if (item.getMaCD() == arrayCD[i].getMaCD()) {
				return false;
			}
		}
		return true;
	}

	// nhập thông tin
	public QuanLyCuaHangCD inputData() {
		int maCD = (int) checkNumer("mã CD");
		String chuDeCD = checkString("chủ đề CD");
		String tenCaSy = checkString("tên ca sỹ");
		int soBaiHat = (int) checkNumer("số bài hát");
		double giaThanh = checkNumer("giá");
		QuanLyCuaHangCD item = new QuanLyCuaHangCD(maCD, chuDeCD, tenCaSy, soBaiHat, giaThanh);
		return item;
	}

	// nhập chuỗi
	public String checkString(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("Nhập " + s + ": ");
		str = sc.nextLine();
		return str;
	}

	// kiểm tra kiểu số nhập vào
	public double checkNumer(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Double.parseDouble(sc.nextLine());
				check = false;
				if (n < 0) {
					System.out.println("Không đc nhỏ hơn 0 !!!");
					check = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Nhập bậy !!!");
				check = true;
			}
		} while (check);
		return n;
	}

}
