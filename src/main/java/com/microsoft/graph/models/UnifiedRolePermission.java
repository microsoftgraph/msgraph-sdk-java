package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRolePermission implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Set of tasks that can be performed on a resource. Required.
     */
    private java.util.List<String> allowedResourceActions;
    /**
     * Optional constraints that must be met for the permission to be effective. Not supported for custom roles.
     */
    private String condition;
    /**
     * Set of tasks that may not be performed on a resource. Not yet supported.
     */
    private java.util.List<String> excludedResourceActions;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new unifiedRolePermission and sets the default values.
     */
    public UnifiedRolePermission() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRolePermission
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRolePermission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRolePermission();
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
     * Gets the allowedResourceActions property value. Set of tasks that can be performed on a resource. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedResourceActions() {
        return this.allowedResourceActions;
    }
    /**
     * Gets the condition property value. Optional constraints that must be met for the permission to be effective. Not supported for custom roles.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCondition() {
        return this.condition;
    }
    /**
     * Gets the excludedResourceActions property value. Set of tasks that may not be performed on a resource. Not yet supported.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludedResourceActions() {
        return this.excludedResourceActions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
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
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedResourceActions", this.getAllowedResourceActions());
        writer.writeStringValue("condition", this.getCondition());
        writer.writeCollectionOfPrimitiveValues("excludedResourceActions", this.getExcludedResourceActions());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the allowedResourceActions property value. Set of tasks that can be performed on a resource. Required.
     * @param value Value to set for the allowedResourceActions property.
     */
    public void setAllowedResourceActions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedResourceActions = value;
    }
    /**
     * Sets the condition property value. Optional constraints that must be met for the permission to be effective. Not supported for custom roles.
     * @param value Value to set for the condition property.
     */
    public void setCondition(@jakarta.annotation.Nullable final String value) {
        this.condition = value;
    }
    /**
     * Sets the excludedResourceActions property value. Set of tasks that may not be performed on a resource. Not yet supported.
     * @param value Value to set for the excludedResourceActions property.
     */
    public void setExcludedResourceActions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludedResourceActions = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
