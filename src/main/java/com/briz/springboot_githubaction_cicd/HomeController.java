package com.briz.springboot_githubaction_cicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
@RequestMapping("/test")
public String test()
{
	return "this is github action test";
}
@RequestMapping("/action")
public String action()
{
	return "GitAction Test";
}
@RequestMapping("/git")
	public String git()
	{
		return "this is git action test";
              }
}
