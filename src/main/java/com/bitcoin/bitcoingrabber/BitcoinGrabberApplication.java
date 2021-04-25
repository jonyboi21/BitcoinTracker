package com.bitcoin.bitcoingrabber;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@Component
@EnableScheduling
public class BitcoinGrabberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitcoinGrabberApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(BitcoinGrabberApplication.class);

	@Scheduled(fixedRate = 5000)
	public void refreshCharts() {
		RestTemplate restTemplate = new RestTemplate();
		Root root = restTemplate.getForObject("https://api.n.exchange/en/api/v1/price/BTCLTC/latest/?format=json&market_code=nex", Root.class);
		log.info("Bitcoin Trackers: " + root);



	}
}

