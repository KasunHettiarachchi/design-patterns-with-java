package com.patternFinder.theCatalogOfDesignPatterns.CreationalPatterns.FactoryMethod.factory;

import com.patternFinder.theCatalogOfDesignPatterns.CreationalPatterns.FactoryMethod.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
