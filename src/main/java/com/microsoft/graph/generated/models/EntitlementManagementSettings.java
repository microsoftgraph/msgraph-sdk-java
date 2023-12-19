package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntitlementManagementSettings extends Entity implements Parsable {
    /**
     * Instantiates a new EntitlementManagementSettings and sets the default values.
     */
    public EntitlementManagementSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EntitlementManagementSettings
     */
    @jakarta.annotation.Nonnull
    public static EntitlementManagementSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitlementManagementSettings();
    }
    /**
     * Gets the durationUntilExternalUserDeletedAfterBlocked property value. If externalUserLifecycleAction is blockSignInAndDelete, the duration, typically many days, after an external user is blocked from sign in before their account is deleted.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDurationUntilExternalUserDeletedAfterBlocked() {
        return this.backingStore.get("durationUntilExternalUserDeletedAfterBlocked");
    }
    /**
     * Gets the externalUserLifecycleAction property value. Automatic action that the service should take when an external user's last access package assignment is removed. The possible values are: none, blockSignIn, blockSignInAndDelete, unknownFutureValue.
     * @return a EntitlementManagementSettingsExternalUserLifecycleAction
     */
    @jakarta.annotation.Nullable
    public EntitlementManagementSettingsExternalUserLifecycleAction getExternalUserLifecycleAction() {
        return this.backingStore.get("externalUserLifecycleAction");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("durationUntilExternalUserDeletedAfterBlocked", (n) -> { this.setDurationUntilExternalUserDeletedAfterBlocked(n.getPeriodAndDurationValue()); });
        deserializerMap.put("externalUserLifecycleAction", (n) -> { this.setExternalUserLifecycleAction(n.getEnumValue(EntitlementManagementSettingsExternalUserLifecycleAction::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodAndDurationValue("durationUntilExternalUserDeletedAfterBlocked", this.getDurationUntilExternalUserDeletedAfterBlocked());
        writer.writeEnumValue("externalUserLifecycleAction", this.getExternalUserLifecycleAction());
    }
    /**
     * Sets the durationUntilExternalUserDeletedAfterBlocked property value. If externalUserLifecycleAction is blockSignInAndDelete, the duration, typically many days, after an external user is blocked from sign in before their account is deleted.
     * @param value Value to set for the durationUntilExternalUserDeletedAfterBlocked property.
     */
    public void setDurationUntilExternalUserDeletedAfterBlocked(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("durationUntilExternalUserDeletedAfterBlocked", value);
    }
    /**
     * Sets the externalUserLifecycleAction property value. Automatic action that the service should take when an external user's last access package assignment is removed. The possible values are: none, blockSignIn, blockSignInAndDelete, unknownFutureValue.
     * @param value Value to set for the externalUserLifecycleAction property.
     */
    public void setExternalUserLifecycleAction(@jakarta.annotation.Nullable final EntitlementManagementSettingsExternalUserLifecycleAction value) {
        this.backingStore.set("externalUserLifecycleAction", value);
    }
}
