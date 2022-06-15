package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum AppLockerApplicationControlType implements ValuedEnum {
    /** Device default value, no Application Control type selected. */
    NotConfigured("notConfigured"),
    /** Enforce Windows component and store apps. */
    EnforceComponentsAndStoreApps("enforceComponentsAndStoreApps"),
    /** Audit Windows component and store apps. */
    AuditComponentsAndStoreApps("auditComponentsAndStoreApps"),
    /** Enforce Windows components, store apps and smart locker. */
    EnforceComponentsStoreAppsAndSmartlocker("enforceComponentsStoreAppsAndSmartlocker"),
    /** Audit Windows components, store apps and smart locker​. */
    AuditComponentsStoreAppsAndSmartlocker("auditComponentsStoreAppsAndSmartlocker");
    public final String value;
    AppLockerApplicationControlType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppLockerApplicationControlType forValue(@javax.annotation.Nonnull final String searchValue) {
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
