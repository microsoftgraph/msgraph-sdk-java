package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventWebinarRegistrationConfiguration extends VirtualEventRegistrationConfiguration implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventWebinarRegistrationConfiguration} and sets the default values.
     */
    public VirtualEventWebinarRegistrationConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventWebinarRegistrationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventWebinarRegistrationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventWebinarRegistrationConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isManualApprovalEnabled", (n) -> { this.setIsManualApprovalEnabled(n.getBooleanValue()); });
        deserializerMap.put("isWaitlistEnabled", (n) -> { this.setIsWaitlistEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isManualApprovalEnabled property value. The isManualApprovalEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsManualApprovalEnabled() {
        return this.backingStore.get("isManualApprovalEnabled");
    }
    /**
     * Gets the isWaitlistEnabled property value. The isWaitlistEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsWaitlistEnabled() {
        return this.backingStore.get("isWaitlistEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isManualApprovalEnabled", this.getIsManualApprovalEnabled());
        writer.writeBooleanValue("isWaitlistEnabled", this.getIsWaitlistEnabled());
    }
    /**
     * Sets the isManualApprovalEnabled property value. The isManualApprovalEnabled property
     * @param value Value to set for the isManualApprovalEnabled property.
     */
    public void setIsManualApprovalEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isManualApprovalEnabled", value);
    }
    /**
     * Sets the isWaitlistEnabled property value. The isWaitlistEnabled property
     * @param value Value to set for the isWaitlistEnabled property.
     */
    public void setIsWaitlistEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isWaitlistEnabled", value);
    }
}
