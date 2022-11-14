package com.dzh.dongbao.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class JwtUtil {
    private static final String secret = "adaga";

    public static String createToken(String subject) {
        String tocken = Jwts.builder().setSubject(subject)
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
        return tocken;
    }

    public static String parseTocken(String tocken) {
        Claims body = Jwts.parser().setSigningKey(secret).parseClaimsJws(tocken).getBody();
        String subject = body.getSubject();
        return subject;
    }

    public static void main(String[] args) throws InterruptedException {
        String name = "教育";
        String token = createToken(name);
        System.out.println("tocken:" + token);

        String srcStr = parseTocken(token);
        System.out.println("解析出来的tocken：" + srcStr);

        TimeUnit.SECONDS.sleep(4);
        srcStr = parseTocken(token);
        System.out.println("解析出来：" + srcStr);
    }


}
