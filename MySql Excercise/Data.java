/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highschool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Gonza
 */
public class Data {
    
    public void readDataBase() throws Exception {
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String pass = "";
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stt = conn.createStatement();
             stt.execute("USE highschool");
             ResultSet res = stt.executeQuery("SELECT ass.id_teacher,t.first_name as tname, t.last_name as tlname, ass.id_course, c.name as course FROM assigned ass, course c, teacher t WHERE t.id_t = ass.id_teacher AND c.id_course = ass.id_course");
             while(res.next()){
                 System.out.println("Curse: " + res.getString("course"));
                 System.out.println("Teacher: " + res.getString("tname") + "," + res.getString("tlname"));
                 String id_course = res.getString("id_course");
                 Statement stt2 = conn.createStatement();
                 ResultSet students = stt2.executeQuery("SELECT s.first_name, s.last_name FROM assist ass, student s, course c WHERE s.id_st = ass.id_student AND c.id_course = ass.id_course AND ass.id_course = " + id_course + " ORDER BY last_name ASC");
                 System.out.println("Students: ");
                 while(students.next()){
                     System.out.println(students.getString("first_name") + ", " + students.getString("last_name"));
                 }
                 System.out.println("---------------------");
             }
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
