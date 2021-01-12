package models;

public class FirstObserver implements Observer{
    public void update(String value, String newValue) {
        System.out.println("FIRST OBSERVER:= old value: "+value+" and new value: "+newValue);
    }
}
