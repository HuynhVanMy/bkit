package bai02;

public class DanSo {

	public static void main(String[] args) {

		int soDan = danSo(100000);
		System.out.println(soDan);
		System.out.println(ReadNumberAdv.readNum(soDan));

	}

	public static int danSo(int soDan) {
		int sodan = soDan;
		for (int i = 1; i < 10; i++) {
			sodan += sodan * 0.025;
		}
		return sodan;
	}

}
