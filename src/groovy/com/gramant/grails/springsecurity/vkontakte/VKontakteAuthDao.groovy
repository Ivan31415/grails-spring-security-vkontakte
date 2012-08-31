package com.gramant.grails.springsecurity.vkontakte

import org.springframework.security.core.GrantedAuthority

public interface VKontakteAuthDao<F> {

    /**
     * Tries to load app user for VKontakte user
     * @param uid UID of VKontakte user
     * @return existing user, or null if there is no user for specified uid
     */
    F findUser(long uid)

    /**
     * Called when logged in facebook user doesn't exists in current database
     * @param token information about current authnetication
     * @return just created user
     */
    F create(VKontakteAuthToken token)

    /**
     * Returns `principal` that will be stored into Security Context. It's good if it
     * implements {@link org.springframework.security.core.userdetails.UserDetails UserDetails} or
     * {@link java.security.Principal Principal}.
     *
     * At most cases it's just current user, passed as parameter
     *
     * @param user current user
     * @return user to put into Security Context
     */
    Object getPrincipal(F user)

    /**
     * Roles for current user
     *
     * @param user current user
     * @return roles for user
     */
    Collection<GrantedAuthority> getRoles(F user)

    /**
    *
    * @param user target user
    * @return false when user have invalid token, or don't have token
    */
    Boolean hasValidToken(F user)

    /**
    * Setup new VKontakte Access Token for specified user
    *
    * @param user target user
    * @param token valid access token
    */
    void updateToken(F user, VKontakteAuthToken token)

    /**
    *
    * @param user target user
    * @return current access_token, or null if not exists
    */
    String getAccessToken(F user)
}