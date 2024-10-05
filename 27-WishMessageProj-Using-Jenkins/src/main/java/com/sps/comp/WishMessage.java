package com.sps.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wishUrl")
public class WishMessage {

	@Autowired
	private LocalDateTime ldt;

	@GetMapping("/getMsg/{name}")
	public ResponseEntity<String> greetMsg(@PathVariable String name) {
		int hour = ldt.getHour();
		String msg = null;

		if (hour >= 0 && hour < 12) {
			msg = "Good morning " + name + " sir!...";
		} else if (hour >= 12 && hour < 17) {
			msg = "Good afternoon " + name + " sir!...";
		} else if (hour >= 17 && hour < 19) {
			msg = "Good evening " + name + " sir!...";
		} else {
			msg = "Good night " + name + " sir!...";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
