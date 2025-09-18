import java.util.Date;

public class Document implements IDocument{
    private int id;
    private Date creationDate;
    private String content;

    public Document(int id, Date creationDate, String content) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        return content;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }
}
