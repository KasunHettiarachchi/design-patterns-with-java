package com.patternFinder.theCatalogOfDesignPatterns.CreationalPatterns.FactoryMethod.factory;

import com.patternFinder.theCatalogOfDesignPatterns.CreationalPatterns.FactoryMethod.buttons.Button;
import com.patternFinder.theCatalogOfDesignPatterns.CreationalPatterns.FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
