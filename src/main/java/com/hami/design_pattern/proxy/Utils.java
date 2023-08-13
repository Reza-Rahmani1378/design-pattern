package com.hami.design_pattern.proxy;

import java.util.Date;

public class Utils {
    public static String getString() {
        return "********************Location X Daily Report********************" +
                "\\n Location ID: 012" +
                "\\n Today’s Date: " + new Date() +
                "\\n Total Pizza’s Sell: 112" +
                "\\n Total Price: $2534" +
                "\\n Net Profit: $1985" +
                "\\n***************************************************************";
    }
}
