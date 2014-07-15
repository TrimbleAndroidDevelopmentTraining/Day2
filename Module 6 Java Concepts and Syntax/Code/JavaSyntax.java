package com.trimble.quizapp;

import java.util.ArrayList;
import java.util.List;

public class JavaSyntax {
    public void method1() {
        // Primitives
        byte        byteVariable    = 3;                    // 8-bit signed integer     0       -128 to 127
        short       shortVariable   = 88;                   // 16-bit signed integer    0       -32,768 to 32,767
        int         intVariable     = 5;                    // 32-bit signed integer    0       -2E31 to -2E31-1
        long        longVariable    = 999L;                 // 64-bit signed integer    0L      -2E63 to -2E63-1
        float       floatVariable   = 50.7f;                // 32-bit floating point    0.0f
        double      doubleVariable  = 10.5d;                // 64-bit floating point    0.0d
        boolean     booleanVariable = true;                 // true false               false
        char        charVariable    = 'c';                  // 16-bit unicode character '\u0000'

        // Wrappers
        Byte        byteWrapper    = byteVariable;
        Short       shortWrapper   = shortVariable;
        Integer     intWrapper     = intVariable;
        Long        longWrapper    = longVariable;
        Float       floatWrapper   = floatVariable;
        Double      doubleWrapper  = doubleVariable;
        Boolean     booleanWrapper = booleanVariable;
        Character   charWrapper    = charVariable;

        // OO Concepts
        // Classes but no Structs
        // Classes contain fields, methods, constructors, finalize
        // extends      keyword to inherit
        // implements   keyword to use an interface

        // Final, Abstract, Static
        // Final = Classes cannot be inherited, Methods cannot be overridden, variables only assigned once
        // Abstract = Classes must be inherited, Methods must be overridden
        // Static = Fields only have one copy for all class instances, Methods can be called without instantiating the class first

        // Access Modifiers
        // public       Class, Package, Subclass, Everywhere
        // protected    Class, Package, Subclass
        //              Class, Package (when no modifier is applied, its called the default modifier)
        // private      Class

        // Generics
        List<String> names = new ArrayList<String>();
        names.add("Moe");    names.add("Larry");    names.add("Curly");
        for (String name : names) { }
    }

    interface InterfaceExample {
        void method1();
        void method2();
    }
    private InterfaceExample interfaceExample = new InterfaceExample() {
        @Override
        public void method1() {

        }

        @Override
        public void method2() {

        }
    };
}
