package com.teddyrugged.emailVerification.event.listener;

import com.teddyrugged.emailVerification.event.RegistrationCompleteEvent;
import com.teddyrugged.emailVerification.user.User;
import com.teddyrugged.emailVerification.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class RegistrationCompleteEventListener
        implements ApplicationListener<RegistrationCompleteEvent>{
    private final UserService userService;
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {

        User theUser= event.getUser();
        String verificationToken = UUID.randomUUID().toString();
        userService.saveUserVerificationToken(verificationToken, theUser);

        String url = event.getApplicationUrl()+"/register/verifyEmail?token="+verificationToken;

        log.info("Click the link to verify your registration : {}", url);

    }
}
