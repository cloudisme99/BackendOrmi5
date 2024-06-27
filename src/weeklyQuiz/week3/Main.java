package weeklyQuiz.week3;

public class Main {

	public static void main(String[] args) {
		// String 타입의 식별자를 사용하는 BookShelf 객체를 생성
		BookShelf<String> bookShelf = new BookShelf<>();

		// Integer 타입의 식별자를 사용하는 BookStack 객체를 생성
		BookStack<Integer> bookStack = new BookStack<>();

		// BookShelf 도서 정보 추가
		bookShelf.addBook(new Book<>("책제목1", "작가1", "1"));

		// BookStack 도서 정보 추가
		bookStack.pushBook(new Book<>("책제목2", "작가2", 2));
		bookStack.pushBook(new Book<>("책제목3", "작가3", 3));

		// BookShelf 제목 & 저자 검색
		// BookManager에서 해당 메소드를 작성하지 못함
		System.out.println("BookShelf 제목 검색: " + bookShelf.searchByTitle("책제목1"));
		System.out.println("BookShelf 저자 검색: " + bookShelf.searchByAuthor("작가1"));

		System.out.println("=========================");

		// BookStack 도서 꺼내고 삭제 후 반환
		// 디버그로 popBook()메서드 안에서 return 값인 bookPop 안에 pop된 데이터가 들어있는것 까지는 확인
		// 그걸 title, author, identifier 모두 꺼내는 방법을 모르겠음
		// 우선 title인 getTitle을 출력하도록 작성
		System.out.println("BookStack pop 제목: " + bookStack.popBook().getTitle());

		System.out.println("=========================");

		// BookStack 맨 위의 도서
		System.out.println("BookStack 책제목: " + bookStack.peekBook().getTitle());
		System.out.println("BookStack 작가: " + bookStack.peekBook().getAuthor());
		System.out.println("BookStack 식별자: " + bookStack.peekBook().getIdentifier());

		System.out.println("=========================");

		// BookStack 비어있는지 확인
		System.out.println("BookStack 비어있는지 여부: " + bookStack.isEmpty());

		System.out.println("=========================");

	}
}
