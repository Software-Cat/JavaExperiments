import java.lang.reflect.Method;
import java.lang.annotation.*;

/**
 Get number of accessible public fields for a given class.
 */
class FieldGetter {

    public int getNumberOfAccessibleFields(Class<?> clazz) {
        // Add implementation here
        return clazz.getFields().length;
    }

}
