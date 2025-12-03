package com.vec.stdanl.trng;
import java.sql.*;
public class DBConnect {
    private Connection conn;

    public DBConnect() throws SQLException {
        try {
            // Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            this.conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@150.136.134.100:1521:pdb", "fresher", "Vecmaster"
            );
            this.conn.setAutoCommit(false);
            createTables();
        } catch (ClassNotFoundException e) {
            throw new SQLException("Oracle JDBC Driver not found!", e);
        }
    }

    private void createTables() throws SQLException {
        Statement stmt = conn.createStatement();

        // Create students table if not exists
        String createStudents = 
        	    "BEGIN " + 
        	    "  EXECUTE IMMEDIATE 'CREATE TABLE students_fff ( " + 
        	    "      student_id NUMBER PRIMARY KEY, " + 
        	    "      name VARCHAR2(50), " + 
        	    "      age NUMBER, " + 
        	    "      department VARCHAR2(30) " + 
        	    "  )'; " + 
        	    "EXCEPTION " + 
        	    "  WHEN OTHERS THEN " + 
        	    "    IF SQLCODE != -955 THEN RAISE; END IF; " + 
        	    "END;";

        // Create marks table if not exists
        String createMarks = 
        	    "BEGIN " + 
        	    "  EXECUTE IMMEDIATE 'CREATE TABLE marks_fff ( " + 
        	    "      mark_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY, " + 
        	    "      student_id NUMBER REFERENCES students_fff(student_id), " + 
        	    "      subject_code NUMBER, " + 
        	    "      score NUMBER " + 
        	    "  )'; " + 
        	    "EXCEPTION " + 
        	    "  WHEN OTHERS THEN " + 
        	    "    IF SQLCODE != -955 THEN RAISE; END IF; " + 
        	    "END;";

        stmt.execute(createStudents);
        stmt.execute(createMarks);
        stmt.close();
        conn.commit();
    }

    public void insertStudent(Student s) throws SQLException {
        String query = "MERGE INTO students_fff t " +
                       "USING (SELECT ? AS student_id, ? AS name, ? AS age, ? AS department FROM dual) d " +
                       "ON (t.student_id = d.student_id) " +
                       "WHEN NOT MATCHED THEN " +
                       "  INSERT (student_id, name, age, department) VALUES (d.student_id, d.name, d.age, d.department)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, s.getStudentId());
            stmt.setString(2, s.name);
            stmt.setInt(3, s.age);
            stmt.setString(4, s.getDepartment());
            stmt.executeUpdate();
            conn.commit();
        }
    }

    public void insertMark(int studentId, int subjectCode, int score) throws SQLException {
        String query = "INSERT INTO marks_fff (student_id, subject_code, score) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, studentId);
            stmt.setInt(2, subjectCode);
            stmt.setInt(3, score);
            stmt.executeUpdate();
            conn.commit();
        }
    }

    public void close() throws SQLException {
        if (conn != null) conn.close();
    }
}
