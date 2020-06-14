package com.vinaylogics.javathreads.methods;

public class ThreadExceptionalHandlerMethod {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            throw new RuntimeException("Intentional Exception");
        });

        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("A critical error happened in thread "+t.getName()
                    + " the error is " + e.getMessage());
        });

        thread.start();

    }
}
