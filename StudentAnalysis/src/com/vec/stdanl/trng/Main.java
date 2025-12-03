package com.vec.stdanl.trng;

import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            DBConnect db = new DBConnect();

            // Insert Students
            for (Student s : SampleData.getStudents()) {
                db.insertStudent(s);
            }

            // Insert Marks
            Map<Integer, List<int[]>> marksData = SampleData.getMarks();
            for (var entry : marksData.entrySet()) {
                int sid = entry.getKey();
                for (int[] mark : entry.getValue()) {
                    db.insertMark(sid, mark[0], mark[1]);
                }
            }

            db.close();
            System.out.println("✅ Data inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
