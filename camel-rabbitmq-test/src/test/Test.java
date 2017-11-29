package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		applicationContext.start();
		
		
		
		
		
//		CamelContext context;
//	    ProducerTemplate producer;
//	    ConsumerTemplate consumer;
//	    Endpoint endpoint;
//	    	
//	    context = new DefaultCamelContext();
//
//        context.start();
//
//        endpoint = context.getEndpoint("rabbitmq://localhost:5672/ex?username=guest"
//        		+ "&password=guest&autoDelete=false&routingKey=camel&queue=task_queue");
//
//        producer = context.createProducerTemplate();
//
//        producer.setDefaultEndpoint(endpoint);
//        producer.sendBody("one");
//        producer.sendBody("two");
//        producer.sendBody("three");
//        producer.sendBody("four");
//        producer.sendBody("done");
//
//        consumer = context.createConsumerTemplate();
//        String body = null;
//        while (!"done".equals(body)) {
//            Exchange receive = consumer.receive(endpoint);
//            body = receive.getIn().getBody(String.class);
//            System.out.println(body);
//        }
//
//        context.stop();
		
	}
}
