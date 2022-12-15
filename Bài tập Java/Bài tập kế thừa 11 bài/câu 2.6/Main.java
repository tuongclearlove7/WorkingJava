import java.util.ArrayList;

public class Main {

    protected static String[] NamePrinter = {"Canon"};
    protected static String[] DPI = {"DPI 1", "DPI 2","DPI 3", "DPI 4","DPI 5", "DPI 6"};
    protected static String[] COLOR = {"Red", "Blue", "Silver", "Green", "Yellow", "Black"};

    public static void main(String args[]){

        Printer printer = new Printer(NamePrinter[0], 30);
        Laser laser = new Laser(DPI[0]);
        ColorPrinter color = new ColorPrinter(COLOR[2]);

        printer.Output();
        laser.Output();
        color.Output();

        int Import = printer.getAmount()/3;
        int Out = Import / 2;

        printer.import_warehouse(Import);
        printer.out_warehouse(Out);
    }
}
