package practice_240619.practice5;

import java.util.Objects;

public class Student {
	public int no;
	public String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student student)) return false;
		return no == student.no && Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(no, name);
	}
}
