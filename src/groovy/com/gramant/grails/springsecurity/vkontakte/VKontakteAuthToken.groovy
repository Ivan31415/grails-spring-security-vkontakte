package com.gramant.grails.springsecurity.vkontakte

import org.springframework.security.authentication.AbstractAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority

/**
 * Initially we only know user id (uid).
 */
class VKontakteAuthToken extends AbstractAuthenticationToken implements Authentication {

    long uid
    VKontakteAccessToken accessToken
    String code

    Object principal

    Collection<GrantedAuthority> authorities

    VKontakteAuthToken() {
        super([] as Collection<GrantedAuthority>)
    }

    Object getCredentials() {
        return uid
    }

    String toString() {
        return "Principal: $principal, uid: $uid, roles: ${authorities.collect { it.authority}}"
    }
}
