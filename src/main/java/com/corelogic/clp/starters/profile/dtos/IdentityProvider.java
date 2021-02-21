package com.corelogic.clp.starters.profile.dtos;

public enum IdentityProvider {
    CLAUTH,
    CLGX_USER_SSO,
    CLAUTH_SERVICE_ACCOUNT,
    STEARNS_SSO,
    CITIZENS_SSO;

    private IdentityProvider() {
    }
}