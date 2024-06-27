package weeklyQuiz.week3;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
	private Stack<Book<T>> books;

	public BookStack() {
		this.books = new Stack<>();
	}

	// Stack 맨 위에 도서 추가
	public void pushBook(Book<T> book) {
		books.push(new Book<>(book.getTitle(), book.getAuthor(), book.getIdentifier()));
	}

	// Stack 맨 위에 있는 도서 삭제 후 반환
	public Book<T> popBook() {
		while (!books.isEmpty()) {
			Book<T> bookPop = books.pop();

			return bookPop;
		}
		throw new EmptyStackException();
	}

	// Stack 맨 위에 있는 도서 반환(삭제x)
	public Book<T> peekBook() {
		while (!books.isEmpty()) {
			Book<T> bookPop = books.peek();

			return bookPop;
		}
		throw new EmptyStackException();
	}

	// Stack 비어있으면 true, 아니면 false 반환
	public boolean isEmpty() {
		if (books.isEmpty()) {
			return true;
		}
		return false;
	}
}
