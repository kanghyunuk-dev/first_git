package ex01;

import java.util.ArrayList;
import java.util.Scanner;

// 게시물 표현
class Post {
    private String title;
    private String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

// 게시판관리
class Board {
    private ArrayList<Post> posts;

    public Board() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
        System.out.println("게시물이 성공적으로 등록되었습니다.");
    }

    public void displayPosts() {
        if (posts.isEmpty()) {
            System.out.println("게시물이 없습니다.");
        } else {
            System.out.println("===== 전체 게시물 =====");
            for (Post post : posts) {
                System.out.println("제목: " + post.getTitle());
                System.out.println("내용: " + post.getContent());
                System.out.println("---------------------");
            }
        }
    }
}


// 게시판 콘솔 출력
public class ConsoleBulletinBoard {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        while (true) {
            System.out.println("1. 게시물 등록");
            System.out.println("2. 전체 게시물 조회");
            System.out.println("3. 종료");
            System.out.print("선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 처리

            switch (choice) {
                case 1:
                    System.out.print("제목을 입력하세요: ");
                    String title = scanner.nextLine();
                    System.out.print("내용을 입력하세요: ");
                    String content = scanner.nextLine();
                    Post newPost = new Post(title, content);
                    board.addPost(newPost);
                    break;
                case 2:
                    board.displayPosts();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }
}
