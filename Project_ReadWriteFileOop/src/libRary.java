import java.io.*;
import java.util.ArrayList;

/**
 *
 * Thư viện hàm
 *
 * */

abstract class libRary {

      public static void writeFile(ArrayList<Laptop> DATA_LIST,  Laptop lap){

        try {

            File file = new File(App.path);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            DATA_LIST.add(lap);

            for (int i = 0; i < DATA_LIST.size(); i++){

                bw.write(DATA_LIST.get(i) + "");

                bw.newLine();
            }

            bw.write(", Thanh tien : " + lap.Check_Money((int) App.userAmount.getValue(), (int) App.userReceipt.getValue()) + " USD\n");

            bw.close();
            fw.close();

        }

        catch (Exception err) {

            err.printStackTrace();
        }

         try{

             String mydata =  libRary.readFile(App.path);

             FileWriter fw = new FileWriter("data2.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);

             bw.write(mydata);

             bw.close();
             fw.close();

         }

         catch (Exception E){

             E.printStackTrace();
         }
    }

    public static String readFile(String path) {

        String data = null;

        try {

            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;

            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append("\n");
                data = sb + "";

            }

            fr.close();
        }

        catch (Exception ignored){

            System.out.println("fail");
        }


        return data;
    }
}
