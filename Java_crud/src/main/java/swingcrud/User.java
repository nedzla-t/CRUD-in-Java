/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingcrud;

/**
 *
 * @author Nedzla
 */
public class User {
    String fname, lname, id;
    public User(String fname, String lname, String id) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }
    
    // getters
    public String getFname() {
        return this.fname;
    }
    public String getLname() {
        return this.lname;
    }
    public String getId() {
        return this.id;
    }
}
