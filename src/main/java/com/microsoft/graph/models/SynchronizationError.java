package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationError implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The error code. For example, AzureDirectoryB2BManagementPolicyCheckFailure.
     */
    private String code;
    /**
     * The error message. For example, Policy permitting auto-redemption of invitations not configured.
     */
    private String message;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The action to take to resolve the error. For example, false.
     */
    private Boolean tenantActionable;
    /**
     * Instantiates a new synchronizationError and sets the default values.
     */
    public SynchronizationError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationError
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationError();
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
     * Gets the code property value. The error code. For example, AzureDirectoryB2BManagementPolicyCheckFailure.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantActionable", (n) -> { this.setTenantActionable(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The error message. For example, Policy permitting auto-redemption of invitations not configured.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
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
     * Gets the tenantActionable property value. The action to take to resolve the error. For example, false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTenantActionable() {
        return this.tenantActionable;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("tenantActionable", this.getTenantActionable());
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
     * Sets the code property value. The error code. For example, AzureDirectoryB2BManagementPolicyCheckFailure.
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the message property value. The error message. For example, Policy permitting auto-redemption of invitations not configured.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the tenantActionable property value. The action to take to resolve the error. For example, false.
     * @param value Value to set for the tenantActionable property.
     */
    public void setTenantActionable(@jakarta.annotation.Nullable final Boolean value) {
        this.tenantActionable = value;
    }
}
