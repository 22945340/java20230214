package ch15.sec06.exam02;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "강자바"));
		
		while(!messageQueue.isEmpty()){
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 SMS를보냅니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "님에게 카톡을보냅니다.");
				break;
			
			}
		}
	}

}