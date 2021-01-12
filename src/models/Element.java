package models;

interface Element extends Visitee{
    public void print();
    public void accept(Visitor v);
    void setNewValue(String newValue);
}