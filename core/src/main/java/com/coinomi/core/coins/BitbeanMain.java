package com.coinomi.core.coins;

import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author Bean Core www.bitbean.org
 */
public class BitbeanMain extends PeerFamily {
    private BitbeanMain() {
        id = "bitbean.main";

        addressHeader = 3;
        p2shHeader = 85;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 110;
        dumpedPrivateKeyHeader = 131;

        name = "Bitbean";
        symbol = "BITB";
        uriScheme = "bitbean";
        bip44Index = 88;
        unitExponent = 8;
        feeValue = value(1000000);  // 0.01 BITB
        minNonDust = value(1000000);  // 0.01 BITB
        softDustLimit = value(1000000); // 0.01 BITB
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Bitbean Signed Message:\n");
    }

    private static BitbeanMain instance = new BitbeanMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
