package com.patternFinder.theCatalogOfDesignPatterns.CreationalPatterns.FactoryMethod.factory;

import com.patternFinder.theCatalogOfDesignPatterns.CreationalPatterns.FactoryMethod.buttons.Button;
import com.patternFinder.theCatalogOfDesignPatterns.CreationalPatterns.FactoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
