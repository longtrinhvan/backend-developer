package com.webservice.config.security;

import com.webservice.model.User;
import com.webservice.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private IUserRepository iuserRepository;

    @Autowired
    @Lazy
    private AuthenticationManager authenticationManager;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException, IOException {
        // Lưu thông tin xác thực vào session
        HttpSession session = request.getSession();
        session.setAttribute("authenticatedUser", authentication);

        // Thiết lập thời gian tương tác cuối cùng cho người dùng sau khi đăng nhập thành công
        User user = iuserRepository.findByUsername(authentication.getName());
        user.setLastLoginDate(LocalDate.now());
        iuserRepository.save(user);

        // Tiến hành redirect hoặc gửi kết quả thành công tùy theo yêu cầu của bạn
        // Ví dụ: Redirect người dùng đến trang chính sau khi đăng nhập thành công
        response.sendRedirect("/home");
    }

}
