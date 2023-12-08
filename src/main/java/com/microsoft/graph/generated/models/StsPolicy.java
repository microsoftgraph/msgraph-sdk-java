package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StsPolicy extends PolicyBase implements Parsable {
    /**
     * Instantiates a new StsPolicy and sets the default values.
     */
    public StsPolicy() {
        super();
        this.setOdataType("#microsoft.graph.stsPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a StsPolicy
     */
    @jakarta.annotation.Nonnull
    public static StsPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.activityBasedTimeoutPolicy": return new ActivityBasedTimeoutPolicy();
                case "#microsoft.graph.claimsMappingPolicy": return new ClaimsMappingPolicy();
                case "#microsoft.graph.homeRealmDiscoveryPolicy": return new HomeRealmDiscoveryPolicy();
                case "#microsoft.graph.tokenIssuancePolicy": return new TokenIssuancePolicy();
                case "#microsoft.graph.tokenLifetimePolicy": return new TokenLifetimePolicy();
            }
        }
        return new StsPolicy();
    }
    /**
     * Gets the appliesTo property value. The appliesTo property
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getAppliesTo() {
        return this.backingStore.get("appliesTo");
    }
    /**
     * Gets the definition property value. A string collection containing a JSON string that defines the rules and settings for a policy. The syntax for the definition differs for each derived policy type. Required.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefinition() {
        return this.backingStore.get("definition");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("definition", (n) -> { this.setDefinition(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isOrganizationDefault", (n) -> { this.setIsOrganizationDefault(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isOrganizationDefault property value. If set to true, activates this policy. There can be many policies for the same policy type, but only one can be activated as the organization default. Optional, default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOrganizationDefault() {
        return this.backingStore.get("isOrganizationDefault");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appliesTo", this.getAppliesTo());
        writer.writeCollectionOfPrimitiveValues("definition", this.getDefinition());
        writer.writeBooleanValue("isOrganizationDefault", this.getIsOrganizationDefault());
    }
    /**
     * Sets the appliesTo property value. The appliesTo property
     * @param value Value to set for the appliesTo property.
     */
    public void setAppliesTo(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("appliesTo", value);
    }
    /**
     * Sets the definition property value. A string collection containing a JSON string that defines the rules and settings for a policy. The syntax for the definition differs for each derived policy type. Required.
     * @param value Value to set for the definition property.
     */
    public void setDefinition(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("definition", value);
    }
    /**
     * Sets the isOrganizationDefault property value. If set to true, activates this policy. There can be many policies for the same policy type, but only one can be activated as the organization default. Optional, default value is false.
     * @param value Value to set for the isOrganizationDefault property.
     */
    public void setIsOrganizationDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOrganizationDefault", value);
    }
}
