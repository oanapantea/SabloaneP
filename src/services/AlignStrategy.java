package services;

import models.Context;
import models.Paragraph;

public interface AlignStrategy{
    public void render(Paragraph p, Context c);

}