package io.yadnyesh.kksball.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebContainerConfig {
	
	@Bean
	public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
//		TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory = new TomcatEmbeddedServletContainerFactory()
//		{
//			@Override
//			protected void postProcessContext(Context context) {
//				SecurityConstraint constraint = new SecurityConstraint();
//				constraint.setUserConstraint("CONFIDENTIAL");
//				SecurityCollection collection = new SecurityCollection();
//				collection.addPattern("/*");
//				constraint.addCollection(collection);
//				context.addConstraint(constraint);
//			}
//		};
//		tomcatEmbeddedServletContainerFactory.addAdditionalTomcatConnectors(createSslConnector());
		TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory = new TomcatEmbeddedServletContainerFactory();
		return tomcatEmbeddedServletContainerFactory;
	}
	
	private Connector createSslConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setScheme("http");
		connector.setPort(8080);
		connector.setRedirectPort(8443);
		connector.setSecure(false);
		return connector;
	}
}
