import models.*;

public class TestMain {

    public static void main(String[] args){
        //create new book to open


        //lab
        Command cmd1 = new OpenCommand();
        cmd1.execute();
        Command cmd2 = new StatisticsCommand();
        cmd2.execute();

        System.out.println();
        System.out.println("Book info:");
        if(DocumentManager.getInstance().getBook() != null)
            DocumentManager.getInstance().getBook().print();
        else
            System.out.println("No book info.");
    }
}