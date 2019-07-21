package com.example.spring.project_bit.repository;

import com.example.spring.project_bit.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByUsername() throws Exception {
        User user = userRepository.findByUsername("steve");
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getUsername(), "steve");
    }

    @Test
    public void testInserNewUser() throws Exception {
        User newUser = new User();
        newUser.setUsername("test");
        newUser.setPassword("Test1234");

        User user = entityManager.persist(newUser);
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getUsername(), newUser.getUsername());
    }
}
