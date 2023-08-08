package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Top level failure categories for enrollment.
 */
public enum DeviceEnrollmentFailureReason implements ValuedEnum {
    /** Default value, failure reason is unknown. */
    Unknown("unknown"),
    /** Authentication failed */
    Authentication("authentication"),
    /** Call was authenticated, but not authorized to enroll. */
    Authorization("authorization"),
    /** Failed to validate the account for enrollment. (Account blocked, enrollment not enabled) */
    AccountValidation("accountValidation"),
    /** User could not be validated. (User does not exist, missing license) */
    UserValidation("userValidation"),
    /** Device is not supported for mobile device management. */
    DeviceNotSupported("deviceNotSupported"),
    /** Account is in maintenance. */
    InMaintenance("inMaintenance"),
    /** Client sent a request that is not understood/supported by the service. */
    BadRequest("badRequest"),
    /** Feature(s) used by this enrollment are not supported for this account. */
    FeatureNotSupported("featureNotSupported"),
    /** Enrollment restrictions configured by admin blocked this enrollment. */
    EnrollmentRestrictionsEnforced("enrollmentRestrictionsEnforced"),
    /** Client timed out or enrollment was aborted by enduser. */
    ClientDisconnected("clientDisconnected"),
    /** Enrollment was abandoned by enduser. (Enduser started onboarding but failed to complete it in timely manner) */
    UserAbandonment("userAbandonment");
    public final String value;
    DeviceEnrollmentFailureReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceEnrollmentFailureReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "authentication": return Authentication;
            case "authorization": return Authorization;
            case "accountValidation": return AccountValidation;
            case "userValidation": return UserValidation;
            case "deviceNotSupported": return DeviceNotSupported;
            case "inMaintenance": return InMaintenance;
            case "badRequest": return BadRequest;
            case "featureNotSupported": return FeatureNotSupported;
            case "enrollmentRestrictionsEnforced": return EnrollmentRestrictionsEnforced;
            case "clientDisconnected": return ClientDisconnected;
            case "userAbandonment": return UserAbandonment;
            default: return null;
        }
    }
}
