package NewFrame.etu2663.framework;

import java.lang.annotation.*;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Url {
    String url() default " ";
}
