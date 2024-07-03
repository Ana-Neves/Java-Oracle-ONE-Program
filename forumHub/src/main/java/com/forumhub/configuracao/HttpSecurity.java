package com.forumhub.configuracao;

import java.awt.*;

public interface HttpSecurity {
    Object sessionManagement();

    Component csrf();

    Object authorizeRequests();

    void apply(JwtTokenFilterConfigurer jwtTokenFilterConfigurer);
}
