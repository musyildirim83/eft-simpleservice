package tr.com.eft.odev.simpleservice;

import com.kjetland.ddsl.dropwizard.DdslService;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import tr.com.eft.odev.simpleservice.config.SimpleConfiguration;
import tr.com.eft.odev.simpleservice.health.SimpleHealthCheck;
import tr.com.eft.odev.simpleservice.resources.SimpleResource;

public class SimpleApplication extends Application<SimpleConfiguration> {

	public static void main(String[] args) throws Exception {
		new SimpleApplication().run(args);
	}

	@Override
	public String getName() {
		return "simpleservice";
	}

	@Override
	public void initialize(Bootstrap<SimpleConfiguration> bootstrap) {
	}

	@Override
	public void run(SimpleConfiguration conf, Environment env) throws Exception {
		env.healthChecks().register("simpleservice", new SimpleHealthCheck());

		DdslService ddslService = new DdslService(conf.getDdslConfig());
		env.lifecycle().addServerLifecycleListener(ddslService);
		env.jersey().register(new SimpleResource(conf, ddslService));

	}

}
