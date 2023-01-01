import java.util.Scanner;

class MyDate {

    Scanner input = new Scanner(System.in);

    private int ngay;

    private int thang;

    private int nam;

    public MyDate(String province, String district,int ngay, int thang, int nam) {

        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public MyDate(int ngay, int thang, int nam) {

        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {

        return ngay;
    }

    public void setNgay(int ngay) {

        this.ngay = ngay;
    }

    public int getThang() {

        return thang;
    }

    public void setThang(int thang) {

        this.thang = thang;
    }

    public int getNam() {

        return nam;
    }

    public void setNam(int nam) {

        this.nam = nam;
    }

    public void Input(){

        System.out.println("Input day : ");
        ngay = input.nextInt();

        System.out.println("Input month : ");
        thang = input.nextInt();

        System.out.println("Input year : ");
        nam = input.nextInt();



    }

    public void Output(){

        System.out.println("ngay : " + getNgay());

        System.out.println("thang : " + getThang());

        System.out.println("nam : " + getNam());

        System.out.println(getNgay() + "/" + getThang() + "/" + getNam());
    }
}
