package me.awakedev.designpatterns._02_structural_patterns._06_adapter._02_after;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Account {
    private String name;
    private String password;
    private String email;
}
