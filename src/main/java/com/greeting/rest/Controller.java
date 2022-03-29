package com.greeting.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


	@GetMapping("/calculate")
	public double calculate(@RequestParam double firstNum, @RequestParam double secondNum, @RequestParam String operator) {
		switch (operator) {
			case "+":
				return firstNum + secondNum;
			case "-":
				return firstNum - secondNum;
			case "*":
				return firstNum * secondNum;
			case "/":
				return firstNum / secondNum;
			case "**":
				return Math.pow(firstNum, secondNum);
			default:
				break;
		}
		return 0;
	}
}

