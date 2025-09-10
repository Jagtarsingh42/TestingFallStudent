/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author jagta
 */
public class Student {
    private int sid;
    private String name;
    
    public int getSid() {
        return sid;
    }    
    
    public void setSid(int sid){
        this.sid=sid;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Student ID: " + sid + "\tName: " + name;
    }
    
}
