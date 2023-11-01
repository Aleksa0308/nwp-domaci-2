package testServer.services;

import framework.annotations.Autowired;
import framework.annotations.Bean;
import framework.annotations.Qualifier;

@Bean()
@Qualifier("ServiceX")
public class ServiceX implements ServiceInterface{
    @Autowired(verbose = true)
    private ComponentX componentX;

    public ServiceX() {
    }
}
