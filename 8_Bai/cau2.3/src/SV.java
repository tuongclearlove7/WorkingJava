
public class SV {
    private String Class;
    private String name;

    public SV(String Class, String name) {

        this.Class = Class;
        this.name = name;
    }

    public SV() {

    }

    public String getMyClass() {


        return Class;
    }

    public void setMyClass(String className) {


        this.Class = className;
    }

    public String getName() {


        return name;
    }

    public void setName(String name) {


        this.name = name;
    }
    public SVCN Output(){

        System.out.println("name is : " + name);
        System.out.println("class is : "+ Class);

        return null;
    }

    @Override
    public String toString() {


        return "\n\t\tclass : " + Class + "\n\t\tname : " + name;
    }
}
