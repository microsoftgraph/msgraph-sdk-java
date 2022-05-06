package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceEnrollmentType implements ValuedEnum {
    Unknown("unknown"),
    UserEnrollment("userEnrollment"),
    DeviceEnrollmentManager("deviceEnrollmentManager"),
    AppleBulkWithUser("appleBulkWithUser"),
    AppleBulkWithoutUser("appleBulkWithoutUser"),
    WindowsAzureADJoin("windowsAzureADJoin"),
    WindowsBulkUserless("windowsBulkUserless"),
    WindowsAutoEnrollment("windowsAutoEnrollment"),
    WindowsBulkAzureDomainJoin("windowsBulkAzureDomainJoin"),
    WindowsCoManagement("windowsCoManagement"),
    WindowsAzureADJoinUsingDeviceAuth("windowsAzureADJoinUsingDeviceAuth"),
    AppleUserEnrollment("appleUserEnrollment"),
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
