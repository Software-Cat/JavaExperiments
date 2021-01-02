/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = n -> n % 2 == 0 ? n + 2 : n + 1;
}