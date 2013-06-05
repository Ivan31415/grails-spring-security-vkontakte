package com.gramant.grails.springsecurity.vkontakte

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter

/**
 * unused!
 */
class VKontakteAuthDirectFilter extends AbstractAuthenticationProcessingFilter {

    private static Logger log = LoggerFactory.getLogger(this)

    VKontakteAuthUtils vkontakteAuthUtils

    VKontakteAuthDirectFilter(String url) {
        super(url)
    }

    Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
        VKontakteAuthToken token = vkontakteAuthUtils.build(request.getParameter('signedRequest'))
        if (token != null) {
            return getAuthenticationManager().authenticate(token)
        }
        return null
    }
}
