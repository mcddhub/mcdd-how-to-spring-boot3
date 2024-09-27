package com.mcddhub.vega03.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ActiveProfiles("test")
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
class AccountRepositoryTest {
    @Autowired
    private AccountRepository repository;
    @Autowired
    private DataSourceProperties properties;

    @Test
    void should_db_info_was_h2() {
        assertEquals("org.h2.Driver", properties.getDriverClassName(), "driver class name not match");
        assertEquals("jdbc:h2:mem:backend",properties.getUrl(), "url not match");
    }

    @Test
    void should_saved(){
        Account account = new Account();
        account.setUsername("test");
        account.setEmail("test@test.com");
        account.setPassword("test");
        Account saved = repository.save(account);
        assertNotNull(saved,"account not saved");
    }

    @Test
    void should_count_0_when_db_init() {
        assertEquals(1, repository.count());
    }

    @Test
    void should_get_account_by_id(){
        Optional<Account> account = repository.findById(1L);
        account.ifPresentOrElse(System.out::println,() ->System.out.println("not found"));
    }
}