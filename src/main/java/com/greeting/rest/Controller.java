package com.greeting.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
				return 0;
		}
	}
	@PostMapping("/calc")
	public double calc(@RequestBody PostBody body) {
		switch (body.getOperator()) {
			case "+":
				return body.getFirstNum() + body.getSecondNum();
			case "-":
				return body.getFirstNum() - body.getSecondNum();
			case "*":
				return body.getFirstNum() * body.getSecondNum();
			case "/":
				return body.getFirstNum() / body.getSecondNum();
			case "**":
				return Math.pow(body.getFirstNum(), body.getSecondNum());
			default:
				return 0;
		}
	}
}

