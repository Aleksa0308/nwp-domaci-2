package server;

public class HTTPRoute {
    private String route;
    private String httpMethod;
    private Class controller;
    private String method;

    public HTTPRoute(String route, String httpMethod, Class controller, String method) {
        this.route = route;
        this.httpMethod = httpMethod;
        this.controller = controller;
        this.method = method;
    }

    public String getRoute() {
        return route;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public Class getController() {
        return controller;
    }

    public String getMethod() {
        return method;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "HTTPRoute{" +
                "route='" + route + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", controller=" + controller +
                ", method='" + method + '\'' +
                '}';
    }
}
