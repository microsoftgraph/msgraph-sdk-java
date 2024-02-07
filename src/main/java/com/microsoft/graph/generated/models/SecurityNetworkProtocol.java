package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityNetworkProtocol implements ValuedEnum {
    Unknown("unknown"),
    Ip("ip"),
    Icmp("icmp"),
    Igmp("igmp"),
    Ggp("ggp"),
    Ipv4("ipv4"),
    Tcp("tcp"),
    Pup("pup"),
    Udp("udp"),
    Idp("idp"),
    Ipv6("ipv6"),
    Ipv6RoutingHeader("ipv6RoutingHeader"),
    Ipv6FragmentHeader("ipv6FragmentHeader"),
    IpSecEncapsulatingSecurityPayload("ipSecEncapsulatingSecurityPayload"),
    IpSecAuthenticationHeader("ipSecAuthenticationHeader"),
    IcmpV6("icmpV6"),
    Ipv6NoNextHeader("ipv6NoNextHeader"),
    Ipv6DestinationOptions("ipv6DestinationOptions"),
    Nd("nd"),
    Raw("raw"),
    Ipx("ipx"),
    Spx("spx"),
    SpxII("spxII"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SecurityNetworkProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityNetworkProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "ip": return Ip;
            case "icmp": return Icmp;
            case "igmp": return Igmp;
            case "ggp": return Ggp;
            case "ipv4": return Ipv4;
            case "tcp": return Tcp;
            case "pup": return Pup;
            case "udp": return Udp;
            case "idp": return Idp;
            case "ipv6": return Ipv6;
            case "ipv6RoutingHeader": return Ipv6RoutingHeader;
            case "ipv6FragmentHeader": return Ipv6FragmentHeader;
            case "ipSecEncapsulatingSecurityPayload": return IpSecEncapsulatingSecurityPayload;
            case "ipSecAuthenticationHeader": return IpSecAuthenticationHeader;
            case "icmpV6": return IcmpV6;
            case "ipv6NoNextHeader": return Ipv6NoNextHeader;
            case "ipv6DestinationOptions": return Ipv6DestinationOptions;
            case "nd": return Nd;
            case "raw": return Raw;
            case "ipx": return Ipx;
            case "spx": return Spx;
            case "spxII": return SpxII;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
