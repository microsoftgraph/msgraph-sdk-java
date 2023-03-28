package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Device Exchange Access State Reason. */
public enum DeviceManagementExchangeAccessStateReason implements ValuedEnum {
    /** No access state reason discovered from Exchange */
    None("none"),
    /** Unknown access state reason */
    Unknown("unknown"),
    /** Access state determined by Exchange Global rule */
    ExchangeGlobalRule("exchangeGlobalRule"),
    /** Access state determined by Exchange Individual rule */
    ExchangeIndividualRule("exchangeIndividualRule"),
    /** Access state determined by Exchange Device rule */
    ExchangeDeviceRule("exchangeDeviceRule"),
    /** Access state due to Exchange upgrade */
    ExchangeUpgrade("exchangeUpgrade"),
    /** Access state determined by Exchange Mailbox Policy */
    ExchangeMailboxPolicy("exchangeMailboxPolicy"),
    /** Access state determined by Exchange */
    Other("other"),
    /** Access state granted by compliance challenge */
    Compliant("compliant"),
    /** Access state revoked by compliance challenge */
    NotCompliant("notCompliant"),
    /** Access state revoked by management challenge */
    NotEnrolled("notEnrolled"),
    /** Access state due to unknown location */
    UnknownLocation("unknownLocation"),
    /** Access state due to MFA challenge */
    MfaRequired("mfaRequired"),
    /** Access State revoked by AAD Access Policy */
    AzureADBlockDueToAccessPolicy("azureADBlockDueToAccessPolicy"),
    /** Access State revoked by compromised password */
    CompromisedPassword("compromisedPassword"),
    /** Access state revoked by managed application challenge */
    DeviceNotKnownWithManagedApp("deviceNotKnownWithManagedApp");
    public final String value;
    DeviceManagementExchangeAccessStateReason(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExchangeAccessStateReason forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "unknown": return Unknown;
            case "exchangeGlobalRule": return ExchangeGlobalRule;
            case "exchangeIndividualRule": return ExchangeIndividualRule;
            case "exchangeDeviceRule": return ExchangeDeviceRule;
            case "exchangeUpgrade": return ExchangeUpgrade;
            case "exchangeMailboxPolicy": return ExchangeMailboxPolicy;
            case "other": return Other;
            case "compliant": return Compliant;
            case "notCompliant": return NotCompliant;
            case "notEnrolled": return NotEnrolled;
            case "unknownLocation": return UnknownLocation;
            case "mfaRequired": return MfaRequired;
            case "azureADBlockDueToAccessPolicy": return AzureADBlockDueToAccessPolicy;
            case "compromisedPassword": return CompromisedPassword;
            case "deviceNotKnownWithManagedApp": return DeviceNotKnownWithManagedApp;
            default: return null;
        }
    }
}
