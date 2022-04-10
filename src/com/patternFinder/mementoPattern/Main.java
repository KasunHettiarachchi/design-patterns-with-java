package com.patternFinder.mementoPattern;

import com.patternFinder.mementoPattern.Editor;
import com.patternFinder.mementoPattern.History;

public class Main {

    public static void main(String[] args) {
        /** MEMENTO PATTERN **/
            /** The memento pattern is a software design pattern that provides the
             * ability to restore an object to its previous state (undo via rollback).
             * The memento pattern is implemented with three objects: the originator (here Editor),
             * a caretaker (here History) and a memento (here EditorState).
             * The originator is some object that has an internal state.**/
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
