package com.hendisantika.springbootpostgressample.controller;

import com.hendisantika.springbootpostgressample.domain.AppUser;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgres-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/09/18
 * Time: 06.56
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = {"classpath:application-test.yml"})
public class HomeControllerTest {
    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void shouldAddAppUserToDb() {

        ResponseEntity<AppUser> responseEntity = restTemplate
                .postForEntity("http://localhost:9095/user/Uzumaki Naruto",
                        MockHttpServletRequest.DEFAULT_PROTOCOL,
                        AppUser.class);

        final AppUser appUser = responseEntity.getBody();

        Assertions.assertThat(appUser).isNotNull();
        Assertions.assertThat(appUser.getUsername()).isNotNull().isEqualTo("Uzumaki Naruto");
    }
}