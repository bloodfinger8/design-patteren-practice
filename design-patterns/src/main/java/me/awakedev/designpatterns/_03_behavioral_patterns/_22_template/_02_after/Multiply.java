package me.awakedev.designpatterns._03_behavioral_patterns._22_template._02_after;

public class Multiply extends FileProcessor{
    private String path;

    public Multiply(String path) {
        this.path = path;
    }

    @Override
    protected int getResult(int result, int number) {
        return result *= number;
    }
}
