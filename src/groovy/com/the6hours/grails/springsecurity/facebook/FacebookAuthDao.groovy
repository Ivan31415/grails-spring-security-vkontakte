package com.the6hours.grails.springsecurity.facebook

import org.springframework.security.core.GrantedAuthority

public interface FacebookAuthDao {

    /**
     * Tries to load app user for Facebook user
     * @param uid UID of Facebook user
     * @return existing user, or null if there is no user for specified uid
     */
    FacebookUserDomain findUser(long uid)

    /**
     * Called when logged in facebook user doesn't exists in current database
     * @param token information about current authnetication
     * @return just created user
     */
    FacebookUserDomain create(FacebookAuthToken token)

    /**
     * Called when facebook session/auth token has been changed
     * @param user updates used details
     */
    void update(FacebookUserDomain user)

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
    Object getPrincipal(FacebookUserDomain user)

    /**
     * Roles for current user
     *
     * @param user current user
     * @return roles for user
     */
    Collection<GrantedAuthority> getRoles(FacebookUserDomain user)

}