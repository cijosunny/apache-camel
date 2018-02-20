package org.apache.camel.activemq;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:D:/JMS/TESTDATA/ACTIVEMQ").split().tokenize("\n").to("jms:queue:javainuse");
		
		from("jms:queue:javainuse").process(new Processor() {
			
			public void process(Exchange ex) throws Exception {
				System.out.println(ex.getIn().getBody());
			}
		});
	}

}
