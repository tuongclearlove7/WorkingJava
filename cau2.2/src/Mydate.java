import java.util.Scanner;

public class Mydate {

    Scanner input = new Scanner(System.in);

    private  int day;
    private  int month;
    private  int year;

    public Mydate(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Mydate() {


    }

    public Mydate(int year) {

    }

    public int getDay() {

        return day;
    }

    public void setDay(int day) {

        this.day = day;
    }

    public int getMonth() {

        return month;
    }


    public void setMonth(int month) {

        this.month = month;
    }

    public int getYear() {

        return year;
    }


    public void setYear(int year) {

        this.year = year;
    }

    public boolean HandleDate() {

        int[] dayMax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("year : " + year);

        if (year % 4 == 0) {

            dayMax[2] = 29;
        }
        if (month > 12 || month < 0) {

            return false;
        }
        if (year < 0) {

            return false;
        }

        if ((day > dayMax[month])) {

            return false;
        }

        return true;
    }

    public void ShowDate(int DAY, int MONTH, int YEAR){

        System.out.print(DAY + "/" + MONTH + "/" + YEAR);
    }

    public void input() {

        do {

            System.out.println("Nhap ngay : ");
            day = input.nextInt();

            System.out.println("Nhap thang : ");
            month = input.nextInt();

            System.out.println("Nhap nam : ");
            year = input.nextInt();

        }
        while (!HandleDate());

        ShowDate(day,month,year);


    }

    public Officer Output(){


        System.out.println("\nday  : " + getDay());
        System.out.println("month  : " + getMonth());
        System.out.println("year  : " + getYear());

        return null;
    }

    @Override
    public String toString() {

        return "day : " + getDay() + ", month : " + getMonth() + ", year : " + getYear();
    }
}
