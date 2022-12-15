import java.util.Scanner;

public class Mydate {

    protected static int day;
    protected static int month;

    protected static int year;
    Scanner input = new Scanner(System.in);

    public Mydate(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Mydate() {
    }

    public boolean HandleDate() {

        int DayLimit[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("year : " + year);

        if (year % 4 == 0) {

            DayLimit[2] = 29;
        }
        if (month > 12 || month < 0) {

            return false;
        }
        if (year < 0) {

            return false;
        }

        if ((day > DayLimit[month])) {

            return false;
        }

        return true;
    }

    public String ShowDate(int DAY, int MONTH, int YEAR){

        System.out.print(DAY + "/" + MONTH + "/" + YEAR);

        return "";
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
    }


    @Override
    public String toString() {

        return "\n\t\tday : " + day + "\n\t\tmonth : " + month + "\n\t\tyear : " + year;
    }

}
