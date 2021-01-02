/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.io.Serializable;

class User implements Serializable {
    private static final long serialVersionUID = -653430775980086863L;

    String name;
    transient String password;
}