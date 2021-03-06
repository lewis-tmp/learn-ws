package org.learn.ws.soap_cxf;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.learn.ws.soap_cxf.HelloServiceImpl;

/**
 * 以simple方式的发布 WS
 * 
 * @author lewis007
 * @since 0.1.0
 */
public class SimpleServer {

	public static void main(String[] args) {
		ServerFactoryBean factory = new ServerFactoryBean();
		factory.setAddress("http://localhost:8080/ws/soap/hello");
		factory.setServiceClass(HelloService.class);
		factory.setServiceBean(new HelloServiceImpl());
		factory.create();
		System.out.println("soap ws is published");
	}

}
