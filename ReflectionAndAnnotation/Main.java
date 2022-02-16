package ReflectionAndAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        Class<? super Reflection> baseClazz = clazz.getSuperclass();

        System.out.println("class " + clazz.getName());
        System.out.println("class " + baseClazz.getName());

        Arrays.stream(clazz.getInterfaces()).forEach(i -> System.out.println("interface " + i.getSimpleName()));

        try {
            Constructor<Reflection> ctor = clazz.getDeclaredConstructor();
            Reflection reflection = ctor.newInstance();
            System.out.println(reflection.toString());
        } catch (NoSuchMethodException
                | InvocationTargetException
                | InstantiationException
                | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
