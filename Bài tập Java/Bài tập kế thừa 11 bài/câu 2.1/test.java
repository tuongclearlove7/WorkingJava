import java.io.*;
import java.util.*;

public class test {
    public static void main(String args[])
    {
        // Creating an empty Set
        Set<String> st = new HashSet<String>();

        // Use add() method to add elements into the Set
        st.add("Welcome");
        st.add("To");
        st.add("Geeks");
        st.add("4");
        st.add("Geeks");

        // Displaying the Set
        System.out.println("Initial Set: " + st);

        // Clearing the Set using clear() method
        st.clear();

        // Displaying the final Set after clearing;
        System.out.println("The final set: " + st);
    }
}
