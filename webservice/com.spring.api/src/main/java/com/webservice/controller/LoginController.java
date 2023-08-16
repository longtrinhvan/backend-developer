package com.webservice.controller;

import com.webservice.service.authentication.ILoginRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private ILoginRequestService iloginRequestService;

//    @PostMapping("/login")
//    public String authenticateUser(Model model) {
//        HttpStatus httpStatus = HttpStatus.OK;
//        String result = "OK";
//        iloginRequestService.authenticateUser(model);
//        return "oauth_login";
//    }

    @GetMapping("/oauthlogin")
    public String getLoginPage(Model model) {
        var oauth2AuthenticationUrls = iloginRequestService.putOauth2AuthenticationUrls();
        model.addAttribute("urls", oauth2AuthenticationUrls);
        return "oauth_login";
    }

    @GetMapping("/success")
    public String getLoginInfo(Model model, OAuth2AuthenticationToken authentication) {
        var name = iloginRequestService.getLoginInfo(authentication);
        model.addAttribute("name", name);
        return "oauth_success";
    }
}
