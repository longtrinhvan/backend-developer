package com.webservice.service.authentication;

import com.webservice.model.authentication.LoginRequest;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.ui.Model;

import java.util.Map;

public interface ILoginRequestService {

    String authenticateUser(LoginRequest loginRequest);

    String authenticateUser(Model model);

    Map<String, String> putOauth2AuthenticationUrls();

    public Object getLoginInfo(OAuth2AuthenticationToken authentication);

}
