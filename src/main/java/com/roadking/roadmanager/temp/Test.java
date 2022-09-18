package com.roadking.roadmanager.temp;

import org.python.util.PythonInterpreter;

public class Test {
    public static void main(String []args){
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("src/main/java/com/roadking/roadmanager/temp/test.py");
        interpreter.execfile("src/main/java/com/roadking/roadmanager/temp/test2.py");
        interpreter.exec("say('jinu byungsin')");
        interpreter.exec("say2('jinu byungsin')");

    }
}
