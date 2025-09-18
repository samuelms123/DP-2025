import java.util.Date;
import java.util.HashMap;

public class Library {
    HashMap<Integer, IDocument> storage;

    public Library() {
        storage = new HashMap<>();
    }

    public void addDocument(IDocument document) {
        storage.put(document.getId(), document);
    }

    public IDocument getDocument(int id) {
        return storage.get(id);
    }

    public void createDocument(int id, String content) {
        Date creationDate = new Date();
        IDocument document = new Document(id, creationDate, content);
        storage.put(id, document);

    }

    public void createPrivateDocument(int id, String content, User grantAccessTo) {
        Date creationDate = new Date();
        IDocument document = new Document(id, creationDate, content);
        DocumentProxy proxy = new DocumentProxy(document);
        AccessControlService.getAccessControlService().addAccess(document.getId(), grantAccessTo);

        storage.put(id, proxy);
    }
}
