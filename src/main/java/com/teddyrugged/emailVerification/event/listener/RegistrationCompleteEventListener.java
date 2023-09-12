package com.teddyrugged.emailVerification.event.listener;

import com.teddyrugged.emailVerification.event.RegistrationCompleteEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class RegistrationCompleteEventListener
        implements ApplicationListener<RegistrationCompleteEvent>{


    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {

    }
}
