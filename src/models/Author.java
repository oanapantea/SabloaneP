package models;

public class Author {
    private String name;

    public void print()
    {
        System.out.println("models.Author: " + this.name);
    }

    public Author(String name) {
        this.name = name;
    }
}