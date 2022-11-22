package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRolePermission implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Set of tasks that can be performed on a resource. Required. */
    private java.util.List<String> _allowedResourceActions;
    /** Optional constraints that must be met for the permission to be effective. */
    private String _condition;
    /** Set of tasks that may not be performed on a resource. Not yet supported. */
    private java.util.List<String> _excludedResourceActions;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new unifiedRolePermission and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRolePermission() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRolePermission
     */
    @javax.annotation.Nonnull
    public static UnifiedRolePermission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRolePermission();
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
     * Gets the allowedResourceActions property value. Set of tasks that can be performed on a resource. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedResourceActions() {
        return this._allowedResourceActions;
    }
    /**
     * Gets the condition property value. Optional constraints that must be met for the permission to be effective.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCondition() {
        return this._condition;
    }
    /**
     * Gets the excludedResourceActions property value. Set of tasks that may not be performed on a resource. Not yet supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludedResourceActions() {
        return this._excludedResourceActions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("allowedResourceActions", (n) -> { this.setAllowedResourceActions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("condition", (n) -> { this.setCondition(n.getStringValue()); });
        deserializerMap.put("excludedResourceActions", (n) -> { this.setExcludedResourceActions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedResourceActions", this.getAllowedResourceActions());
        writer.writeStringValue("condition", this.getCondition());
        writer.writeCollectionOfPrimitiveValues("excludedResourceActions", this.getExcludedResourceActions());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the allowedResourceActions property value. Set of tasks that can be performed on a resource. Required.
     * @param value Value to set for the allowedResourceActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedResourceActions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedResourceActions = value;
    }
    /**
     * Sets the condition property value. Optional constraints that must be met for the permission to be effective.
     * @param value Value to set for the condition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCondition(@javax.annotation.Nullable final String value) {
        this._condition = value;
    }
    /**
     * Sets the excludedResourceActions property value. Set of tasks that may not be performed on a resource. Not yet supported.
     * @param value Value to set for the excludedResourceActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedResourceActions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludedResourceActions = value;
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
}
