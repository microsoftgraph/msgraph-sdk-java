package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Possible values for firewallPacketQueueingMethod */
public enum FirewallPacketQueueingMethodType implements ValuedEnum {
    /** No value configured by Intune, do not override the user-configured device default value */
    DeviceDefault("deviceDefault"),
    /** Disable packet queuing */
    Disabled("disabled"),
    /** Queue inbound encrypted packets */
    QueueInbound("queueInbound"),
    /** Queue decrypted outbound packets for forwarding */
    QueueOutbound("queueOutbound"),
    /** Queue both inbound and outbound packets */
    QueueBoth("queueBoth");
    public final String value;
    FirewallPacketQueueingMethodType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FirewallPacketQueueingMethodType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "disabled": return Disabled;
            case "queueInbound": return QueueInbound;
            case "queueOutbound": return QueueOutbound;
            case "queueBoth": return QueueBoth;
            default: return null;
        }
    }
}
