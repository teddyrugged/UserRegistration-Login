package com.teddyrugged.emailVerification.user;

import com.teddyrugged.emailVerification.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User>getUsers();
    User registerUser(RegistrationRequest request);
    Optional<User>findByEmail(String email);

    void saveUserVerificationToken(String verificationToken, User theUser);
}
