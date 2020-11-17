package services;

import models.Context;
import models.Paragraph;
import services.AlignStrategy;

public class AlignCenter implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
        //System.out.println("Aligned with services.AlignCenter: " + p.getText());
    }
}