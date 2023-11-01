package testServer.services;

import framework.annotations.Autowired;
import framework.annotations.Bean;
import framework.annotations.Qualifier;

@Bean()
@Qualifier("ServiceJ")
public class ServiceJ implements ServiceInterface{
    public ServiceJ() {
    }
}
