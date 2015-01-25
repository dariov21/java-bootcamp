/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highschool;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Gonza
 */
public class HighSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Data d = new Data();
            d.readDataBase();
        } catch (Exception ex) {
            Logger.getLogger(HighSchool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
