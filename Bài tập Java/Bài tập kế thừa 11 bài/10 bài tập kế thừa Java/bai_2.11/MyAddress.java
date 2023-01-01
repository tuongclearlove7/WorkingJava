import java.util.Scanner;

public class MyAddress {

    Scanner input = new Scanner(System.in);

    private String province;

    private String district;


    public MyAddress(String province ,String district) {

        this.province = province;
        this.district = district;

    }

    public MyAddress(){

    }

    public String getProvince() {

        return province;
    }

    public void setProvince(String province) {

        this.province = province;
    }

    public String getDistrict() {

        return district;
    }

    public void setDistrict(String district) {

        this.district = district;
    }

    public void Input(){

        System.out.println("Input province : ");
        province = input.nextLine();

        System.out.println("Input district : ");
        district = input.nextLine();

    }

    public void Output(){

        System.out.println("province : " + getProvince());
        System.out.println("district : " + getDistrict());
    }

    public void cancel(){

        System.out.println("Ban co muon huy chuong trinh k?\n\t\tOption [yes or no] : ");
        String user = input.nextLine();

        if(user.equals("no")){

            Output();
        }

        if(user.equals("yes")){

            System.out.println("cancel!!!");
        }
    }

    @Override
    public String toString() {

        return "province : " + province + " district : " + district;
    }
}
