package com.bbex.robot.dao;

import lombok.Data;

@Data
public class JdbcConfig {
    /**
     * url;
     */
    private String url;
    /**
     * userName;
     */
    private String username;
    /**
     * pass;
     */
    private String pass;
}
