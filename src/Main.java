import Access.Access;
import Access.WrongLoginException;
import Access.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        Access donatello = new Access("Donatello", "qaz?WSX123", "qaz?WSX123");
        Access leonardo = new Access("Leonardo", "qazWSX123", "qazWSX123");
        Access rafael = new Access("Rafael-", "q/azWSX123", "qazWSX123");
        Access michelangelo = new Access("Michelangelo", "qazWSX123", "qazWSX123");
        checkAccess(donatello,leonardo,rafael);
//        Access.checkAccess(donatello);

    }

    public static void checkAccess(Access... accesses) {
        for (Access access : accesses) {
            Access.checkAccess(access);
        }
    }
}