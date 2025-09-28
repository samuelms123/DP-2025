import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable{
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        books = new ArrayList<>();
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation clone = (Recommendation) super.clone();
            clone.books = new ArrayList<>();
            for (Book book : books) {
                clone.books.add(book.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setTargetAudience(String targetAudience) {this.targetAudience = targetAudience;}
    public String getTargetAudience() {return this.targetAudience;}

    public void addBook(Book book) {books.add(book);}

    public void removeBook(String title) {
        books.removeIf(b -> b.getTitle().equals(title));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target audience: " + targetAudience + "\n" + "Books: \n");
        for (Book book : books) {
            sb.append(book.toString() + "\n");
        }
        return sb.toString();
    }

}
