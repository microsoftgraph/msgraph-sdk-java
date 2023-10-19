package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PayloadBrand implements ValuedEnum {
    Unknown("unknown"),
    Other("other"),
    AmericanExpress("americanExpress"),
    CapitalOne("capitalOne"),
    Dhl("dhl"),
    DocuSign("docuSign"),
    Dropbox("dropbox"),
    Facebook("facebook"),
    FirstAmerican("firstAmerican"),
    Microsoft("microsoft"),
    Netflix("netflix"),
    Scotiabank("scotiabank"),
    SendGrid("sendGrid"),
    StewartTitle("stewartTitle"),
    Tesco("tesco"),
    WellsFargo("wellsFargo"),
    SyrinxCloud("syrinxCloud"),
    Adobe("adobe"),
    Teams("teams"),
    Zoom("zoom"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PayloadBrand(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PayloadBrand forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "other": return Other;
            case "americanExpress": return AmericanExpress;
            case "capitalOne": return CapitalOne;
            case "dhl": return Dhl;
            case "docuSign": return DocuSign;
            case "dropbox": return Dropbox;
            case "facebook": return Facebook;
            case "firstAmerican": return FirstAmerican;
            case "microsoft": return Microsoft;
            case "netflix": return Netflix;
            case "scotiabank": return Scotiabank;
            case "sendGrid": return SendGrid;
            case "stewartTitle": return StewartTitle;
            case "tesco": return Tesco;
            case "wellsFargo": return WellsFargo;
            case "syrinxCloud": return SyrinxCloud;
            case "adobe": return Adobe;
            case "teams": return Teams;
            case "zoom": return Zoom;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
