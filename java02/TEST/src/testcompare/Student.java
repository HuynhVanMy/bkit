package testcompare;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private double diem;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double diem) {
		super();
		this.id = id;
		this.name = name;
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "" + id + "\t" + name + "\t" + diem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	@Override
	public int compareTo(Student o) {
		return this.id - o.getId();
	}

}
