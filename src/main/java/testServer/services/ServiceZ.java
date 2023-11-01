package testServer.services;

import framework.annotations.Autowired;
import framework.annotations.Bean;
import framework.annotations.Qualifier;

@Bean()
@Qualifier("ServiceZ")
public class ServiceZ implements ServiceInterface{
    @Autowired(verbose = true)
    @Qualifier("ServiceJ")
    private ServiceInterface serviceJ;

    public ServiceZ() {
    }
}
