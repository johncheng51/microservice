package com.ric.util;

import com.ric.model.AbsModel;

import java.lang.reflect.Field;

import java.util.List;
import java.util.stream.Stream;

public class BeanCopy {
    public static void setProp(Object self, String name, Object value) {
        MSUtil.setProp(self, name, value);
    }

    public static Object getProp(Object self, String name) {
        return MSUtil.getProp(self, name);
    }

    public static Object createObj(Class name) {
        return MSUtil.createObj(name);
    }

    public static void copy(Object source, Object target) {
        List<String> names = ((AbsModel) source).getAllNames();
        names.stream().forEach(x -> {
                Object value = getProp(source, x);
                setProp(target, x, value);
            });

    }

    public static Object copy(Object source, Class target) {

        Object result = createObj(target);
        List<String> names = ((AbsModel) result).getAllNames();
        names.stream().forEach(x -> {
                Object value = getProp(source, x);
                setProp(result, x, value);
            });
        return result;
    }
}
