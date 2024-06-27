package weeklyQuiz.week3;

import java.util.ArrayList;
import java.util.List;

public interface BookManager<T> {

	// 도서 추가 메소드
	void addBook(Book<T> book);

	// 도서 삭제 메소드
	void removeBook(Book<T> book);

	// 도서 제목으로 검색하는 메소드
	default List<Book<T>> searchByTitle(String title) {
		List<Book<T>> list = new ArrayList<>();

		return list;
	}

	// 도서 저자로 검색하는 메소드
	default List<Book<T>> searchByAuthor(String author) {
		List<Book<T>> list = new ArrayList<>();

		return list;
	}
}
