/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author This PC
 */
public class taxmanagement {


    public static void main(String[] args){
        ArrayList<Student> listStudent=new  ArrayList<>();
        Student st=new Student();
        st.listStudent(listStudent);
        st.ouputListStudent(listStudent);
        st.countTax(listStudent);
        
    }
}
