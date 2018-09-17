package de.db.vertrieb.javaworkshop;

import java.awt.*;

public class VariablenTask5Main {
    public static void main(String[] args) {
        Point point = new Point(3,3);
        System.out.println(point.toString());

        Point changedPoint = point;
        changedPoint.x = 1;
        changedPoint.y = 1;

        System.out.println(point.toString());
    }
}
