package sj.patterns.composite;

import java.util.ArrayList;
import java.util.List;

interface DocumentElement {
    void render();

    void move(int x, int y);

    void resize(double factor);
}

class TextBox implements DocumentElement {

    @Override
    public void render() {
        System.out.println(" ---Rendering Text box");
    }

    @Override
    public void move(int x, int y) {
        System.out.println(" ---TextBox Moved " + x + " " + y);
    }

    @Override
    public void resize(double factor) {
        System.out.println(" ---Resizing Text box by " + factor);
    }
}

class Image implements DocumentElement {
    @Override
    public void render() {
        System.out.println(" ---Rendering Image box");
    }

    @Override
    public void move(int x, int y) {
        System.out.println(" ---Image Moved " + x + " " + y);
    }

    @Override
    public void resize(double factor) {
        System.out.println(" ---Resizing Image box by " + factor);
    }
}

class Table implements DocumentElement {
    @Override
    public void render() {
        System.out.println(" ---Rendering Table box");
    }

    @Override
    public void move(int x, int y) {
        System.out.println(" ---Table Moved " + x + " " + y);
    }

    @Override
    public void resize(double factor) {
        System.out.println(" ---Resizing Table box by " + factor);
    }
}

class Section implements DocumentElement {
    private List<DocumentElement> elements = new ArrayList<>();

    public void addElement(DocumentElement element) {
        elements.add(element);
    }

    public void removeElement(DocumentElement element) {
        elements.remove(element);
    }

    @Override
    public void render() {
        System.out.println(" Rendering Section");
        for (DocumentElement element : elements) {
            element.render();
        }
    }

    @Override
    public void move(int x, int y) {
        System.out.println(" Section Moved " + x + " " + y);
        for (DocumentElement element : elements) {
            element.move(x, y);
        }
    }

    @Override
    public void resize(double factor) {
        System.out.println(" Resizing Section by " + factor);
        for (DocumentElement element : elements) {
            element.resize(factor);
        }
    }
}

public class Composite {

    public static void main(String[] args) {
        DocumentElement textBox = new TextBox();
        DocumentElement image = new Image();
        DocumentElement table = new Table();

        Section section = new Section();
        section.addElement(textBox);
        section.addElement(image);

        Section section2 = new Section();
        section2.addElement(table);
        section2.addElement(section);

        section2.render();
        section2.move(100, 100);
        section2.resize(1.5);

    }

}
