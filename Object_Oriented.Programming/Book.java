public class Book {
    String title;
    String author;
    int pages;

    public Book(String t, String a, int p) {
        this.title = t;
        this.author = a;
        this.pages = p;
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 328);
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book b3 = new Book("The Great Cheater", "Nat Nat", 281);
        Book b4 = new Book("Pink Lover", "Aling", 180);
        Book b5 = new Book("Bad Copyer", "Jeanin", 256);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
    }
}