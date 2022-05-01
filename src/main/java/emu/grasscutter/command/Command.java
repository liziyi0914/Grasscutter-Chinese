package emu.grasscutter.command;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Command {
    String label() default "";

    String usage() default "未指定用法";

    String description() default "未指定说明";

    String[] aliases() default {};

    String permission() default "";
}
