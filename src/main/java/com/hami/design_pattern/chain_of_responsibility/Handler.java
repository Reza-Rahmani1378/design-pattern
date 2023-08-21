package com.hami.design_pattern.chain_of_responsibility;

public interface Handler {
     void setHandler(Handler handler);
     void process(File file);
     String getHandlerName();
}
