import java.util.Scanner;

public class Mydate {

    Scanner input = new Scanner(System.in);

    private static int day;
    private static int month;
    private static int year;

    public Mydate(int day, int month, int year) {

        Mydate.day = day;
        Mydate.month = month;
        Mydate.year = year;
    }

    public Mydate() {


    }

    public Mydate(int year) {

    }

    public int getDay() {

        return day;
    }

    public void setDay(int day) {

        Mydate.day = day;
    }

    public int getMonth() {

        return month;
    }


    public void setMonth(int month) {

        Mydate.month = month;
    }

    public int getYear() {

        return year;
    }


    public void setYear(int year) {

        Mydate.year = year;
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


        System.out.println("day  : " + getDay());
        System.out.println("month  : " + getMonth());
        System.out.println("year  : " + getYear());

        return null;
    }

    @Override
    public String toString() {

        return "\n\t\tday : " + getDay() + "\n\t\tmonth : " + getMonth() + "\n\t\tyear : " + getYear();
    }
}
