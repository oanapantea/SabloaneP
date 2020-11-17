package services;

import models.Context;
import models.Paragraph;
import services.AlignStrategy;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
       // System.out.println("Aligned with services.AlignRight: " + p.getText());
        System.out.println(p.getText());
    }
}
