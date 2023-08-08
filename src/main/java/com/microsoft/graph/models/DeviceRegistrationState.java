package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device registration status.
 */
public enum DeviceRegistrationState implements ValuedEnum {
    /** The device is not registered. */
    NotRegistered("notRegistered"),
    /** The device is registered. */
    Registered("registered"),
    /** The device has been blocked, wiped or retired. */
    Revoked("revoked"),
    /** The device has a key conflict. */
    KeyConflict("keyConflict"),
    /** The device is pending approval. */
    ApprovalPending("approvalPending"),
    /** The device certificate has been reset. */
    CertificateReset("certificateReset"),
    /** The device is not registered and pending enrollment. */
    NotRegisteredPendingEnrollment("notRegisteredPendingEnrollment"),
    /** The device registration status is unknown. */
    Unknown("unknown");
    public final String value;
    DeviceRegistrationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceRegistrationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
