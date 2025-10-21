package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmergencyCallEvent extends CallEvent implements Parsable {
    /**
     * Instantiates a new {@link EmergencyCallEvent} and sets the default values.
     */
    public EmergencyCallEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EmergencyCallEvent}
     */
    @jakarta.annotation.Nonnull
    public static EmergencyCallEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmergencyCallEvent();
    }
    /**
     * Gets the callerInfo property value. The information of the emergency caller.
     * @return a {@link EmergencyCallerInfo}
     */
    @jakarta.annotation.Nullable
    public EmergencyCallerInfo getCallerInfo() {
        return this.backingStore.get("callerInfo");
    }
    /**
     * Gets the emergencyNumberDialed property value. The emergency number dialed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmergencyNumberDialed() {
        return this.backingStore.get("emergencyNumberDialed");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callerInfo", (n) -> { this.setCallerInfo(n.getObjectValue(EmergencyCallerInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("emergencyNumberDialed", (n) -> { this.setEmergencyNumberDialed(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policyName property value. The policy name for the emergency call event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("callerInfo", this.getCallerInfo());
        writer.writeStringValue("emergencyNumberDialed", this.getEmergencyNumberDialed());
        writer.writeStringValue("policyName", this.getPolicyName());
    }
    /**
     * Sets the callerInfo property value. The information of the emergency caller.
     * @param value Value to set for the callerInfo property.
     */
    public void setCallerInfo(@jakarta.annotation.Nullable final EmergencyCallerInfo value) {
        this.backingStore.set("callerInfo", value);
    }
    /**
     * Sets the emergencyNumberDialed property value. The emergency number dialed.
     * @param value Value to set for the emergencyNumberDialed property.
     */
    public void setEmergencyNumberDialed(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emergencyNumberDialed", value);
    }
    /**
     * Sets the policyName property value. The policy name for the emergency call event.
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
}
