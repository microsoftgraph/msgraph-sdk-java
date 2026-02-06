package com.microsoft.graph.models.teamsadministration;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsPolicyUserAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamsPolicyUserAssignment} and sets the default values.
     */
    public TeamsPolicyUserAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamsPolicyUserAssignment}
     */
    @jakarta.annotation.Nonnull
    public static TeamsPolicyUserAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsPolicyUserAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policyId property value. The unique identifier (GUID) of the policy within the specified policy type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the policyType property value. The type of Teams policy assigned or unassigned, such as teamsMeetingBroadcastPolicy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyType() {
        return this.backingStore.get("policyType");
    }
    /**
     * Gets the userId property value. The unique identifier (GUID) of the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyType", this.getPolicyType());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the policyId property value. The unique identifier (GUID) of the policy within the specified policy type.
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the policyType property value. The type of Teams policy assigned or unassigned, such as teamsMeetingBroadcastPolicy.
     * @param value Value to set for the policyType property.
     */
    public void setPolicyType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyType", value);
    }
    /**
     * Sets the userId property value. The unique identifier (GUID) of the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
