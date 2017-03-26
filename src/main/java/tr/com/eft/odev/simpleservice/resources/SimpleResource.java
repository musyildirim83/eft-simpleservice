package tr.com.eft.odev.simpleservice.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kjetland.ddsl.dropwizard.DdslService;
import com.kjetland.ddsl.utils.NetUtils;

import tr.com.eft.odev.simpleservice.config.SimpleConfiguration;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SimpleResource {

	private final SimpleConfiguration config;
	private final DdslService ddslService;

	public SimpleResource(SimpleConfiguration config, DdslService ddslService) {
		this.config = config;
		this.ddslService = ddslService;
	}

	@GET
	public String sayHello() {
		return "Hello world from " + config.getServiceName() + " on " + NetUtils.resolveLocalPublicIP() + ":"
				+ ddslService.httpPort;
	}

}
