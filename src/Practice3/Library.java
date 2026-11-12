package Practice3;

import java.util.*;

public class Library {
    static ArrayList<Book> books=new ArrayList<>();
    static Random random=new Random();
    static Scanner read=new Scanner(System.in);

    static void main() {
        for (int i=0;i< 3;i++){
            System.out.println("Write the name of the book");
            String name=read.nextLine();

            System.out.println("Write the gender");
            String gender=read.nextLine();

            books.add(i,new Book(name,gender, random.nextInt(5),random.nextDouble(100)));
        }

        books.sort(Comparator.comparingInt(Book::getScore).reversed().thenComparing(Book::getName));

        System.out.println("\n BOOKS");
        for (int i=0;i< books.size();i++){
            System.out.println("\n"+books.get(i).toString());
        }
    }
}
