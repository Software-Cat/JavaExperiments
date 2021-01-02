/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

// Do not remove imports

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.List;

class TestClass {
    public List<Object> listField;
}

class ListParameterInspector {
    // Do not change the method
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fieldName = scanner.next();

        ListParameterInspector inspector = new ListParameterInspector();
        inspector.printParameterType(new TestClass(), fieldName);
    }

    public void printParameterType(TestClass obj, String fieldName) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        ParameterizedType type = (ParameterizedType) field.getGenericType();
        Type[] types = type.getActualTypeArguments();
        System.out.println(types[0].toString().replaceAll("class ", ""));
    }
}