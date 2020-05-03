package message.source.test;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import message.source.configuration.ConfigurationMessageSource;

public class test01 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigurationMessageSource.class);
		String msg1 = context.getMessage("product.name", new Object[] {}, Locale.US);
		System.out.println(msg1);

		String msg1_tr = context.getMessage("product.name", new Object[] {}, new Locale("tr", "TR"));
		System.out.println(msg1_tr);

		String msg2 = context.getMessage("order.information", new Object[] { "Order-100", "250", "$" }, Locale.US);
		System.out.println(msg2);
	}
}
