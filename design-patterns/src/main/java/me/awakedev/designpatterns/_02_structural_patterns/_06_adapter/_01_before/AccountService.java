package me.awakedev.designpatterns._02_structural_patterns._06_adapter._01_before;

public class AccountService {
    public Account findAccountByUsername(String username) {
        return new Account(username,username,username);
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }
}
