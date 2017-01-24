package hei.tp04.web;

import hei.tp04.core.config.AppConfig;
import hei.tp04.core.config.DBConfig;
import hei.tp04.web.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by thiba on 24/01/2017.
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        Class<?>[] twoClassesTable =  new Class<?>[2];
        twoClassesTable[0]= AppConfig.class;
        twoClassesTable[1]= DBConfig.class;
        return twoClassesTable;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class<?>[] webConfigTable =  new Class<?>[1];
        webConfigTable[0]= WebConfig.class;
        return webConfigTable;
    }

    @Override
    protected String[] getServletMappings() {
        String[] str = new String[1];
        str[0] = "/";
        return str;
    }
}
