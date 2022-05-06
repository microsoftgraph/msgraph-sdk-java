package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceRegistrationState implements ValuedEnum {
    NotRegistered("notRegistered"),
    Registered("registered"),
    Revoked("revoked"),
    KeyConflict("keyConflict"),
    ApprovalPending("approvalPending"),
    CertificateReset("certificateReset"),
    NotRegisteredPendingEnrollment("notRegisteredPendingEnrollment"),
    Unknown("unknown");
    public final String value;
    DeviceRegistrationState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceRegistrationState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notRegistered": return NotRegistered;
            case "registered": return Registered;
            case "revoked": return Revoked;
            case "keyConflict": return KeyConflict;
            case "approvalPending": return ApprovalPending;
            case "certificateReset": return CertificateReset;
            case "notRegisteredPendingEnrollment": return NotRegisteredPendingEnrollment;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
