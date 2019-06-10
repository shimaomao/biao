package com.biao;


import foundation.omni.rpc.OmniClient;
import org.bitcoinj.core.Address;
import org.bitcoinj.params.MainNetParams;

import java.net.URI;

/**
 * usdt操作
 *
 * @create 2017/10/27
 **/
public class CoinUsdtService {


//    public static void main(String args[]) throws Exception {
//        boolean b = CheckUtil.checkBtcAddress("14xsRqXmZEvtkrA9RuFKP1ciwYT3ag9nGh");
//        System.out.println(b);
//
//        boolean a = CheckUtil.checkBtcAddress("1Re3v4Y8ALjQRky7QZbSiS1FPJk9pTn3z");
//        System.out.println(a);
//        URI uri = new URI("http://192.168.1.60:18111/");
//        OmniClient omniClient = new OmniClient(MainNetParams.get(), uri, "dazi", "dazi");
//        String fromAddress = "1rVevbaD1y9yjEKnrwjQ8ZVCfAixG4GnD";
//        String toAddress = "19F4DpsckPTQinNeBWDxUKHA91jAaHNUky";
//        String hash = omniClient.omniSend(Address.fromBase58(MainNetParams.get(), fromAddress), Address.fromBase58(MainNetParams.get(), toAddress),
//                new CurrencyID(UsdtConstants.USDT_ID), OmniValue.of(BigDecimal.valueOf(0.01), PropertyType.DIVISIBLE)).toString();
//
//        System.out.println(hash);
//        final BalanceEntry coin =
//                omniClient.omniGetBalance(Address.fromBase58(MainNetParams.get(), toAddress), new CurrencyID(UsdtConstants.USDT_ID));
//
//        System.out.println(coin);
//
//    }

    public static void main(String args[]) throws Exception {
        URI uri = new URI("http://47.52.237.209:18111/");
        OmniClient omniClient = new OmniClient(MainNetParams.get(), uri, "wpybtc", "wpybtc");
        Address newAddress = omniClient.getNewAddress();
        System.out.println(newAddress.toBase58());
//        Coin coin= omniClient.getBalance();
//        System.out.println(coin.toString());
//        System.out.println(coin);

    }
}
