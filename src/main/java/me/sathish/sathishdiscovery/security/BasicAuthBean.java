package me.sathish.sathishdiscovery.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasicAuthBean {
    @Value("${discoveryserverpassword:pass}")
    private String password;

    @Value("${discoveryserverusername:sathish}")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
