package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A class containing the properties for Audit Resource. */
public class AuditResource implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Audit resource's type. */
    private String _auditResourceType;
    /** Display name. */
    private String _displayName;
    /** List of modified properties. */
    private java.util.List<AuditProperty> _modifiedProperties;
    /** The OdataType property */
    private String _odataType;
    /** Audit resource's Id. */
    private String _resourceId;
    /**
     * Instantiates a new auditResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuditResource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a auditResource
     */
    @javax.annotation.Nonnull
    public static AuditResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditResource();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the auditResourceType property value. Audit resource's type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuditResourceType() {
        return this._auditResourceType;
    }
    /**
     * Gets the displayName property value. Display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuditResource currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("auditResourceType", (n) -> { currentObject.setAuditResourceType(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("modifiedProperties", (n) -> { currentObject.setModifiedProperties(n.getCollectionOfObjectValues(AuditProperty::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the modifiedProperties property value. List of modified properties.
     * @return a auditProperty
     */
    @javax.annotation.Nullable
    public java.util.List<AuditProperty> getModifiedProperties() {
        return this._modifiedProperties;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the resourceId property value. Audit resource's Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the auditResourceType property value. Audit resource's type.
     * @param value Value to set for the auditResourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuditResourceType(@javax.annotation.Nullable final String value) {
        this._auditResourceType = value;
    }
    /**
     * Sets the displayName property value. Display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the modifiedProperties property value. List of modified properties.
     * @param value Value to set for the modifiedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedProperties(@javax.annotation.Nullable final java.util.List<AuditProperty> value) {
        this._modifiedProperties = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the resourceId property value. Audit resource's Id.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
}
