/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        Class<?>[] classes = new Class<?>[classNames.length];
        for (int i = 0; i < classNames.length; i++) {
            classes[i] = Class.forName(classNames[i]);
        }

        for (Class<?> clazz : classes) {
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    return clazz.getName();
                }
            }
        }

        return null;
    }
}