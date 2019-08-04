package com.example.guice;

import com.google.inject.AbstractModule;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ITextWriter.class).to(TextWriter.class);
    }

}
