package bai05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XaoBai {

	// public void output02(List<People> peopleList) {
	// System.out.println("chia bài 02");
	// for (People people : peopleList) {
	// System.out.println(people.toString());
	// output(people.getBai());
	// }
	// }
	//
	public List<People> chiaBai(List<Card> alItem) {
		System.out.println("chia bài1");
		List<People> peopleList = new ArrayList<>();
		int tmp = 0;
		for (int i = 0; i < 4; i++) {
			tmp=0;
			System.out.println("chia bài2");
			List<Card> tmpItem = new ArrayList<>();
			for (Card card : alItem) {
				System.out.println("chia bài3");
				tmpItem.add(card);
				tmp++;
				if (tmp % 13 == 0) {
					System.out.println("break");
					break;
				}

			}
			//peopleList.get(i).setBai(tmpItem);
		}

		return peopleList;
	}

	public void xaoBai(List<Card> alItem) {
		Collections.shuffle(alItem);
	}

	public void output(List<Card> alItem) {
		int i = 0;
		for (Card card : alItem) {
			i++;
			System.out.print(i + " " + card.toString() + "\t");
			if (i % 13 == 0) {
				System.out.println();
			}
		}
	}

	public List<Card> card() {
		List<Card> alItem = new ArrayList<>();
		int count = 0;
		do {
			Card item = new Card();
			if (check(alItem, item)) {
				alItem.add(item);
				count++;
			}
		} while (count < 52);

		return alItem;
	}

	public boolean check(List<Card> alItem, Card item) {
		for (Card card : alItem) {
			if (card.getFace() == item.getFace() && card.getNumber() == item.getNumber()) {
				return false;
			}
		}
		return true;
	}

}
