import java.util.Date;

public interface IDocument {
    Integer getId();
    String getContent(User user) throws AccessDeniedException;
    Date getCreationDate();
}
