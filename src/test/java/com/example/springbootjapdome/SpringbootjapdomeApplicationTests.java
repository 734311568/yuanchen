package com.example.springbootjapdome;

import com.example.springbootjapdome.model.Userinfo;
import com.example.springbootjapdome.repository.UserRepository;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootjapdomeApplicationTests {
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void contextLoads() {
		
		
	}
	@Test
	public  void test(){
//	List<User> findList = userRepository.findList();
//		for (Userinfo user : findList) {
//			
//			System.out.println("查出来了嘛"+user.getUserName()+"\t"+user.getPassword());
//			
//		}
//		
	
	}

}
