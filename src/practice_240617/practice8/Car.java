package practice_240617.practice8;

public class Car<T> {
	private T t;

	public void setCar(T t) {
		this.t = t;
	}

	public T getCar() {
		return t;
	}
}
