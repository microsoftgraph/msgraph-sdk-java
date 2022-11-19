package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for App configuration setting item. */
public class AppConfigurationSettingItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** app configuration key. */
    private String _appConfigKey;
    /** App configuration key types. */
    private MdmAppConfigKeyType _appConfigKeyType;
    /** app configuration key value. */
    private String _appConfigKeyValue;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new appConfigurationSettingItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppConfigurationSettingItem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.appConfigurationSettingItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appConfigurationSettingItem
     */
    @javax.annotation.Nonnull
    public static AppConfigurationSettingItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConfigurationSettingItem();
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
     * Gets the appConfigKey property value. app configuration key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppConfigKey() {
        return this._appConfigKey;
    }
    /**
     * Gets the appConfigKeyType property value. App configuration key types.
     * @return a mdmAppConfigKeyType
     */
    @javax.annotation.Nullable
    public MdmAppConfigKeyType getAppConfigKeyType() {
        return this._appConfigKeyType;
    }
    /**
     * Gets the appConfigKeyValue property value. app configuration key value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppConfigKeyValue() {
        return this._appConfigKeyValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppConfigurationSettingItem currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("appConfigKey", (n) -> { currentObject.setAppConfigKey(n.getStringValue()); });
        deserializerMap.put("appConfigKeyType", (n) -> { currentObject.setAppConfigKeyType(n.getEnumValue(MdmAppConfigKeyType.class)); });
        deserializerMap.put("appConfigKeyValue", (n) -> { currentObject.setAppConfigKeyValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
        writer.writeStringValue("appConfigKey", this.getAppConfigKey());
        writer.writeEnumValue("appConfigKeyType", this.getAppConfigKeyType());
        writer.writeStringValue("appConfigKeyValue", this.getAppConfigKeyValue());
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
     * Sets the appConfigKey property value. app configuration key.
     * @param value Value to set for the appConfigKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppConfigKey(@javax.annotation.Nullable final String value) {
        this._appConfigKey = value;
    }
    /**
     * Sets the appConfigKeyType property value. App configuration key types.
     * @param value Value to set for the appConfigKeyType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppConfigKeyType(@javax.annotation.Nullable final MdmAppConfigKeyType value) {
        this._appConfigKeyType = value;
    }
    /**
     * Sets the appConfigKeyValue property value. app configuration key value.
     * @param value Value to set for the appConfigKeyValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppConfigKeyValue(@javax.annotation.Nullable final String value) {
        this._appConfigKeyValue = value;
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
