package inhatc.cse.spring.di.ch08.profile_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfigRun {

    @Bean
    public ServerInfo serverInfo(){
        ServerInfo serverInfo = new ServerInfo();
        serverInfo.setIpNum("123.123.123.23");
        serverInfo.setPortNum("80");
        return serverInfo;
    }
}
