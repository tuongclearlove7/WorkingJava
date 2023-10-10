public abstract  class xe {

    protected String so_xe;
    protected String hang_xe;
    protected String nam_san_xuat;
    protected String color;
    protected int so_km;


    public xe(String so_xe,String hang_xe, String nam_san_xuat, String color, int so_km) {

        this.so_xe = so_xe;
        this.hang_xe = hang_xe;
        this.nam_san_xuat = nam_san_xuat;
        this.color = color;
        this.so_km = so_km;

    }

    public xe(){


    }

    public String getSo_xe() {
        return so_xe;
    }

    public void setSo_xe(String so_xe) {
        this.so_xe = so_xe;
    }

    public String getHang_xe() {
        return hang_xe;
    }

    public void setHang_xe(String hang_xe) {
        this.hang_xe = hang_xe;
    }

    public String getNam_san_xuat() {
        return nam_san_xuat;
    }

    public void setNam_san_xuat(String nam_san_xuat) {
        this.nam_san_xuat = nam_san_xuat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSo_km() {
        return so_km;
    }

    public void setSo_km(int so_km) {
        this.so_km = so_km;
    }

    public abstract String getcapphat(int km);

    @Override
    public String toString() {

        return "so_xe : " + so_xe +", hang_xe : " + hang_xe + ", nam_san_xuat : " + nam_san_xuat + ", color : " + color + ", so_km : " + so_km;
    }
}
