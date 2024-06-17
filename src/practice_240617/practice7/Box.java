package practice_240617.practice7;

// public class Box {
// 	private Object object;
//
// 	public void set(Object object) {
// 		this.object = object;
// 	}
//
// 	public Object get() {
// 		return this.object;
// 	}
// }

public class Box<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
	public boolean isIns(){
		return t instanceof String;
	}
}