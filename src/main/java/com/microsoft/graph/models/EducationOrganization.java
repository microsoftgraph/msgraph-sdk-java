package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationOrganization extends Entity implements Parsable {
    /**
     * Instantiates a new EducationOrganization and sets the default values.
     */
    public EducationOrganization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationOrganization
     */
    @jakarta.annotation.Nonnull
    public static EducationOrganization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.educationSchool": return new EducationSchool();
            }
        }
        return new EducationOrganization();
    }
    /**
     * Gets the description property value. Organization description.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Organization display name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalSource property value. Source where this organization was created from. Possible values are: sis, manual.
     * @return a EducationExternalSource
     */
    @jakarta.annotation.Nullable
    public EducationExternalSource getExternalSource() {
        return this.backingStore.get("externalSource");
    }
    /**
     * Gets the externalSourceDetail property value. The name of the external source this resource was generated from.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalSourceDetail() {
        return this.backingStore.get("externalSourceDetail");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalSource", (n) -> { this.setExternalSource(n.getEnumValue(EducationExternalSource.class)); });
        deserializerMap.put("externalSourceDetail", (n) -> { this.setExternalSourceDetail(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeEnumValue("externalSource", this.getExternalSource());
        writer.writeStringValue("externalSourceDetail", this.getExternalSourceDetail());
    }
    /**
     * Sets the description property value. Organization description.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Organization display name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalSource property value. Source where this organization was created from. Possible values are: sis, manual.
     * @param value Value to set for the externalSource property.
     */
    public void setExternalSource(@jakarta.annotation.Nullable final EducationExternalSource value) {
        this.backingStore.set("externalSource", value);
    }
    /**
     * Sets the externalSourceDetail property value. The name of the external source this resource was generated from.
     * @param value Value to set for the externalSourceDetail property.
     */
    public void setExternalSourceDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalSourceDetail", value);
    }
}
