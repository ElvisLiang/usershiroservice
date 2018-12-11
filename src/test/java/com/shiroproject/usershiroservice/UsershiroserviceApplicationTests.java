package com.shiroproject.usershiroservice;

import com.shiroproject.usershiroservice.dao.IdentityMapper;
import com.shiroproject.usershiroservice.entity.Identity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsershiroserviceApplicationTests {

	@Autowired
	IdentityMapper identityMapper;
	@Test
	public void contextLoads() {
		Identity identity = identityMapper.selectIdentityByUserId(1);
		System.out.print(identity.getIdentitiyname());
	}

}
