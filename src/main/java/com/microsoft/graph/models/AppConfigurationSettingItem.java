package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for App configuration setting item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppConfigurationSettingItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * app configuration key.
     */
    private String appConfigKey;
    /**
     * App configuration key types.
     */
    private MdmAppConfigKeyType appConfigKeyType;
    /**
     * app configuration key value.
     */
    private String appConfigKeyValue;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new appConfigurationSettingItem and sets the default values.
     */
    public AppConfigurationSettingItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appConfigurationSettingItem
     */
    @jakarta.annotation.Nonnull
    public static AppConfigurationSettingItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConfigurationSettingItem();
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
     * Gets the appConfigKey property value. app configuration key.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppConfigKey() {
        return this.appConfigKey;
    }
    /**
     * Gets the appConfigKeyType property value. App configuration key types.
     * @return a mdmAppConfigKeyType
     */
    @jakarta.annotation.Nullable
    public MdmAppConfigKeyType getAppConfigKeyType() {
        return this.appConfigKeyType;
    }
    /**
     * Gets the appConfigKeyValue property value. app configuration key value.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppConfigKeyValue() {
        return this.appConfigKeyValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("appConfigKey", (n) -> { this.setAppConfigKey(n.getStringValue()); });
        deserializerMap.put("appConfigKeyType", (n) -> { this.setAppConfigKeyType(n.getEnumValue(MdmAppConfigKeyType.class)); });
        deserializerMap.put("appConfigKeyValue", (n) -> { this.setAppConfigKeyValue(n.getStringValue()); });
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
        writer.writeStringValue("appConfigKey", this.getAppConfigKey());
        writer.writeEnumValue("appConfigKeyType", this.getAppConfigKeyType());
        writer.writeStringValue("appConfigKeyValue", this.getAppConfigKeyValue());
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
     * Sets the appConfigKey property value. app configuration key.
     * @param value Value to set for the appConfigKey property.
     */
    public void setAppConfigKey(@jakarta.annotation.Nullable final String value) {
        this.appConfigKey = value;
    }
    /**
     * Sets the appConfigKeyType property value. App configuration key types.
     * @param value Value to set for the appConfigKeyType property.
     */
    public void setAppConfigKeyType(@jakarta.annotation.Nullable final MdmAppConfigKeyType value) {
        this.appConfigKeyType = value;
    }
    /**
     * Sets the appConfigKeyValue property value. app configuration key value.
     * @param value Value to set for the appConfigKeyValue property.
     */
    public void setAppConfigKeyValue(@jakarta.annotation.Nullable final String value) {
        this.appConfigKeyValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
