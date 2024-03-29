package com.uestc.hams.test;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller("TestAction")//注解，使spring能扫描到
@Scope("prototype")
public class TestAction extends ActionSupport{

	@Resource
	private TestService testService;
	
	@Override
	public String execute() throws Exception {
		System.out.println("TestAction.execute()");
		testService.saveTwoUsers();
		return "success";
	}
}
