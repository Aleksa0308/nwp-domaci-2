package testServer.services;

import framework.annotations.Autowired;
import framework.annotations.Bean;
import framework.annotations.Qualifier;

@Bean(scope = "prototype")
@Qualifier("ComponentX")
public class ComponentX implements ComponentInterface {
    @Autowired(verbose = true)
    private ComponentZ componentZ;

    public ComponentX() {
    }
}
