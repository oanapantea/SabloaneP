package models;

import java.util.ArrayList;
import java.util.Vector;

public class Section implements Element{
    private String sectionTitle;
    ArrayList<Element> elements = new ArrayList<>();
    String value,oldValue;
    Vector<Observer> observers = new Vector<Observer>();

    public Section(String sectionTitle, ArrayList<Element> elements){
        this.sectionTitle = sectionTitle;
        this.elements = elements;
    }

    public Section(String sectionTitle){
        this.sectionTitle = sectionTitle;
    }

    public int add(Element element){
        elements.add(element);
        return elements.indexOf(element);
    }

    public void remove(Element element){
        elements.remove(element);
    }

    public Element getElement(int index)
    {
        return elements.get(index);
    }

    public void print(){
        System.out.println(sectionTitle);

        for(Element i : elements){
            i.print();
        }
    }

    public void accept(Visitor visitor){

        visitor.visit(this);

        for(Element elem: elements){
            elem.accept(visitor);
        }

    }

    @Override
    public void setNewValue(String newValue) {
        this.oldValue=this.value;
        this.value=newValue;
        System.out.println("Section: A fost inlocuita valoarea "+oldValue+" cu "+newValue);
    }


    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Section: A fost adaugat "+obs);
    }

    public void removeObserver(Observer obs) {
        observers.removeElement(obs);
        System.out.println("Section: A fost sters "+obs);

    }

    public void notifyObservers() {
        System.out.println("Notificare Section");
    }

}