package models;

public class SecondObserver implements Observer{
    public void update(String value, String newValue) {
        System.out.println("SECOND OBSERVER:= old value: "+value+" and new value: "+newValue);
    }
}