/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        List<String> annotatedFields = new ArrayList<>();

        for (Field field : object.getClass().getDeclaredFields()) {
            if (field.getDeclaredAnnotations().length > 0) {
                annotatedFields.add(field.getName());
            }
        }

        return annotatedFields.toArray(new String[0]);
    }

}