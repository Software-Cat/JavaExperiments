/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

/**
 * Get name of the class for the object provided.
 */
class ClassGetter {

    public String getObjectClassName(Object object) {
        Class<?> clazz = object.getClass();
        return clazz.getName();
    }

}