package models;

import java.util.Vector;

public class Table implements Element {
    private String title;
    String value,oldValue;
    Vector<Observer> observers = new Vector<Observer>();

    public void print()
    {
        System.out.println(this.title);
    }

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setNewValue(String newValue) {
        this.oldValue=this.value;
        this.value=newValue;
        System.out.println("Table: A fost inlocuita valoarea "+oldValue+" cu "+newValue);
    }


    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Table: A fost adaugat "+obs);
    }

    public void removeObserver(Observer obs) {
        observers.removeElement(obs);
        System.out.println("Table: A fost sters " + obs);

    }

    public void notifyObservers() {
        System.out.println("Notificare Table");
    }
}