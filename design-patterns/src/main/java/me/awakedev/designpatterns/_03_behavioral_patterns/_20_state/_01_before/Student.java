package me.awakedev.designpatterns._03_behavioral_patterns._20_state._01_before;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<OnlineCourse> privateCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.privateCourses.add(onlineCourse);
    }

    public boolean isEnabledForPrivateClass(OnlineCourse onlineCourse) {
        return privateCourses.contains(onlineCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
