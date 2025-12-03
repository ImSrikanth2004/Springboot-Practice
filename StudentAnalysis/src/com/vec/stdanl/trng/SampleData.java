package com.vec.stdanl.trng;

import java.util.*;

public class SampleData {
    public static List<Student> getStudents() {
        return Arrays.asList(
            new Student(1, "Yogesh", 22, "Computer Science"),
            new Student(2, "Mansoor", 21, "Maths"),
            new Student(3, "Srikanth", 23, "Physics")
        );
    }

    public static Map<Integer, List<int[]>> getMarks() {
        // Format: studentId → list of [subjectCode, score]
        Map<Integer, List<int[]>> marks = new HashMap<>();

        marks.put(1, Arrays.asList(new int[]{101, 85}, new int[]{102, 90}));
        marks.put(2, Arrays.asList(new int[]{101, 78}, new int[]{103, 88}));
        marks.put(3, Arrays.asList(new int[]{104, 92}, new int[]{105, 95}));

        return marks;
    }
}

