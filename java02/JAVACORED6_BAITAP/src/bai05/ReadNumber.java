package bai05;

import java.util.Scanner;

public class ReadNumber {

	public void readNumber() {

		int n = inputData();
		int[] A = toArr(n);
		String read = "";
		for (int i = A.length - 1; i >= 0; i--) {
			switch (i) {
			case 0: // hàng đơn vị
				if (ktSoLuong(n) == 1) {
					if (A[i] == 0) {
						read += "Không";
					} else {
						read += output(A[i]);
					}
				} else {
					if (A[i] == 1 && A[i + 1] > 1) {
						read += "Mốt";
					} else if (A[i] == 5 && A[i + 1] > 0) {
						read += "Lăm";
					} else {
						read += output(A[i]);
					}
				}
				break;
			case 1: // hàng chục
				if (A[i] == 0) {
					if (A[i - 1] > 0) {
						read += "Linh ";
						break;
					}
					break;
				} else if (A[i] == 1) {
					read += "Mười ";
					break;
				} else {
					read += output(A[i]) + "Mươi ";
					break;
				}
			case 2:
				read += output(A[i]) + "Trăm ";
				break; // hàng trăm
			}
		}

		System.out.println(read);
	}

	public String output(int n) {
		String[] s1 = { "", "Một ", "Hai ", "Ba ", "Bốn ", "Năm ", "Sáu ", "Bảy ", "Tám ", "Chín " };
		String read = "";
		switch (n) {
		case 0:		read += s1[0];	break;
		case 1:		read += s1[1];	break;
		case 2:		read += s1[2];	break;
		case 3:		read += s1[3];	break;
		case 4:		read += s1[4];	break;
		case 5:		read += s1[5];	break;
		case 6:		read += s1[6];	break;
		case 7:		read += s1[7];	break;
		case 8:		read += s1[8];	break;
		case 9:		read += s1[9];	break;
		}

		return read;
	}

	public int inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập số: ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
				checkNumber(n);
			} catch (NumberFormatException e) {
				System.out.println("không đc nhập bậy !!!");
				check = true;
			}

		} while (check);

		return n;
	}

	// kiểm tra số nhập vào tối đa là 3 chữ số
	public void checkNumber(int n) throws NumberFormatException {
		if (n < 0 || n > 999) {
			throw new NumberFormatException();
		}
	}

	// kiểm tra số nhập vào có mấy chữ số
	public int ktSoLuong(int n) {
		int count = 0;
		do {
			n /= 10;
			count++;
		} while (n > 0);

		return count;
	}

	// tách số và đưa vào mảng
	public int[] toArr(int n) {
		int[] A = new int[ktSoLuong(n)];
		int i = 0;
		do {
			A[i++] = n % 10;
			n /= 10;
		} while (n > 0);

		return A;
	}

}
