package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Branding Options for the Message Template. Branding is defined in the Intune Admin Console.
 */
public enum NotificationTemplateBrandingOptions implements ValuedEnum {
    /** Indicates that no branding options are set in the message template. */
    None("none"),
    /** Indicates to include company logo in the message template. */
    IncludeCompanyLogo("includeCompanyLogo"),
    /** Indicates to include company name in the message template. */
    IncludeCompanyName("includeCompanyName"),
    /** Indicates to include contact information in the message template. */
    IncludeContactInformation("includeContactInformation"),
    /** Indicates to include company portal website link in the message template. */
    IncludeCompanyPortalLink("includeCompanyPortalLink"),
    /** Indicates to include device details in the message template. */
    IncludeDeviceDetails("includeDeviceDetails"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NotificationTemplateBrandingOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NotificationTemplateBrandingOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "includeCompanyLogo": return IncludeCompanyLogo;
            case "includeCompanyName": return IncludeCompanyName;
            case "includeContactInformation": return IncludeContactInformation;
            case "includeCompanyPortalLink": return IncludeCompanyPortalLink;
            case "includeDeviceDetails": return IncludeDeviceDetails;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
