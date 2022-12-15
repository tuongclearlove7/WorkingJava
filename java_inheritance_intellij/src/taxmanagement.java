import java.util.ArrayList;


public class taxmanagement {


    public static void main(String[] args){

        ArrayList<Student> listStudent = new  ArrayList<>();
        Student st=new Student();
        st.listStudent(listStudent);
        st.ouputListStudent(listStudent);
        st.countTax(listStudent);
        
    }
}
