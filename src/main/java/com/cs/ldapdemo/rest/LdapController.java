package com.cs.ldapdemo.rest;

import com.cs.ldapdemo.model.User;
import com.cs.ldapdemo.service.LdapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ldap")
public class LdapController {

	@Autowired
	private LdapService ldapService;

	@PostMapping("/user/authentication")
	public boolean verifyCredentials(@RequestBody User user) {
		return this.ldapService.verifyCredentials(user);
	}

	@PostMapping("/roles")
	public List<String> getRoles(@RequestBody User user) {
		return this.ldapService.getRoles(user);
	}
}


















