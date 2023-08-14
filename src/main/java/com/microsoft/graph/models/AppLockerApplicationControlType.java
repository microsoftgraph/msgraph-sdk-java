package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of AppLocker Application Control Types
 */
public enum AppLockerApplicationControlType implements ValuedEnum {
    /** Device default value, no Application Control type selected. */
    NotConfigured("notConfigured"),
    /** Enforce Windows component and store apps. */
    EnforceComponentsAndStoreApps("enforceComponentsAndStoreApps"),
    /** Audit Windows component and store apps. */
    AuditComponentsAndStoreApps("auditComponentsAndStoreApps"),
    /** Enforce Windows components, store apps and smart locker. */
    EnforceComponentsStoreAppsAndSmartlocker("enforceComponentsStoreAppsAndSmartlocker"),
    /** Audit Windows components, store apps and smart locker. */
    AuditComponentsStoreAppsAndSmartlocker("auditComponentsStoreAppsAndSmartlocker");
    public final String value;
    AppLockerApplicationControlType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppLockerApplicationControlType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enforceComponentsAndStoreApps": return EnforceComponentsAndStoreApps;
            case "auditComponentsAndStoreApps": return AuditComponentsAndStoreApps;
            case "enforceComponentsStoreAppsAndSmartlocker": return EnforceComponentsStoreAppsAndSmartlocker;
            case "auditComponentsStoreAppsAndSmartlocker": return AuditComponentsStoreAppsAndSmartlocker;
            default: return null;
        }
    }
}
