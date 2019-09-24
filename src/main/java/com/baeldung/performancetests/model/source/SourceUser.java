package com.baeldung.performancetests.model.source;

import com.googlecode.jmapper.annotations.JGlobalMap;

public class SourceUser {
    private String username;
    private String email;
    private AccountStatus userAccountStatus;

    public SourceUser(String username, String email, AccountStatus userAccountStatus) {
        this.username = username;
        this.email = email;
        this.userAccountStatus = userAccountStatus;
    }

    public SourceUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AccountStatus getUserAccountStatus() {
        return userAccountStatus;
    }

    public void setUserAccountStatus(AccountStatus userAccountStatus) {
        this.userAccountStatus = userAccountStatus;
    }
}
