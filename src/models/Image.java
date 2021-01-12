package models;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;
    private long time;
    String value,oldValue;
    Vector<Observer> observers = new Vector<Observer>();

    public Image(String name) {
        time = System.currentTimeMillis();
        imageName = name;
        try {
            //System.out.println("models.Image is being delayed: \n");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print()
    {
       //System.out.println("models.Image with name: " + this.imageName);
        System.out.println(this.imageName);

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setNewValue(String newValue) {
        this.oldValue=this.value;
        this.value=newValue;
        System.out.println("Image: A fost inlocuita valoarea "+ oldValue +" cu "+newValue);
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Image: A fost adaugat "+obs);
    }

    public void removeObserver(Observer obs) {
        observers.removeElement(obs);
        System.out.println("Image: A fost sters " + obs);

    }
    public void notifyObservers(){
        System.out.println("Notificare Image");
    }
}