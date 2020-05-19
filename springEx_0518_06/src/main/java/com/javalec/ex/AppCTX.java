package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppCTX {

	@Value("${line}")
	private String line;
	@Value("${statn_nm}")
	private String statn_nm;
	@Value("${adres}")
	private String adres;
	@Value("${rdnmadr}")
	private String rdnmadr;
	@Value("${telno}")
	private String telno;
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource location = new ClassPathResource("subway.properties");
		
		configurer.setLocation(location);
		
		return configurer;
	}
	
	
	@Bean
	public Subway subway() {
		Subway subway = new Subway();
		
		subway.setLine(line);
		subway.setStatn_nm(statn_nm);
		subway.setAdres(adres);
		subway.setRdnmadr(rdnmadr);
		subway.setTelno(telno);
		
		return subway;
	}
}
