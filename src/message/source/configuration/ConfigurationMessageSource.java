package message.source.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ConfigurationMessageSource {
		@Bean 
		public ResourceBundleMessageSource messageSource() {
			ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
			messageSource.setBasename("local.bundle.springMessages");
			messageSource.setDefaultEncoding("UTF-8");
			return messageSource;
		}
}
