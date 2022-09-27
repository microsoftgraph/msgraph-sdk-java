package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum FederatedIdpMfaBehavior implements ValuedEnum {
    AcceptIfMfaDoneByFederatedIdp("acceptIfMfaDoneByFederatedIdp"),
    EnforceMfaByFederatedIdp("enforceMfaByFederatedIdp"),
    RejectMfaByFederatedIdp("rejectMfaByFederatedIdp"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FederatedIdpMfaBehavior(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FederatedIdpMfaBehavior forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "acceptIfMfaDoneByFederatedIdp": return AcceptIfMfaDoneByFederatedIdp;
            case "enforceMfaByFederatedIdp": return EnforceMfaByFederatedIdp;
            case "rejectMfaByFederatedIdp": return RejectMfaByFederatedIdp;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
