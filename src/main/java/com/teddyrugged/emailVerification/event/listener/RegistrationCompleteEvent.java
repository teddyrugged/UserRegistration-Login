package com.teddyrugged.emailVerification.event.listener;

import com.teddyrugged.emailVerification.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

public class RegistrationCompleteEventListener
        implements ApplicationListener <RegistrationCompleteEvent>{
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {

    }
}
