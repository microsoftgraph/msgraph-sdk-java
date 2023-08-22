package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProductFamily implements ValuedEnum {
    Unknown("unknown"),
    Teams("teams"),
    SkypeForBusiness("skypeForBusiness"),
    Lync("lync"),
    UnknownFutureValue("unknownFutureValue"),
    AzureCommunicationServices("azureCommunicationServices");
    public final String value;
    ProductFamily(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProductFamily forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "teams": return Teams;
            case "skypeForBusiness": return SkypeForBusiness;
            case "lync": return Lync;
            case "unknownFutureValue": return UnknownFutureValue;
            case "azureCommunicationServices": return AzureCommunicationServices;
            default: return null;
        }
    }
}
