package practice_240619.practice7;

import java.util.LinkedList;
import java.util.Queue;

// queue
public class MessageTest {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();

		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "제니"));
		messageQueue.offer(new Message("sendKakaoTalk", "리사"));
		messageQueue.offer(new Message("sendDWeeklyQuiz", "김승조"));

		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.getCommand()) {
				case "sendMail":
					System.out.println(message.getTo() + "메일을 보냅니다.");
					break;
				case "sendSMS" :
					System.out.println(message.getTo() + "SMS를 보냅니다.");
					break;
				case "sendKakaoTalk":
					System.out.println(message.getTo() + "카카오톡 보냅니다.");
					break;
				default:
					System.out.println(message.getTo() + "아무거나 보냅니다.");
					break;
			}
		}
	}

}
