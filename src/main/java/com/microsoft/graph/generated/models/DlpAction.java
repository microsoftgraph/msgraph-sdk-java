package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DlpAction implements ValuedEnum {
    NotifyUser("notifyUser"),
    BlockAccess("blockAccess"),
    DeviceRestriction("deviceRestriction"),
    BrowserRestriction("browserRestriction"),
    UnknownFutureValue("unknownFutureValue"),
    RestrictAccess("restrictAccess"),
    GenerateAlert("generateAlert"),
    GenerateIncidentReportAction("generateIncidentReportAction"),
    SPBlockAnonymousAccess("sPBlockAnonymousAccess"),
    SPRuntimeAccessControl("sPRuntimeAccessControl"),
    SPSharingNotifyUser("sPSharingNotifyUser"),
    SPSharingGenerateIncidentReport("sPSharingGenerateIncidentReport");
    public final String value;
    DlpAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DlpAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notifyUser": return NotifyUser;
            case "blockAccess": return BlockAccess;
            case "deviceRestriction": return DeviceRestriction;
            case "browserRestriction": return BrowserRestriction;
            case "unknownFutureValue": return UnknownFutureValue;
            case "restrictAccess": return RestrictAccess;
            case "generateAlert": return GenerateAlert;
            case "generateIncidentReportAction": return GenerateIncidentReportAction;
            case "sPBlockAnonymousAccess": return SPBlockAnonymousAccess;
            case "sPRuntimeAccessControl": return SPRuntimeAccessControl;
            case "sPSharingNotifyUser": return SPSharingNotifyUser;
            case "sPSharingGenerateIncidentReport": return SPSharingGenerateIncidentReport;
            default: return null;
        }
    }
}
