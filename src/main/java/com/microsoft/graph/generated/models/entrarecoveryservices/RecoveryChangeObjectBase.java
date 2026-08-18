package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecoveryChangeObjectBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RecoveryChangeObjectBase} and sets the default values.
     */
    public RecoveryChangeObjectBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecoveryChangeObjectBase}
     */
    @jakarta.annotation.Nonnull
    public static RecoveryChangeObjectBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecoveryChangeObjectBase();
    }
    /**
     * Gets the displayName property value. The display name of the changed object in its current state, used to uniquely identify the object. Supports $filter (eq, ne, startswith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the entityTypeName property value. The entityTypeName property
     * @return a {@link ResourceTypeName}
     */
    @jakarta.annotation.Nullable
    public ResourceTypeName getEntityTypeName() {
        return this.backingStore.get("entityTypeName");
    }
    /**
     * Gets the failureMessage property value. The error message if the change failed to apply. Only populated in getFailedChanges responses. null otherwise.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFailureMessage() {
        return this.backingStore.get("failureMessage");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("entityTypeName", (n) -> { this.setEntityTypeName(n.getEnumValue(ResourceTypeName::forValue)); });
        deserializerMap.put("failureMessage", (n) -> { this.setFailureMessage(n.getStringValue()); });
        deserializerMap.put("recoveryAction", (n) -> { this.setRecoveryAction(n.getEnumValue(RecoveryAction::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the recoveryAction property value. The recoveryAction property
     * @return a {@link RecoveryAction}
     */
    @jakarta.annotation.Nullable
    public RecoveryAction getRecoveryAction() {
        return this.backingStore.get("recoveryAction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("entityTypeName", this.getEntityTypeName());
        writer.writeStringValue("failureMessage", this.getFailureMessage());
        writer.writeEnumValue("recoveryAction", this.getRecoveryAction());
    }
    /**
     * Sets the displayName property value. The display name of the changed object in its current state, used to uniquely identify the object. Supports $filter (eq, ne, startswith).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the entityTypeName property value. The entityTypeName property
     * @param value Value to set for the entityTypeName property.
     */
    public void setEntityTypeName(@jakarta.annotation.Nullable final ResourceTypeName value) {
        this.backingStore.set("entityTypeName", value);
    }
    /**
     * Sets the failureMessage property value. The error message if the change failed to apply. Only populated in getFailedChanges responses. null otherwise.
     * @param value Value to set for the failureMessage property.
     */
    public void setFailureMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("failureMessage", value);
    }
    /**
     * Sets the recoveryAction property value. The recoveryAction property
     * @param value Value to set for the recoveryAction property.
     */
    public void setRecoveryAction(@jakarta.annotation.Nullable final RecoveryAction value) {
        this.backingStore.set("recoveryAction", value);
    }
}
