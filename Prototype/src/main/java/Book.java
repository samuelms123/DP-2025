public class Book implements Cloneable {
    private String author;
    private String title;
    private int publicationYear;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }


    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return title + "\t" + author + "\t" + "\t" + publicationYear;
    }
}
