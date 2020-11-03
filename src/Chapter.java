import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapters = new ArrayList<>();

    Chapter(String name){
        this.name=name;
    }

    public int createSubChapter(String name){
        SubChapter ch = new SubChapter(name);
        subChapters.add(ch);
        return subChapters.indexOf(ch);
    }

    public SubChapter getSubChapter(int index){
        return subChapters.get(index);
    }

    public void print(){
        System.out.println("Chapter name: " + this.name);
        printSubChapters();
    }

    private void printSubChapters(){
        for(SubChapter i:subChapters)
        {
            i.print();
        }
    }


}