public class Book extends Media {

    private int Page_Number;
    private String author;

    public Book(int Page_Number, String author, String name, double price) {

        super(name, price);

        this.Page_Number = Page_Number;
        this.author = author;
    }

    public Book(int Page_Number, String author) {

        this.Page_Number = Page_Number;
        this.author = author;
    }

    public Book() {
    }

    public int getPage_Number() {


        return Page_Number;
    }

    public void setPage_Number(int Page_Number) {


        this.Page_Number = Page_Number;
    }

    public String getAuthor() {


        return author;
    }

    public void setAuthor(String author) {


        this.author = author;
    }

    public Book InputBook() {

        System.out.println("so trang : ");
        Page_Number = input.nextInt();
        input.nextLine();
        System.out.println("tac gia : ");
        author = input.nextLine();

        return null;
    }

    public Book OuputBook() {

        System.out.println("so trang la : " + getPage_Number());
        System.out.println("tac gia la : " + getAuthor());

        return null;
    }


    @Override
    public String toString() {


        return super.toString() + "\n\t\tPage number : " + Page_Number + "\n\t\tauthor : " + author;
    }
}
