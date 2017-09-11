package testhashset_treeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class View {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("mỹ");
		hashSet.add("lập");
		hashSet.add("chiến");
		hashSet.add("nguyên");
		hashSet.add("linh");

		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("mỹ");
		treeSet.add("lập");
		treeSet.add("chiến");
		treeSet.add("nguyên");
		treeSet.add("linh");

		outputHash(hashSet);
		System.out.println();
		outputTree(treeSet);

	}

	public static void outputHash(HashSet<String> hashSet) {
		System.out.println("-------HashSet------");
		System.out.println("---LƯU NGẪU NHIÊN---");
		for (String str : hashSet) {
			System.out.println(str);
		}
	}

	public static void outputTree(TreeSet<String> treeSet) {
		System.out.println("-------TreeSet------");
		System.out.println("---LƯU CÓ SẮP XẾP---");
		for (String str : treeSet) {
			System.out.println(str);
		}
	}

}
