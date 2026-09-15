package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RelationshipCreationType implements ValuedEnum {
    /** Represents a relationship between two tenants that was created by an explicit approval from the governed tenant admin. */
    ApprovedByAdmin("approvedByAdmin"),
    /** Represents a relationship between the add-on tenant and the tenant from which it was created. */
    AddOnTenant("addOnTenant"),
    /** This will help in making this enum evolvable and adding more values in the future- */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RelationshipCreationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RelationshipCreationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "approvedByAdmin": return ApprovedByAdmin;
            case "addOnTenant": return AddOnTenant;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
