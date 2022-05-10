package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the drive singleton. */
public enum DeviceEnrollmentType implements ValuedEnum {
    /** Default value, enrollment type was not collected. */
    Unknown("unknown"),
    /** User driven enrollment through BYOD channel. */
    UserEnrollment("userEnrollment"),
    /** User enrollment with a device enrollment manager account. */
    DeviceEnrollmentManager("deviceEnrollmentManager"),
    /** Apple bulk enrollment with user challenge. (DEP, Apple Configurator) */
    AppleBulkWithUser("appleBulkWithUser"),
    /** Apple bulk enrollment without user challenge. (DEP, Apple Configurator, Mobile Config) */
    AppleBulkWithoutUser("appleBulkWithoutUser"),
    /** Windows 10 Azure AD Join. */
    WindowsAzureADJoin("windowsAzureADJoin"),
    /** Windows 10 Bulk enrollment through ICD with certificate. */
    WindowsBulkUserless("windowsBulkUserless"),
    /** Windows 10 automatic enrollment. (Add work account) */
    WindowsAutoEnrollment("windowsAutoEnrollment"),
    /** Windows 10 bulk Azure AD Join. */
    WindowsBulkAzureDomainJoin("windowsBulkAzureDomainJoin"),
    /** Windows 10 Co-Management triggered by AutoPilot or Group Policy. */
    WindowsCoManagement("windowsCoManagement"),
    /** Windows 10 Azure AD Join using Device Auth. */
    WindowsAzureADJoinUsingDeviceAuth("windowsAzureADJoinUsingDeviceAuth"),
    /** Device managed by Apple user enrollment */
    AppleUserEnrollment("appleUserEnrollment"),
    /** Device managed by Apple user enrollment with service account */
    AppleUserEnrollmentWithServiceAccount("appleUserEnrollmentWithServiceAccount");
    public final String value;
    DeviceEnrollmentType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceEnrollmentType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "userEnrollment": return UserEnrollment;
            case "deviceEnrollmentManager": return DeviceEnrollmentManager;
            case "appleBulkWithUser": return AppleBulkWithUser;
            case "appleBulkWithoutUser": return AppleBulkWithoutUser;
            case "windowsAzureADJoin": return WindowsAzureADJoin;
            case "windowsBulkUserless": return WindowsBulkUserless;
            case "windowsAutoEnrollment": return WindowsAutoEnrollment;
            case "windowsBulkAzureDomainJoin": return WindowsBulkAzureDomainJoin;
            case "windowsCoManagement": return WindowsCoManagement;
            case "windowsAzureADJoinUsingDeviceAuth": return WindowsAzureADJoinUsingDeviceAuth;
            case "appleUserEnrollment": return AppleUserEnrollment;
            case "appleUserEnrollmentWithServiceAccount": return AppleUserEnrollmentWithServiceAccount;
            default: return null;
        }
    }
}
