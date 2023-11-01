package testServer.services;

import framework.annotations.Autowired;
import framework.annotations.Bean;
import framework.annotations.Qualifier;

@Bean()
@Qualifier("ServiceY")
public class ServiceY implements ServiceInterface{
    @Autowired(verbose = true)
    private ComponentY componentY;

    public ServiceY() {
    }
}
