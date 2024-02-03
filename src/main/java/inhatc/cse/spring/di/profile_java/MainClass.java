package inhatc.cse.spring.di.profile_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        String config = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("dev or run : ");
        String str = scanner.next();

        if(str.equals("dev")){
            config = "dev";
        } else if(str.equals("run")) {
            config = "run";
        }
        scanner.close();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles(config);     // 프로파일 설정
        ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
        ctx.refresh();

        ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
        System.out.println("ip: " + info.getIpNum());
        System.out.println("port: " + info.getPortNum());
        ctx.close();
    }
}
