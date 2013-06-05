package com.gramant.grails.springsecurity.vkontakte

/**
 * @author Igor Artamonov (http://igorartamonov.com)
 * @since 22.05.12
 */
class VKontakteAccessToken {

  String accessToken
  Date expireAt

  String toString() {
    "Access token: $accessToken, expires at $expireAt"
  }
}
