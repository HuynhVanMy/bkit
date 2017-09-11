package bai01;

public class Bai01 {
	public static void main(String[] args) {
		Bai01 item = new Bai01();
		item.hinh01();
		System.out.println();
		item.hinh02();
		System.out.println();
		item.hinh03();

	}

	public void hinh01() {
		int n = 8;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || i == n || j == i || j == n - i || j == 0 || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public void hinh02() {
		int n = 10; // chiều cao
		int m = n * 2; // chiều dài đáy
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (i == n - 1) {
					System.out.print("* ");
				} else if (j == m / 2 - i || j == m / 2 + i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public void hinh03() {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n) {
					System.out.print("* ");
				} else if (j == 1 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
