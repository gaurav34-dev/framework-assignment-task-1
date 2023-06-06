//Framework class

package com.example;

public class Framework {

    private JavaLanguage javaLanguage;

    public Framework(JavaLanguage javaLanguage) {
        this.javaLanguage = javaLanguage;
    }

    public void showOutput() {
        System.out.println(javaLanguage.learningJava());
    }
}
