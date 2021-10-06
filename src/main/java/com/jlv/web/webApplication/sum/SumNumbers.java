package com.jlv.web.webApplication.sum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlv.web.webApplication.sum.model.OperationResult;

@RestController
@RequestMapping("/operation")
public class SumNumbers{
	@Autowired
	OperationResult operationResult;
	
	@CrossOrigin
	@GetMapping("/{num1}/{num2}/{option}")
	public OperationResult getSum( @PathVariable("num1") double num1, @PathVariable("num2")double num2, @PathVariable("option") String option) {
		double resul = 0;
		switch(option) {
		case "A":
			resul = num1 + num2;
			break;
		case "S":
			resul = num1 - num2;
			break;
		case "M":
			resul = num1 * num2;
			break;
		case "D":
			resul = num1/num2;
			break;
		default:
			resul = num1 + num2;
			break;
		}		
		operationResult.setResult(resul);
		return operationResult;

	}

}
