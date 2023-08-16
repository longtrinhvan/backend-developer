package com.webservice.service.authentication;

import com.webservice.model.authentication.LoginRequest;

public interface ILoginRequestService {

    String authenticateUser(LoginRequest loginRequest);

}
