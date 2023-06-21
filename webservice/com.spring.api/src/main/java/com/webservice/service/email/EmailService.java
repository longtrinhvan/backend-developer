package com.webservice.service.email;

import com.webservice.model.Email;
import com.webservice.repository.EmailConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Properties;
import java.util.Random;

@Service
public class EmailService implements IEmailService {
    private final EmailConfigRepository emailConfigRepository;

    @Autowired
    public EmailService(EmailConfigRepository emailConfigRepository) {
        this.emailConfigRepository = emailConfigRepository;
    }

    private String generateVerificationCode() {
        Random random = new Random();
        int randomNumber = random.nextInt(900000) + 100000;
        return String.valueOf(randomNumber);
    }

    private void configureMailProperties(JavaMailSenderImpl mailSender) {
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
    }

    private JavaMailSender createJavaMailSender(Email emailConfig) {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername(emailConfig.getUsername());
        mailSender.setPassword(emailConfig.getPassword());
        configureMailProperties(mailSender);
        return mailSender;
    }


    @Override
    public String sendVerificationEmail(String toEmail) {
        String randomNumber = generateVerificationCode();
        String subject = "Xác thực tài khoản";
        String content = "Mã xác thực của bạn là: " + randomNumber;

        Optional<Email> emailConfigOptional = emailConfigRepository.findById(1L);

        if (emailConfigOptional.isPresent()) {
            var emailConfig = emailConfigOptional.get();

            if (emailConfig.getUsername() == null || emailConfig.getPassword() == null) {
                return "Cấu hình email không hợp lệ";
            }
            var mailSender = createJavaMailSender(emailConfig);
            var message = new SimpleMailMessage();
            message.setFrom(emailConfig.getUsername());
            message.setTo(toEmail);
            message.setSubject(subject);
            message.setText(content);
            mailSender.send(message);
            return "Đã gửi email thành công";
        } else {
            return "Đã xảy ra lỗi khi gửi email";
        }
    }

}

