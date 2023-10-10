package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamGuestSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If set to true, guests can add and update channels.
     */
    private Boolean allowCreateUpdateChannels;
    /**
     * If set to true, guests can delete channels.
     */
    private Boolean allowDeleteChannels;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new TeamGuestSettings and sets the default values.
     */
    public TeamGuestSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamGuestSettings
     */
    @jakarta.annotation.Nonnull
    public static TeamGuestSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamGuestSettings();
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
     * Gets the allowCreateUpdateChannels property value. If set to true, guests can add and update channels.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCreateUpdateChannels() {
        return this.allowCreateUpdateChannels;
    }
    /**
     * Gets the allowDeleteChannels property value. If set to true, guests can delete channels.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeleteChannels() {
        return this.allowDeleteChannels;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("allowCreateUpdateChannels", (n) -> { this.setAllowCreateUpdateChannels(n.getBooleanValue()); });
        deserializerMap.put("allowDeleteChannels", (n) -> { this.setAllowDeleteChannels(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeBooleanValue("allowCreateUpdateChannels", this.getAllowCreateUpdateChannels());
        writer.writeBooleanValue("allowDeleteChannels", this.getAllowDeleteChannels());
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
     * Sets the allowCreateUpdateChannels property value. If set to true, guests can add and update channels.
     * @param value Value to set for the allowCreateUpdateChannels property.
     */
    public void setAllowCreateUpdateChannels(@jakarta.annotation.Nullable final Boolean value) {
        this.allowCreateUpdateChannels = value;
    }
    /**
     * Sets the allowDeleteChannels property value. If set to true, guests can delete channels.
     * @param value Value to set for the allowDeleteChannels property.
     */
    public void setAllowDeleteChannels(@jakarta.annotation.Nullable final Boolean value) {
        this.allowDeleteChannels = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
