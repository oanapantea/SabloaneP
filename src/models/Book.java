package models;

import java.util.ArrayList;

public class Book implements Element {
    private String title;
    private ArrayList<Author> authors = new ArrayList<>();
    private TableOfContents tableOfContents;
    private ArrayList<Element> elements = new ArrayList<>();



    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author)
    {
        this.authors.add(author);
    }

    public int add(Element element){
        elements.add(element);
        return elements.indexOf(element);
    }

    public void print(){
        System.out.println(title);

        for(Author a : authors){
            a.print();
        }

        for(Element e :elements){
            e.print();
        }


    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Element elem: elements) {
            elem.accept(visitor);
        }

    }

    @Override
    public void setNewValue(String newValue) {

    }

}