package com.unit_Object.session1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MethodAreaOverFlowTest {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        testMethodAreaOverFlow();
    }


    private static void testMethodAreaOverFlow() throws MalformedURLException, ClassNotFoundException {
        Set<Class<?>> classes = new HashSet<Class<?>>();

        URL url = new File("").toURI().toURL();
        URL[] urls = new URL[]{url};

        while (true) {
            ClassLoader loader = new URLClassLoader(urls);
            Class<?> loaderClass = loader.loadClass(Object.class.getName());
            classes.add(loaderClass);
        }
    }
}
