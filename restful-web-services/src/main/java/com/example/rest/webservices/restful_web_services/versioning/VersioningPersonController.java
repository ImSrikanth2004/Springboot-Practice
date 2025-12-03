package com.example.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	@GetMapping("/v1/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Bob Ferguson");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Ernest", "Buckhart"));
	}
	
	@GetMapping(path="/person", params="version-1")
	public PersonV1 getPersonV1Req() {
		return new PersonV1("Bob Ferguson");
	}
	
	@GetMapping(path="/person", params="version-2")
	public PersonV2 getPersonV2Req() {
		return new PersonV2(new Name("Ernest", "Buckhart"));
	}
	
	@GetMapping(path="/person", headers="ver-1")
	public PersonV1 getPersonV1ReqHeader() {
		return new PersonV1("Jordan Belfort");
	}
	
	@GetMapping(path="/person", headers="X-API-VERSION-2")
	public PersonV2 getPersonV2ReqHeader() {
		return new PersonV2(new Name("Calvin", "Candie"));
	}
	
	@GetMapping(path="/person", produces="application/vnd.company.app-v1+json")
	public PersonV1 getPersonV1AcceptHeader() {
		return new PersonV1("Jordan Belfort");
	}
	
	@GetMapping(path="/person", produces="application/vnd.company.app-v2+json")
	public PersonV2 getPersonV2AcceptHeader() {
		return new PersonV2(new Name("Calvin", "Candie"));
	}
}

