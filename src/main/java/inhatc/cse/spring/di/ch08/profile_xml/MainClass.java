package inhatc.cse.spring.di.ch08.profile_xml;

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

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles(config);     // 프로파일 설정
        ctx.load("ch08/profile_dev.xml", "ch08/profile_run.xml");
        ctx.refresh();

        ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
        System.out.println("ip: " + info.getIpNum());
        System.out.println("port: " + info.getPortNum());
        ctx.close();
    }
}
