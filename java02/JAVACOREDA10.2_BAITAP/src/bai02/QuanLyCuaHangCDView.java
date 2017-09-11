package bai02;

import java.text.DecimalFormat;

public class QuanLyCuaHangCDView {

	public static void main(String[] args) {
		QuanLyCuaHangCDController controller = new QuanLyCuaHangCDController();
		int n = (int) controller.checkNumer("số lượng CD tối đa");
		QuanLyCuaHangCD[] arrayCD = new QuanLyCuaHangCD[n];
		boolean check = true;
		do {
			switch (controller.menu()) {
			case 1:
				arrayCD = controller.arrayCD(n);
				break;
			case 2:
				arrayCD = controller.addCD(arrayCD);
				break;
			case 3:
				System.out.println("\nSố lượng CD có trong danh sách: " + controller.laySoLuongCD(arrayCD));
				break;
			case 4:
				DecimalFormat decimalFormat = new DecimalFormat("#,###.000");
				double tongTien = controller.tongGiaThanh(arrayCD);
				System.out.println("\nTổng giá thành: " + decimalFormat.format(tongTien) + " VNĐ");
				break;
			case 5:
				arrayCD = controller.sortByGiaThanh(arrayCD);
				controller.output(arrayCD);
				break;
			case 6:
				arrayCD = controller.sortByChuDe(arrayCD);
				controller.output(arrayCD);
				break;
			case 7:
				controller.output(arrayCD);
				break;
			case 8:
				check = false;
				break;

			default:
				System.out.println("Không có chức năng này !!!");
				check = true;
				break;
			}
		} while (check);
		System.out.println("------------bye------------");
	}

}