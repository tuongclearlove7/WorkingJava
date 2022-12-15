class Mytime {

    private static int second;

    private static int minutes;

    private static int hour;

    public Mytime(int second, int minutes, int hour) {

        this.second = second;
        this.minutes = minutes;
        this.hour = hour;
    }

    public static String Output(String time){

        return time;
    }

    @Override
    public String toString() {

        String time = "MyTime : { \n\n\t\t" + hour + ":" + minutes + ":" + second + "\n}";

        return Output(time);
    }
}

class Mydate{

    private int day;

    private int month;

    private int year;

    public Mydate(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static String Output(String date){


        return date;
    }

    @Override
    public String toString() {

        String date = "\nMyDate : { \n\n\t\t" + day + "/" + month + "/" + year + "\n}";

        return Output(date);
    }

}

public class Main {

    public static void main(String args[]){

        Mytime time = new Mytime(10,10,22);
        Mydate date = new Mydate(16,1,2002);

        System.out.print(time);
        System.out.print(date);
    }
}


