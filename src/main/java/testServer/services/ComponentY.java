package testServer.services;

import framework.annotations.Autowired;
import framework.annotations.Component;
import framework.annotations.Qualifier;

@Component
@Qualifier("ComponentY")
public class ComponentY implements ComponentInterface{
    @Autowired(verbose = true)
    @Qualifier("ComponentZ")
    private ComponentInterface componentZ;

    public ComponentY() {
    }
}
