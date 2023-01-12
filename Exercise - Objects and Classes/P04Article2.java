
import Articles.Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class P04Article2 {
        private String title;
        private String content;
        private String author;

        public P04Article2 (String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<P04Article2> articleList = new ArrayList<>();
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= n; i++) {
                String article = scanner.nextLine();
                String[] parts = article.split(", ");
                String title = parts[0];
                String content = parts[1];
                String author = parts[2];

                P04Article2 currentArticle = new P04Article2(title, content, author);
                articleList.add(currentArticle);
            }

            String command = scanner.nextLine();

            for (P04Article2 current : articleList) {
                String result = current.toString();
                System.out.println(result);
            }
        }
    }

