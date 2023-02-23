package com.example.Day_2Atno;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@Value("${value}")
private String name;
@GetMapping("/a")
public String display()
{
	return "WELCOME "+name;
}
}