package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PreAuthorizedApplication implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier for the application.
     */
    private String appId;
    /**
     * The unique identifier for the oauth2PermissionScopes the application requires.
     */
    private java.util.List<String> delegatedPermissionIds;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new preAuthorizedApplication and sets the default values.
     */
    public PreAuthorizedApplication() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a preAuthorizedApplication
     */
    @jakarta.annotation.Nonnull
    public static PreAuthorizedApplication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PreAuthorizedApplication();
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
     * Gets the appId property value. The unique identifier for the application.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the delegatedPermissionIds property value. The unique identifier for the oauth2PermissionScopes the application requires.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDelegatedPermissionIds() {
        return this.delegatedPermissionIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("delegatedPermissionIds", (n) -> { this.setDelegatedPermissionIds(n.getCollectionOfPrimitiveValues(String.class)); });
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
        writer.writeStringValue("appId", this.getAppId());
        writer.writeCollectionOfPrimitiveValues("delegatedPermissionIds", this.getDelegatedPermissionIds());
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
     * Sets the appId property value. The unique identifier for the application.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the delegatedPermissionIds property value. The unique identifier for the oauth2PermissionScopes the application requires.
     * @param value Value to set for the delegatedPermissionIds property.
     */
    public void setDelegatedPermissionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.delegatedPermissionIds = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
