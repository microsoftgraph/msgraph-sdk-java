package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationBaseline extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConfigurationBaseline} and sets the default values.
     */
    public ConfigurationBaseline() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationBaseline}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationBaseline createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationBaseline();
    }
    /**
     * Gets the description property value. User-friendly description of the baseline given by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. User-friendly name given by the user to the baseline.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getCollectionOfObjectValues(BaselineParameter::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(BaselineResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the parameters property value. Collection of parameters attached to the baseline.
     * @return a {@link java.util.List<BaselineParameter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BaselineParameter> getParameters() {
        return this.backingStore.get("parameters");
    }
    /**
     * Gets the resources property value. Collection of resources and their properties that are added to the baseline. At least one property of one resource must be present in the baseline.
     * @return a {@link java.util.List<BaselineResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BaselineResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
    }
    /**
     * Sets the description property value. User-friendly description of the baseline given by the user.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. User-friendly name given by the user to the baseline.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the parameters property value. Collection of parameters attached to the baseline.
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final java.util.List<BaselineParameter> value) {
        this.backingStore.set("parameters", value);
    }
    /**
     * Sets the resources property value. Collection of resources and their properties that are added to the baseline. At least one property of one resource must be present in the baseline.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<BaselineResource> value) {
        this.backingStore.set("resources", value);
    }
}
