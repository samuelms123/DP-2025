import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService accessControlService;

    HashMap<Integer, Set<User>> accessControl;

    private AccessControlService() {accessControl = new HashMap<>();}

    public static AccessControlService getAccessControlService() {
        if (accessControlService == null) {
            accessControlService = new AccessControlService();
        }
        return accessControlService;
    }

    public boolean isAllowed(int documentId, User user) {
        if (accessControl.containsKey(documentId)) {
            return accessControl.get(documentId).contains(user);
        }
        return false;
    }

    public void addAccess(int documentId, User user) {
        if (accessControl.containsKey(documentId)) {
            accessControl.get(documentId).add(user);
        }
        else {
            HashSet<User> set = new HashSet<>();
            set.add(user);
            accessControl.put(documentId, set);
        }
    }
}
