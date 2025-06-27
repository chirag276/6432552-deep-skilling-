public class UserService {
    private Notifier notifier;

    public UserService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void registerUser(String username) {
        // Simulate registration logic
        notifier.sendMessage("Welcome " + username);
    }
}
