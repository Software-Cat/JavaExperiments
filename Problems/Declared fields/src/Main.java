/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.lang.reflect.Field;

/**
 * Get number of fields class declares (the ones inherited should be excluded).
 */
class FieldGetter {

    public int getNumberOfFieldsClassDeclares(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();

        int counter = 0;
        for (Field field : fields) {
            counter++;
        }

        return counter;
    }

}