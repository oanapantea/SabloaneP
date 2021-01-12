package models;

import services.AlignCenter;
import services.AlignStrategy;

import java.util.Vector;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy = new AlignCenter();
    String value,oldValue;
    Vector<Observer> observers = new Vector<Observer>();

    public void print()
    {
        alignStrategy.render(this, new Context());
    }

    public Paragraph(String text) {
        this.text = text;
    }
    public void setAlignStrategy(AlignStrategy aS){
        this.alignStrategy = aS;
    }
    public String getText(){
        return this.text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setNewValue(String newValue) {
        this.oldValue=this.value;
        this.value=newValue;
        System.out.println("Paragraph: A fost inlocuita valoarea "+oldValue+" cu "+newValue);
    }


    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Paragraph: A fost adaugat "+obs);
    }

    public void removeObserver(Observer obs) {
        observers.removeElement(obs);
        System.out.println("Paragraph: A fost sters " + obs);

    }

    public void notifyObservers() {
        System.out.println("Notificare Paragraph");
    }
}