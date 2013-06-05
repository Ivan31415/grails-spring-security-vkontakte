VKontakte Auth plugin for Grails
===============================

Grails plugin for VKontakte Authentication, as extension to [Grails Spring Security Core plugin](http://www.grails.org/plugin/spring-security-core)
The code is based on Facebook plugin, with some VK-specific issues resolved.

Requirements
------------

 * grails 2.0+
 * spring-security-core plugin 1.2.7.3+

How to install
--------------

Install this plugin by adding a dependency to your BuildConfig.groovy:

    plugins {
       ...
       compile ':spring-security-vkontakte:<current plugin version>'
    }

Configure spring-security-core by running the s2-quickstart script, then this plugin by running the s2-init-vkontakte script.


How to use
----------

For documentation see: <a href="http://grails.org/plugin/spring-security-facebook">http://grails.org/plugin/spring-security-facebook</a>
(no VK documentation yet...)

Examples:

  * https://github.com/splix/s2-facebook-example - Example app

Questions?
----------

Have any questions? Contact me: nekoval@yandex.ru
