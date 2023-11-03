package testServer.controllers;

import framework.annotations.*;
import testServer.services.ServiceInterface;
import testServer.services.ServiceX;
import testServer.services.ServiceY;
@Controller
public class ControllerY {
    @Autowired(verbose = true)
    private ServiceX serviceX;

    @Autowired(verbose = true)
    private ServiceY serviceY;

    @Autowired(verbose = true)
    @Qualifier("ServiceZ")
    private ServiceInterface serviceZ;

    @Path(path = "/methodX1")
    @Get
    public void methodX1(){}

    @Path(path = "/methodX2")
    @Post
    public void methodX2(){}
}
