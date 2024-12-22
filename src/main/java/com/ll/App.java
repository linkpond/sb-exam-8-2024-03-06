package com.ll;

import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("할일 관리 앱, 시작");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.printf("명령) ");
                String cmd = scanner.nextLine().trim();

                if (cmd.equals("exit")) break;
                else if (cmd.equals("add")) {
                    long id = 1;
                    System.out.println("할일: ");
                    String content = scanner.nextLine().trim();

                    Todo todo = new Todo(id, content);

                    System.out.println(todo.getId());

                    System.out.printf("%d번 할일이 생성되었습니다.\n", id);
                }
            }
        }


        System.out.println("할일 관리 앱, 끝");
    }
}
