package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcUserSettingAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcUserSettingAssignment} and sets the default values.
     */
    public CloudPcUserSettingAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcUserSettingAssignment}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcUserSettingAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserSettingAssignment();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(CloudPcManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the target property value. The target property
     * @return a {@link CloudPcManagementAssignmentTarget}
     */
    @jakarta.annotation.Nullable
    public CloudPcManagementAssignmentTarget getTarget() {
        return this.backingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the target property value. The target property
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final CloudPcManagementAssignmentTarget value) {
        this.backingStore.set("target", value);
    }
}
