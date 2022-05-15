package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public int getShapesQuantity(){
        return shapes.size();
    }
    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape figure = null;
        if(n >= 0 && n < shapes.size()){
            figure = shapes.get(n);
        }
        return figure;
    }

    public String showFigures(){
        List<String> figuresList = new ArrayList<>();
        for(Shape testShapes : shapes){
            figuresList.add(testShapes.getShapeName());
        }

        String figures = String.join("\n", figuresList);
        return figures;
    }
}
