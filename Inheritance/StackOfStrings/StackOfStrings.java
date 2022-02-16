package Inheritance.StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {

    private final ArrayList<String> data;

    public StackOfStrings(ArrayList<String> data) {
        this.data = data;
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        return this.data.remove(this.data.size() - 1);
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

}