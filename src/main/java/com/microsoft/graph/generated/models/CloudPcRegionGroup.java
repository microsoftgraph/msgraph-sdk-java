package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcRegionGroup implements ValuedEnum {
    Default("default"),
    Australia("australia"),
    Canada("canada"),
    UsCentral("usCentral"),
    UsEast("usEast"),
    UsWest("usWest"),
    France("france"),
    Germany("germany"),
    EuropeUnion("europeUnion"),
    UnitedKingdom("unitedKingdom"),
    Japan("japan"),
    Asia("asia"),
    India("india"),
    SouthAmerica("southAmerica"),
    Euap("euap"),
    UsGovernment("usGovernment"),
    UsGovernmentDOD("usGovernmentDOD"),
    Norway("norway"),
    Switzerland("switzerland"),
    SouthKorea("southKorea"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcRegionGroup(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcRegionGroup forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "australia": return Australia;
            case "canada": return Canada;
            case "usCentral": return UsCentral;
            case "usEast": return UsEast;
            case "usWest": return UsWest;
            case "france": return France;
            case "germany": return Germany;
            case "europeUnion": return EuropeUnion;
            case "unitedKingdom": return UnitedKingdom;
            case "japan": return Japan;
            case "asia": return Asia;
            case "india": return India;
            case "southAmerica": return SouthAmerica;
            case "euap": return Euap;
            case "usGovernment": return UsGovernment;
            case "usGovernmentDOD": return UsGovernmentDOD;
            case "norway": return Norway;
            case "switzerland": return Switzerland;
            case "southKorea": return SouthKorea;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
