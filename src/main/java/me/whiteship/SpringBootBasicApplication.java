package me.whiteship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@ComponentScan // Component들을 읽어서 빈으로 등록하는것
//@EnableAutoConfiguration
// Component를 스캔할 때는 현재 패키지 경로부터 스캔하기때문에 상위패키지에 만들어진 빈들은 등록되지 않는다.
public class SpringBootBasicApplication {

    public static void main(String[] args) {
        SpringApplication application =  new SpringApplication(SpringBootBasicApplication.class);
        // application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
        // 위의 2줄만 작성하고 @EnableAutoConfiguration 없이 실행시키면 ServletWebWerverFactory Bean이 없어서 실행되지 않는다.
        // (ServletWebWerverFactory을 EnableAutoConfiguration이 빈을 등록시킬 때 만들어줌?) -> 웹서버로 작동 불가
        // 웹서버로 작동시키지 않고 실행만 시킬 때는 application.setWebApplicationType(WebApplicationType.NONE); 코드 추가
        //@EnableAutoConfiguration이 읽는 빈은 ComponentScan으로 빈을 다 등록한 후에 추가적으로 등록하는 빈이다.
    }

}
