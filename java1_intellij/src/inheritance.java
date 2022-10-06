

public class inheritance {
// ke thua
        private int door;
        private int wheel;
        private String model;
        private String engine;
        private String color;

        public void setmodel(String model){
            String validModel = model;
            if(validModel.equals("tuong") || validModel.equals("dat")){
                this.model = model;
            }
            else {
                this.model = "unknown\n";
        }
    }

    public String getModel(){

            return this.model;
    }
    public static void main(String[] args) {


    }
}
