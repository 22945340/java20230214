package ch15.exercise.example_ETC.Exam0620;

import java.util.*;

public class BankApplictaion {
	public static void main(String[] args) {
		List<Account> accountList = new ArrayList<>();
		int numOfAccounts = 0;
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>");

			int menu = scanner.nextInt();

			switch (menu) {
			case 1 -> {
				// 계좌생성
				System.out.println("-----------");
				System.out.println("계좌생성");
				System.out.println("-----------");

				System.out.print("계좌번호:");
				String number = scanner.next();

				System.out.print("계좌주:");
				String name = scanner.next();

				System.out.print("초기입금액:");
				int money = scanner.nextInt();

				Account account = new Account();
				account.setNumber(number);
				account.setName(name);
				account.setMoney(money);
				accountList.add(account);

				numOfAccounts++;

				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			case 2 -> {
				// 목록 보여주기
				System.out.println("-----------");
				System.out.println("계좌목록");
				System.out.println("-----------");

				System.out.println("계좌번호      계좌주     현재잔액");

				for (Account accounts : accountList) {
					System.out.printf("%7s%10s%10d%n", accounts.getNumber(), accounts.getName(), accounts.getMoney());
				}
			}
			case 3 -> {
				// 예금
				System.out.println("-----------");
				System.out.println("예금");
				System.out.println("-----------");

				System.out.print("계좌번호: ");
				String number = scanner.next();

				System.out.print("예금액: ");
				int inputMoney = scanner.nextInt();

				// 입력된 계좌번호를 가진 Account 객체 찾아서
				for (int i = 0; i < numOfAccounts; i++) {
					Account cur = accountList.get(i);

					if (cur.getNumber().equals(number)) {
						// 입력 받은 금액을 더해서 다시 넣어준다(set)
						int money = cur.getMoney() + inputMoney;
						cur.setMoney(money);
						System.out.println(inputMoney + "원 예금 완료, 잔액: " + cur.getMoney());
					}
				}

			}
			case 4 -> {
				// 출금
				System.out.println("-----------");
				System.out.println("출금");
				System.out.println("-----------");

				System.out.print("계좌번호: ");
				String number = scanner.next();

				System.out.print("출금액: ");
				int inputMoney = scanner.nextInt();

				// 입력된 계좌번호를 가진 Account 객체 찾아서
				for (int i = 0; i < numOfAccounts; i++) {
					Account cur = accountList.get(i);

					if (cur.getNumber().equals(number)) {
						// 입력 받은 금액을 빼서 다시 넣어준다(set)
						int money = cur.getMoney() - inputMoney;
						if (money >= 0) {
							cur.setMoney(money);
							System.out.println(inputMoney + "원 출금 완료, 잔액: " + cur.getMoney());
						} else {
							System.out.println("잔액이 부족합니다.");
						}
					}
				}
			}
			case 5 -> {
				// 종료
				run = false;
			}

			}
		}

		System.out.println("프로그램 종료");
	}
}
