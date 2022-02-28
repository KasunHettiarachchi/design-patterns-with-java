package com.patternFinder;

import com.patternFinder.mementoPattern.Editor;
import com.patternFinder.mementoPattern.History;

public class Main {

    public static void main(String[] args) {
        /** Memento Pattern **/
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("C");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
        /** Memento Pattern - END **/
    }
}
