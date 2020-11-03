import java.util.ArrayList;

public class SubChapter  {
    private String name;

    private ArrayList<Paragraph> paragraphs = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();
    private ArrayList<Image> images = new ArrayList<>();


    SubChapter(String name){
        this.name = name;
    }

    public void createNewParagraph(String name){
        paragraphs.add(new Paragraph(name));
    }
    public void createNewImage(String name){
        images.add(new Image(name));
    }
    public void createNewTable(String name){
        tables.add(new Table(name));
    }

    public void print(){
        System.out.println("Subchapter: " + this.name);
        printImages();
        printParagraphs();
        printTables();
    }

    private void printParagraphs(){
        for(Paragraph i : this.paragraphs)
        {
            i.print();
        }
    }
    private void printTables(){
        for(Table i : this.tables)
        {
            i.print();
        }
    }
    private void printImages(){
        for(Image i: images)
        {
            i.print();
        }
    }









}