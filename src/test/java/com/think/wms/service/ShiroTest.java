package com.think.wms.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;
import org.apache.shiro.web.subject.WebSubject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml", "classpath:spring/spring-shiro.xml"})
public class ShiroTest extends AbstractShiroTest {
	@Autowired
	SecurityManager securityManager;

	@Before
	public void setUp() throws Exception {
		ThreadContext.bind(securityManager);
	}

	@Test
	public void testLogin() {
		String userName = "mpthink";
		String password = "123";
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		Subject subject = new WebSubject.Builder(securityManager, request, response).buildSubject();

		setSubject(subject);
		AuthenticationToken token = new UsernamePasswordToken(userName, password);

		try {
			subject.login(token);
			System.out.println("是否认认证通过: " + subject.isAuthenticated());
			Boolean hasRole = subject.hasRole("superadmin");
			System.out.println("基于角色的授权: " + hasRole);
			System.out.println("角色的权限： " + subject.isPermitted("admin"));
			User user = (User) subject.getPrincipal();
			System.out.println("获取用户： " + user.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
