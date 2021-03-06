package com.biao.vo;

import com.biao.pojo.RequestQuery;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 广告
 */
@Getter
@Setter
public class MkDistributeLogListVO extends RequestQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String coinId;
    private String symbol;

}
