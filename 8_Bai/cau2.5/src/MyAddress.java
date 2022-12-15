
import java.util.Scanner;


public class MyAddress {

    private String province;
    private String district;

    Scanner input = new Scanner(System.in);

    public MyAddress(String province, String district) {


        this.province = province;
        this.district = district;
    }

    public MyAddress() {


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

    public void input() {

        System.out.println("province : ");
        province = input.nextLine();
        System.out.println("district : ");
        district = input.nextLine();

    }

    public void Output() {

        System.out.println("province : " + province);
        System.out.println("district : " + district);
    }

    @Override
    public String toString() {

        return "\n\t\tprovince : " + province + "\n\t\tdistrict : " + district;
    }
}
