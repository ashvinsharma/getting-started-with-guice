package com.example.guice;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Main {
    @Inject
    private ITextWriter itw;

    public static void main(String[] args) {
        Main m = new Main();
        Injector injector = Guice.createInjector(new GuiceModule());
        injector.injectMembers(m);
        m.doYourThing();
    }

    private void doYourThing() {
        itw.write("hi");
    }
}
