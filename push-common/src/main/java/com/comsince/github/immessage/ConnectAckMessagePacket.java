package com.comsince.github.immessage;

import com.comsince.github.Signal;

/**
 * @author comsicne
 * Copyright (c) [2019]
 * @Time 19-6-12 上午11:28
 **/
public class ConnectAckMessagePacket extends ImPacket {
    @Override
    public Signal signal() {
        return Signal.CONNECT_ACK;
    }
}
