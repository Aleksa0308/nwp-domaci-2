package server;

import framework.annotations.Get;
import framework.annotations.Path;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
@SuppressWarnings({"rawtypes", "unchecked"})
public class DiscoveryMechanism {

    private static DiscoveryMechanism instance;
    private ArrayList<HTTPRoute> ControllerHTTPRoutes;
    private String packageName = "testServer";

    private DiscoveryMechanism() { }

    public static DiscoveryMechanism getInstance() {
        if (instance == null) {
            instance = new DiscoveryMechanism();
            instance.ControllerHTTPRoutes = new ArrayList<>();
        }
        return instance;
    }

    public Set<Class> findAllClassesFromPackage() {
        Reflections reflections = new Reflections(this.packageName, new SubTypesScanner(false));
        return new HashSet<>(reflections.getSubTypesOf(Object.class));
    }

    public void routeMapper(){
        Set<Class> classes = findAllClassesFromPackage();
        for (Class c : classes) {
            if (c.isAnnotationPresent(framework.annotations.Controller.class)) {
                for (Method method : c.getDeclaredMethods()) {
                    if (method.isAnnotationPresent(framework.annotations.Path.class)) {
                        //* create a new HTTPRoute
                        HTTPRoute httpRoute = getRoute(c, method);
                        //* Log the route
                        System.out.println(httpRoute);
                        //* Add the route to the list of routes
                        ControllerHTTPRoutes.add(httpRoute);
                    }
                }
            }
        }
    }

    public ArrayList<HTTPRoute> getMapOfControllerRoutes() {
        return ControllerHTTPRoutes;
    }

    private static HTTPRoute getRoute(Class c, Method method) {
        String httpMethod = "";

        Path path = method.getAnnotation(Path.class);

        if(method.isAnnotationPresent(Get.class)){
            httpMethod = "GET";
        }else{
            httpMethod = "POST";
        }

        HTTPRoute httpRoute = new HTTPRoute(path.path(), httpMethod, c, method.getName());
        return httpRoute;
    }

}
