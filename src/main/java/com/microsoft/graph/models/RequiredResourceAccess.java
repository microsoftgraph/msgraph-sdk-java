package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RequiredResourceAccess implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     */
    private java.util.List<ResourceAccess> resourceAccess;
    /**
     * The unique identifier for the resource that the application requires access to. This should be equal to the appId declared on the target resource application.
     */
    private String resourceAppId;
    /**
     * Instantiates a new requiredResourceAccess and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public RequiredResourceAccess() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a requiredResourceAccess
     */
    @jakarta.annotation.Nonnull
    public static RequiredResourceAccess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequiredResourceAccess();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceAccess", (n) -> { this.setResourceAccess(n.getCollectionOfObjectValues(ResourceAccess::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceAppId", (n) -> { this.setResourceAppId(n.getStringValue()); });
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
     * Gets the resourceAccess property value. The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     * @return a resourceAccess
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceAccess> getResourceAccess() {
        return this.resourceAccess;
    }
    /**
     * Gets the resourceAppId property value. The unique identifier for the resource that the application requires access to. This should be equal to the appId declared on the target resource application.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourceAppId() {
        return this.resourceAppId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("resourceAccess", this.getResourceAccess());
        writer.writeStringValue("resourceAppId", this.getResourceAppId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the resourceAccess property value. The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     * @param value Value to set for the resourceAccess property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResourceAccess(@jakarta.annotation.Nullable final java.util.List<ResourceAccess> value) {
        this.resourceAccess = value;
    }
    /**
     * Sets the resourceAppId property value. The unique identifier for the resource that the application requires access to. This should be equal to the appId declared on the target resource application.
     * @param value Value to set for the resourceAppId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResourceAppId(@jakarta.annotation.Nullable final String value) {
        this.resourceAppId = value;
    }
}
