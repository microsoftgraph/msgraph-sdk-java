package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties of the possible iOS device types the mobile app can run on.
 */
public class IosDeviceType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether the app should run on iPads.
     */
    private Boolean iPad;
    /**
     * Whether the app should run on iPhones and iPods.
     */
    private Boolean iPhoneAndIPod;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new iosDeviceType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosDeviceType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosDeviceType
     */
    @javax.annotation.Nonnull
    public static IosDeviceType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosDeviceType();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("iPad", (n) -> { this.setIPad(n.getBooleanValue()); });
        deserializerMap.put("iPhoneAndIPod", (n) -> { this.setIPhoneAndIPod(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the iPad property value. Whether the app should run on iPads.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIPad() {
        return this.iPad;
    }
    /**
     * Gets the iPhoneAndIPod property value. Whether the app should run on iPhones and iPods.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIPhoneAndIPod() {
        return this.iPhoneAndIPod;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("iPad", this.getIPad());
        writer.writeBooleanValue("iPhoneAndIPod", this.getIPhoneAndIPod());
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
        this.additionalData = value;
    }
    /**
     * Sets the iPad property value. Whether the app should run on iPads.
     * @param value Value to set for the iPad property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIPad(@javax.annotation.Nullable final Boolean value) {
        this.iPad = value;
    }
    /**
     * Sets the iPhoneAndIPod property value. Whether the app should run on iPhones and iPods.
     * @param value Value to set for the iPhoneAndIPod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIPhoneAndIPod(@javax.annotation.Nullable final Boolean value) {
        this.iPhoneAndIPod = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
