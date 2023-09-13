package com.teddyrugged.emailVerification.event.listener;

import com.teddyrugged.emailVerification.event.RegistrationCompleteEvent;
import com.teddyrugged.emailVerification.user.User;
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
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {

        User theUser= event.getUser();
        String verificationToken = UUID.randomUUID().toString();
        String url = event.getApplicationUrl()+"/register/verifyEmail?token="+verificationToken;

        log.info("Click the link to verify your registration : {}", url);

    }
}
