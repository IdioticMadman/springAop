package com.robert.aop.service;

import com.robert.aop.security.CurrentUserHolder;
import org.omg.CORBA.Current;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public void checkAccess() {
        String user = CurrentUserHolder.get();
        if (!"admin".equals(user)) {
            throw new RuntimeException("operation is not allow");
        }
    }
}
