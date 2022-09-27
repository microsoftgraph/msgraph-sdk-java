package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EntitlementManagementSettings extends Entity implements Parsable {
    /** If externalUserLifecycleAction is blockSignInAndDelete, the duration, typically a number of days, after an external user is blocked from sign in before their account is deleted. */
    private Period _durationUntilExternalUserDeletedAfterBlocked;
    /** Automatic action that the service should take when an external user's last access package assignment is removed. The possible values are: none, blockSignIn, blockSignInAndDelete, unknownFutureValue. */
    private AccessPackageExternalUserLifecycleAction _externalUserLifecycleAction;
    /**
     * Instantiates a new entitlementManagementSettings and sets the default values.
     * @return a void
     */
    public EntitlementManagementSettings() {
        super();
        this.setOdataType("#microsoft.graph.entitlementManagementSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a entitlementManagementSettings
     */
    @javax.annotation.Nonnull
    public static EntitlementManagementSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitlementManagementSettings();
    }
    /**
     * Gets the durationUntilExternalUserDeletedAfterBlocked property value. If externalUserLifecycleAction is blockSignInAndDelete, the duration, typically a number of days, after an external user is blocked from sign in before their account is deleted.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDurationUntilExternalUserDeletedAfterBlocked() {
        return this._durationUntilExternalUserDeletedAfterBlocked;
    }
    /**
     * Gets the externalUserLifecycleAction property value. Automatic action that the service should take when an external user's last access package assignment is removed. The possible values are: none, blockSignIn, blockSignInAndDelete, unknownFutureValue.
     * @return a accessPackageExternalUserLifecycleAction
     */
    @javax.annotation.Nullable
    public AccessPackageExternalUserLifecycleAction getExternalUserLifecycleAction() {
        return this._externalUserLifecycleAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EntitlementManagementSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("durationUntilExternalUserDeletedAfterBlocked", (n) -> { currentObject.setDurationUntilExternalUserDeletedAfterBlocked(n.getPeriodValue()); });
            this.put("externalUserLifecycleAction", (n) -> { currentObject.setExternalUserLifecycleAction(n.getEnumValue(AccessPackageExternalUserLifecycleAction.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodValue("durationUntilExternalUserDeletedAfterBlocked", this.getDurationUntilExternalUserDeletedAfterBlocked());
        writer.writeEnumValue("externalUserLifecycleAction", this.getExternalUserLifecycleAction());
    }
    /**
     * Sets the durationUntilExternalUserDeletedAfterBlocked property value. If externalUserLifecycleAction is blockSignInAndDelete, the duration, typically a number of days, after an external user is blocked from sign in before their account is deleted.
     * @param value Value to set for the durationUntilExternalUserDeletedAfterBlocked property.
     * @return a void
     */
    public void setDurationUntilExternalUserDeletedAfterBlocked(@javax.annotation.Nullable final Period value) {
        this._durationUntilExternalUserDeletedAfterBlocked = value;
    }
    /**
     * Sets the externalUserLifecycleAction property value. Automatic action that the service should take when an external user's last access package assignment is removed. The possible values are: none, blockSignIn, blockSignInAndDelete, unknownFutureValue.
     * @param value Value to set for the externalUserLifecycleAction property.
     * @return a void
     */
    public void setExternalUserLifecycleAction(@javax.annotation.Nullable final AccessPackageExternalUserLifecycleAction value) {
        this._externalUserLifecycleAction = value;
    }
}
