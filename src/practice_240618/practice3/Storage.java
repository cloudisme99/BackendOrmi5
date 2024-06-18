package practice_240618.practice3;

public interface Storage<T> {
	void add(T item, int index);

	T get(int index);

}
