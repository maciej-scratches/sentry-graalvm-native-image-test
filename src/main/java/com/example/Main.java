package com.example;

import io.sentry.DiagnosticLogger;
//import io.sentry.GsonSerializer;
import io.sentry.Sentry;
import io.sentry.SystemOutLogger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Sentry.init(options -> {
            options.setDebug(true);
            options.setDsn("https://502f25099c204a2fbf4cb16edc5975d1@o447951.ingest.sentry.io/5428563");
        });

        Sentry.captureMessage("hello world");
    }
}
