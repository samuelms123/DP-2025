import java.util.Date;

public class DocumentProxy implements IDocument {
    private IDocument document;

    public DocumentProxy(IDocument document) {
        this.document = document;
    }
    @Override
    public Integer getId() {
        return document.getId();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        boolean hasAccess = AccessControlService.getAccessControlService().isAllowed(document.getId(), user);

        if (hasAccess) {
            return document.getContent(user);
        }
        else {
            throw new AccessDeniedException("Access not granted to document id: " + document.getId());
        }
    }

    @Override
    public Date getCreationDate() {
        return document.getCreationDate();
    }
}
