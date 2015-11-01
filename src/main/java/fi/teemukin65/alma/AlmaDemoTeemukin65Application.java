package fi.teemukin65.alma;

import fi.teemukin65.alma.model.funmarketApi.MarketAds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class AlmaDemoTeemukin65Application {


//    private static final Logger log = LoggerFactory.getLogger(AlmaDemoTeemukin65Application.class);


    public static void main(String[] args) {

        SpringApplication.run(AlmaDemoTeemukin65Application.class, args);
    }


}
