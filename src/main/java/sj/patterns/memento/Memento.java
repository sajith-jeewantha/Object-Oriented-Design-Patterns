package sj.patterns.memento;

import java.util.Stack;

class State {
    private final String state;

    public State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class TextEditor {
    private String content = "";

    public void type(String content) {
        this.content += content + " ";
    }

    public String getContent() {
        return content.trim();
    }

    public State save() {
        return new State(content);
    }

    public void restore(State state) {
        content = state.getState();
    }
}

class History {
    private final Stack<State> stateStack = new Stack<>();
    private final Stack<State> redoStack = new Stack<>();

    public void save(TextEditor textEditor) {
        stateStack.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (stateStack.size() > 1) {
            redoStack.add(stateStack.pop());
            textEditor.restore(stateStack.peek());
        } else {
            System.out.println("No more undo steps available");
        }
    }

    public void redo(TextEditor textEditor) {
        if (redoStack.size() > 1) {
            textEditor.restore(redoStack.pop());
        } else {
            System.out.println("No more redo steps available");
        }
    }

    public int size() {
        return stateStack.size();
    }

}

public class Memento {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        History history = new History();

        textEditor.type("Hello,");
        history.save(textEditor);

        textEditor.type("How are you?");
        history.save(textEditor);

        System.out.println(textEditor.getContent()); // Hello, How are you?

        textEditor.type("My name is Jack");
        history.save(textEditor);
        System.out.println(textEditor.getContent()); // Hello, How are you? My name is Jack

        history.undo(textEditor);
        System.out.println(textEditor.getContent()); // Hello, How are you?

        history.undo(textEditor);
        System.out.println(textEditor.getContent()); // Hello,

        history.redo(textEditor);
        System.out.println(textEditor.getContent()); // Hello, How are you?
    }
}
