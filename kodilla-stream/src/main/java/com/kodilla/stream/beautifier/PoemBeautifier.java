package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String text, PoemDecorator poemDecorator){
        String beautyText = poemDecorator.decorate(text);
        return beautyText;
    }
}
