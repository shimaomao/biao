package com.biao.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class TradeExPairDayAvgVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String coinMain;

    private String coinOther;

    private BigDecimal avgPrice;
}
