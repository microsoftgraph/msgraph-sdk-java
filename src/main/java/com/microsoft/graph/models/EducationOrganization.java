package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationOrganization extends Entity implements Parsable {
    /**
     * Organization description.
     */
    private String description;
    /**
     * Organization display name.
     */
    private String displayName;
    /**
     * Source where this organization was created from. Possible values are: sis, manual.
     */
    private EducationExternalSource externalSource;
    /**
     * The name of the external source this resources was generated from.
     */
    private String externalSourceDetail;
    /**
     * Instantiates a new educationOrganization and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationOrganization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationOrganization
     */
    @javax.annotation.Nonnull
    public static EducationOrganization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Organization display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalSource property value. Source where this organization was created from. Possible values are: sis, manual.
     * @return a educationExternalSource
     */
    @javax.annotation.Nullable
    public EducationExternalSource getExternalSource() {
        return this.externalSource;
    }
    /**
     * Gets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalSourceDetail() {
        return this.externalSourceDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Organization display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalSource property value. Source where this organization was created from. Possible values are: sis, manual.
     * @param value Value to set for the externalSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalSource(@javax.annotation.Nullable final EducationExternalSource value) {
        this.externalSource = value;
    }
    /**
     * Sets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @param value Value to set for the externalSourceDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalSourceDetail(@javax.annotation.Nullable final String value) {
        this.externalSourceDetail = value;
    }
}
