public class Main {


    public static void main(String[] args){

        MyAddress myadd = new MyAddress("Da Nang","Lien Chieu");
        MyDate date = new MyDate(16,1,2002);
        MyDate date1 = new MyDate(9,9,2003);
        MyDate date2 = new MyDate(13,3,1998);

        myadd.cancel();
        date.Output();

        System.out.print("So sanh > 2 doi tuong trong Mydate la : ");
        System.out.print(date1.getThang() > date2.getNam());



    }
}
