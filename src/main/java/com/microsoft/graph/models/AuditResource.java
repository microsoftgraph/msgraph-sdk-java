package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties for Audit Resource.
 */
public class AuditResource implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Audit resource's type.
     */
    private String auditResourceType;
    /**
     * Display name.
     */
    private String displayName;
    /**
     * List of modified properties.
     */
    private java.util.List<AuditProperty> modifiedProperties;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Audit resource's Id.
     */
    private String resourceId;
    /**
     * Instantiates a new auditResource and sets the default values.
     */
    public AuditResource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a auditResource
     */
    @jakarta.annotation.Nonnull
    public static AuditResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditResource();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the auditResourceType property value. Audit resource's type.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAuditResourceType() {
        return this.auditResourceType;
    }
    /**
     * Gets the displayName property value. Display name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("auditResourceType", (n) -> { this.setAuditResourceType(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("modifiedProperties", (n) -> { this.setModifiedProperties(n.getCollectionOfObjectValues(AuditProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedProperties property value. List of modified properties.
     * @return a auditProperty
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditProperty> getModifiedProperties() {
        return this.modifiedProperties;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the resourceId property value. Audit resource's Id.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("auditResourceType", this.getAuditResourceType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("modifiedProperties", this.getModifiedProperties());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the auditResourceType property value. Audit resource's type.
     * @param value Value to set for the auditResourceType property.
     */
    public void setAuditResourceType(@jakarta.annotation.Nullable final String value) {
        this.auditResourceType = value;
    }
    /**
     * Sets the displayName property value. Display name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the modifiedProperties property value. List of modified properties.
     * @param value Value to set for the modifiedProperties property.
     */
    public void setModifiedProperties(@jakarta.annotation.Nullable final java.util.List<AuditProperty> value) {
        this.modifiedProperties = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the resourceId property value. Audit resource's Id.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.resourceId = value;
    }
}
