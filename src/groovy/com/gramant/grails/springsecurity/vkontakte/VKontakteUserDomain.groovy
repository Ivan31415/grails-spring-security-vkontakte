package com.gramant.grails.springsecurity.vkontakte

interface VKontakteUserDomain {

	String getAccessToken()
	void setAccessToken(String accessToken)

	long getUid()
	void setUid(long uid)
}
