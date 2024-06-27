package weeklyQuiz.week3;

import java.util.ArrayList;
import java.util.List;

// BookManager 인터페이스 구현
public class BookShelf<T> implements BookManager<T> {

	private List<Book<T>> books;

	// 생성자(books필드를 빈 ArrayList로 초기화)
	public BookShelf() {
		this.books = new ArrayList<Book<T>>();
	}

	// books 도서 추가
	@Override
	public void addBook(Book<T> book) {
		books.add(book);
	}

	// books 도서 삭제
	@Override
	public void removeBook(Book<T> book) {
		// 삭제할 도서가 있을 경우 remove
		if (books.contains(book)) {
			books.remove(book);
		}
	}

	// 도서 제목으로 검색하는 메소드
	@Override
	public List<Book<T>> searchByTitle(String title) {
		// 대소문자 구분 않고 검색 || 부분 일치하는 제목도 검색 결과에 포함
		// 둘 중 하나라도 true 일 때 값 반환
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).toString().equalsIgnoreCase(title) ||
				books.get(i).toString().contains(title)) {

				return BookManager.super.searchByTitle(title);
			}
		}
		return BookManager.super.searchByTitle(title);
	}

	// 도서 저자로 검색하는 메소드
	@Override
	public List<Book<T>> searchByAuthor(String author) {
		// 대소문자 구분 않고 검색 || 부분 일치하는 제목도 검색 결과에 포함
		// 둘 중 하나라도 true 일 때 값 반환
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).toString().equalsIgnoreCase(author) ||
				books.get(i).toString().contains(author)) {

				return BookManager.super.searchByAuthor(author);
			}
		}
		return BookManager.super.searchByAuthor(author);
	}
}
