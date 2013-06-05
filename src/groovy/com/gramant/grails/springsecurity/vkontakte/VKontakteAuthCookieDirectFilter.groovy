package com.gramant.grails.springsecurity.vkontakte

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter

/**
 * @author Igor Artamonov (http://igorartamonov.com)
 * @since 05.07.12
 */
class VKontakteAuthCookieDirectFilter extends AbstractAuthenticationProcessingFilter {

    VKontakteAuthUtils vkontakteAuthUtils

    VKontakteAuthCookieDirectFilter(String defaultFilterProcessesUrl) {
        super(defaultFilterProcessesUrl)
    }

    @Override
    Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
        String cookie = vkontakteAuthUtils.getAuthCookie(request)
        if (!cookie) {
            throw new InvalidCookieException("No cookie")
//            return null
        }
        VKontakteAuthToken token = vkontakteAuthUtils.build(cookie)
        return authenticationManager.authenticate(token)
    }
}
