package testServer.services;

import framework.annotations.Autowired;
import framework.annotations.Component;
import framework.annotations.Qualifier;

@Component
@Qualifier("ComponentZ")
public class ComponentZ implements ComponentInterface{
    @Autowired(verbose = true)
    @Qualifier("ServiceC")
    private ServiceInterface serviceC;

    public ComponentZ() {
    }
}
