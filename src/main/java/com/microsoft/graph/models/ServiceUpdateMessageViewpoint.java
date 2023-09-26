package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUpdateMessageViewpoint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether the user archived the message.
     */
    private Boolean isArchived;
    /**
     * Indicates whether the user marked the message as favorite.
     */
    private Boolean isFavorited;
    /**
     * Indicates whether the user read the message.
     */
    private Boolean isRead;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new ServiceUpdateMessageViewpoint and sets the default values.
     */
    public ServiceUpdateMessageViewpoint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUpdateMessageViewpoint
     */
    @jakarta.annotation.Nonnull
    public static ServiceUpdateMessageViewpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateMessageViewpoint();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("isFavorited", (n) -> { this.setIsFavorited(n.getBooleanValue()); });
        deserializerMap.put("isRead", (n) -> { this.setIsRead(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isArchived property value. Indicates whether the user archived the message.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.isArchived;
    }
    /**
     * Gets the isFavorited property value. Indicates whether the user marked the message as favorite.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFavorited() {
        return this.isFavorited;
    }
    /**
     * Gets the isRead property value. Indicates whether the user read the message.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRead() {
        return this.isRead;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
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
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeBooleanValue("isFavorited", this.getIsFavorited());
        writer.writeBooleanValue("isRead", this.getIsRead());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isArchived property value. Indicates whether the user archived the message.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.isArchived = value;
    }
    /**
     * Sets the isFavorited property value. Indicates whether the user marked the message as favorite.
     * @param value Value to set for the isFavorited property.
     */
    public void setIsFavorited(@jakarta.annotation.Nullable final Boolean value) {
        this.isFavorited = value;
    }
    /**
     * Sets the isRead property value. Indicates whether the user read the message.
     * @param value Value to set for the isRead property.
     */
    public void setIsRead(@jakarta.annotation.Nullable final Boolean value) {
        this.isRead = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
