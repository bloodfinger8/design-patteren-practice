package me.awakedev.designpatterns._02_structural_patterns._06_adapter._02_after;

import me.awakedev.designpatterns._02_structural_patterns._06_adapter._02_after.security.LoginHandler;
import me.awakedev.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("jaewoo", "jaewoo");
        System.out.println(login);
    }
}
