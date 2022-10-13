package sixteen.homework.taskonlessonone;

import java.util.Objects;

class Account {
    private String login;
    private int id;

    public Account(String login, int id) {
        this.login = login;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(login, account.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, id);
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", id=" + id +
                '}';
    }
}
