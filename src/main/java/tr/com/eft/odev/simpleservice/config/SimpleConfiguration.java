package tr.com.eft.odev.simpleservice.config;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kjetland.ddsl.dropwizard.DdslConfig;

import io.dropwizard.Configuration;

public class SimpleConfiguration extends Configuration {

	@JsonProperty
	@Valid
	@NotNull
	private DdslConfig ddslConfig;

	@JsonProperty
	@NotNull
	private String serviceName;

	public DdslConfig getDdslConfig() {
		return ddslConfig;
	}

	public void setDdslConfig(DdslConfig ddslConfig) {
		this.ddslConfig = ddslConfig;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
