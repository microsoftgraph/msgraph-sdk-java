package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementExchangeAccessStateReason implements ValuedEnum {
    None("none"),
    Unknown("unknown"),
    ExchangeGlobalRule("exchangeGlobalRule"),
    ExchangeIndividualRule("exchangeIndividualRule"),
    ExchangeDeviceRule("exchangeDeviceRule"),
    ExchangeUpgrade("exchangeUpgrade"),
    ExchangeMailboxPolicy("exchangeMailboxPolicy"),
    Other("other"),
    Compliant("compliant"),
    NotCompliant("notCompliant"),
    NotEnrolled("notEnrolled"),
    UnknownLocation("unknownLocation"),
    MfaRequired("mfaRequired"),
    AzureADBlockDueToAccessPolicy("azureADBlockDueToAccessPolicy"),
    CompromisedPassword("compromisedPassword"),
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
