package core.eighteen_generics.taskOnLesson;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String username;
    private final List<Account> accountList = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(Account account) {
        accountList.add(account);
    }

    public String getUsername() {
        return username;
    }
}
