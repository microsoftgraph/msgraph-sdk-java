package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProductFamily forValue(@javax.annotation.Nonnull final String searchValue) {
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
