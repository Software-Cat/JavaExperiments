/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.lang.reflect.Constructor;

/**
 * Check whether the class declares public parameterless constructor
 */
class ConstructorChecker {

    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        for (Constructor<?> constructor : clazz.getConstructors()) {
            if (constructor.getParameters().length == 0) {
                return true;
            }
        }

        return false;
    }

}