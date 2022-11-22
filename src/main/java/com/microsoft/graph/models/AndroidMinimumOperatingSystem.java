package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for the minimum operating system required for an Android mobile app. */
public class AndroidMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Version 10.0 or later. */
    private Boolean _v10_0;
    /** Version 11.0 or later. */
    private Boolean _v11_0;
    /** Version 4.0 or later. */
    private Boolean _v4_0;
    /** Version 4.0.3 or later. */
    private Boolean _v4_0_3;
    /** Version 4.1 or later. */
    private Boolean _v4_1;
    /** Version 4.2 or later. */
    private Boolean _v4_2;
    /** Version 4.3 or later. */
    private Boolean _v4_3;
    /** Version 4.4 or later. */
    private Boolean _v4_4;
    /** Version 5.0 or later. */
    private Boolean _v5_0;
    /** Version 5.1 or later. */
    private Boolean _v5_1;
    /** Version 6.0 or later. */
    private Boolean _v6_0;
    /** Version 7.0 or later. */
    private Boolean _v7_0;
    /** Version 7.1 or later. */
    private Boolean _v7_1;
    /** Version 8.0 or later. */
    private Boolean _v8_0;
    /** Version 8.1 or later. */
    private Boolean _v8_1;
    /** Version 9.0 or later. */
    private Boolean _v9_0;
    /**
     * Instantiates a new androidMinimumOperatingSystem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidMinimumOperatingSystem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidMinimumOperatingSystem
     */
    @javax.annotation.Nonnull
    public static AndroidMinimumOperatingSystem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidMinimumOperatingSystem();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(17);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("v10_0", (n) -> { this.setV10_0(n.getBooleanValue()); });
        deserializerMap.put("v11_0", (n) -> { this.setV11_0(n.getBooleanValue()); });
        deserializerMap.put("v4_0", (n) -> { this.setV4_0(n.getBooleanValue()); });
        deserializerMap.put("v4_0_3", (n) -> { this.setV4_0_3(n.getBooleanValue()); });
        deserializerMap.put("v4_1", (n) -> { this.setV4_1(n.getBooleanValue()); });
        deserializerMap.put("v4_2", (n) -> { this.setV4_2(n.getBooleanValue()); });
        deserializerMap.put("v4_3", (n) -> { this.setV4_3(n.getBooleanValue()); });
        deserializerMap.put("v4_4", (n) -> { this.setV4_4(n.getBooleanValue()); });
        deserializerMap.put("v5_0", (n) -> { this.setV5_0(n.getBooleanValue()); });
        deserializerMap.put("v5_1", (n) -> { this.setV5_1(n.getBooleanValue()); });
        deserializerMap.put("v6_0", (n) -> { this.setV6_0(n.getBooleanValue()); });
        deserializerMap.put("v7_0", (n) -> { this.setV7_0(n.getBooleanValue()); });
        deserializerMap.put("v7_1", (n) -> { this.setV7_1(n.getBooleanValue()); });
        deserializerMap.put("v8_0", (n) -> { this.setV8_0(n.getBooleanValue()); });
        deserializerMap.put("v8_1", (n) -> { this.setV8_1(n.getBooleanValue()); });
        deserializerMap.put("v9_0", (n) -> { this.setV9_0(n.getBooleanValue()); });
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
     * Gets the v10_0 property value. Version 10.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_0() {
        return this._v10_0;
    }
    /**
     * Gets the v11_0 property value. Version 11.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV11_0() {
        return this._v11_0;
    }
    /**
     * Gets the v4_0 property value. Version 4.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_0() {
        return this._v4_0;
    }
    /**
     * Gets the v4_0_3 property value. Version 4.0.3 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_0_3() {
        return this._v4_0_3;
    }
    /**
     * Gets the v4_1 property value. Version 4.1 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_1() {
        return this._v4_1;
    }
    /**
     * Gets the v4_2 property value. Version 4.2 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_2() {
        return this._v4_2;
    }
    /**
     * Gets the v4_3 property value. Version 4.3 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_3() {
        return this._v4_3;
    }
    /**
     * Gets the v4_4 property value. Version 4.4 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_4() {
        return this._v4_4;
    }
    /**
     * Gets the v5_0 property value. Version 5.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV5_0() {
        return this._v5_0;
    }
    /**
     * Gets the v5_1 property value. Version 5.1 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV5_1() {
        return this._v5_1;
    }
    /**
     * Gets the v6_0 property value. Version 6.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV6_0() {
        return this._v6_0;
    }
    /**
     * Gets the v7_0 property value. Version 7.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV7_0() {
        return this._v7_0;
    }
    /**
     * Gets the v7_1 property value. Version 7.1 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV7_1() {
        return this._v7_1;
    }
    /**
     * Gets the v8_0 property value. Version 8.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV8_0() {
        return this._v8_0;
    }
    /**
     * Gets the v8_1 property value. Version 8.1 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV8_1() {
        return this._v8_1;
    }
    /**
     * Gets the v9_0 property value. Version 9.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV9_0() {
        return this._v9_0;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("v10_0", this.getV10_0());
        writer.writeBooleanValue("v11_0", this.getV11_0());
        writer.writeBooleanValue("v4_0", this.getV4_0());
        writer.writeBooleanValue("v4_0_3", this.getV4_0_3());
        writer.writeBooleanValue("v4_1", this.getV4_1());
        writer.writeBooleanValue("v4_2", this.getV4_2());
        writer.writeBooleanValue("v4_3", this.getV4_3());
        writer.writeBooleanValue("v4_4", this.getV4_4());
        writer.writeBooleanValue("v5_0", this.getV5_0());
        writer.writeBooleanValue("v5_1", this.getV5_1());
        writer.writeBooleanValue("v6_0", this.getV6_0());
        writer.writeBooleanValue("v7_0", this.getV7_0());
        writer.writeBooleanValue("v7_1", this.getV7_1());
        writer.writeBooleanValue("v8_0", this.getV8_0());
        writer.writeBooleanValue("v8_1", this.getV8_1());
        writer.writeBooleanValue("v9_0", this.getV9_0());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the v10_0 property value. Version 10.0 or later.
     * @param value Value to set for the v10_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV10_0(@javax.annotation.Nullable final Boolean value) {
        this._v10_0 = value;
    }
    /**
     * Sets the v11_0 property value. Version 11.0 or later.
     * @param value Value to set for the v11_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV11_0(@javax.annotation.Nullable final Boolean value) {
        this._v11_0 = value;
    }
    /**
     * Sets the v4_0 property value. Version 4.0 or later.
     * @param value Value to set for the v4_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV4_0(@javax.annotation.Nullable final Boolean value) {
        this._v4_0 = value;
    }
    /**
     * Sets the v4_0_3 property value. Version 4.0.3 or later.
     * @param value Value to set for the v4_0_3 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV4_0_3(@javax.annotation.Nullable final Boolean value) {
        this._v4_0_3 = value;
    }
    /**
     * Sets the v4_1 property value. Version 4.1 or later.
     * @param value Value to set for the v4_1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV4_1(@javax.annotation.Nullable final Boolean value) {
        this._v4_1 = value;
    }
    /**
     * Sets the v4_2 property value. Version 4.2 or later.
     * @param value Value to set for the v4_2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV4_2(@javax.annotation.Nullable final Boolean value) {
        this._v4_2 = value;
    }
    /**
     * Sets the v4_3 property value. Version 4.3 or later.
     * @param value Value to set for the v4_3 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV4_3(@javax.annotation.Nullable final Boolean value) {
        this._v4_3 = value;
    }
    /**
     * Sets the v4_4 property value. Version 4.4 or later.
     * @param value Value to set for the v4_4 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV4_4(@javax.annotation.Nullable final Boolean value) {
        this._v4_4 = value;
    }
    /**
     * Sets the v5_0 property value. Version 5.0 or later.
     * @param value Value to set for the v5_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV5_0(@javax.annotation.Nullable final Boolean value) {
        this._v5_0 = value;
    }
    /**
     * Sets the v5_1 property value. Version 5.1 or later.
     * @param value Value to set for the v5_1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV5_1(@javax.annotation.Nullable final Boolean value) {
        this._v5_1 = value;
    }
    /**
     * Sets the v6_0 property value. Version 6.0 or later.
     * @param value Value to set for the v6_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV6_0(@javax.annotation.Nullable final Boolean value) {
        this._v6_0 = value;
    }
    /**
     * Sets the v7_0 property value. Version 7.0 or later.
     * @param value Value to set for the v7_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV7_0(@javax.annotation.Nullable final Boolean value) {
        this._v7_0 = value;
    }
    /**
     * Sets the v7_1 property value. Version 7.1 or later.
     * @param value Value to set for the v7_1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV7_1(@javax.annotation.Nullable final Boolean value) {
        this._v7_1 = value;
    }
    /**
     * Sets the v8_0 property value. Version 8.0 or later.
     * @param value Value to set for the v8_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV8_0(@javax.annotation.Nullable final Boolean value) {
        this._v8_0 = value;
    }
    /**
     * Sets the v8_1 property value. Version 8.1 or later.
     * @param value Value to set for the v8_1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV8_1(@javax.annotation.Nullable final Boolean value) {
        this._v8_1 = value;
    }
    /**
     * Sets the v9_0 property value. Version 9.0 or later.
     * @param value Value to set for the v9_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV9_0(@javax.annotation.Nullable final Boolean value) {
        this._v9_0 = value;
    }
}
