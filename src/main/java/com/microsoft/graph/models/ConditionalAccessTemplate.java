package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new ConditionalAccessTemplate and sets the default values.
     */
    public ConditionalAccessTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessTemplate
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessTemplate();
    }
    /**
     * Gets the description property value. The user-friendly name of the template.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the details property value. The details property
     * @return a ConditionalAccessPolicyDetail
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessPolicyDetail getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(ConditionalAccessPolicyDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("scenarios", (n) -> { this.setScenarios(n.getEnumSetValue(TemplateScenarios.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The user-friendly name of the template.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the scenarios property value. The scenarios property
     * @return a EnumSet<TemplateScenarios>
     */
    @jakarta.annotation.Nullable
    public EnumSet<TemplateScenarios> getScenarios() {
        return this.backingStore.get("scenarios");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("details", this.getDetails());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumSetValue("scenarios", this.getScenarios());
    }
    /**
     * Sets the description property value. The user-friendly name of the template.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final ConditionalAccessPolicyDetail value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the name property value. The user-friendly name of the template.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the scenarios property value. The scenarios property
     * @param value Value to set for the scenarios property.
     */
    public void setScenarios(@jakarta.annotation.Nullable final EnumSet<TemplateScenarios> value) {
        this.backingStore.set("scenarios", value);
    }
}
