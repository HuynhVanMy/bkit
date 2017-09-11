package bai05;

public class Card {

	private int face;
	private int number;

	public Card() {
		this.face = (int) (Math.random() * 4);
		this.number = (int) (Math.random() * 13);
	}

	@Override
	public String toString() {
		String result = "";
		switch (number) {
		case 0: result =  "Xì";  break;
		case 1: result =  "Heo";  break;
		case 2: result =  "Ba";  break;
		case 3: result =  "Bốn";  break;
		case 4: result =  "Năm";  break;
		case 5: result =  "Sáu";  break;
		case 6: result =  "Bảy";  break;
		case 7: result =  "Tám";  break;
		case 8: result =  "Chín";  break;
		case 9: result =  "Mười";  break;
		case 10: result = "Bồi";  break;
		case 11: result = "Đầm";  break;
		case 12: result = "Dà";  break;
		}
		
		switch (face) {
		case 0: result += " bích ";  break;
		case 1: result += " chuồn";  break;
		case 2: result += " rô   ";  break;
		case 3: result += " cơ   ";  break;
		}
		return result;
	}
	
	public int getFace() {
		return face;
	}

	public void setFace(int face) {
		this.face = face;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
