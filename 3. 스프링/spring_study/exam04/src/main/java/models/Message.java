package models;

import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean {

    public void send(String message) {
        System.out.printf("전송 메세지 : %s%n", message);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // 초기화 단계에서 호출, 실행
        System.out.println("afterPropertiesSet()!!!!");
    }
}
