package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The minimum operating system required for a macOS app.
 */
public class MacOSMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * When TRUE, indicates OS X 10.10 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v1010;
    /**
     * When TRUE, indicates OS X 10.11 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v1011;
    /**
     * When TRUE, indicates macOS 10.12 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v1012;
    /**
     * When TRUE, indicates macOS 10.13 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v1013;
    /**
     * When TRUE, indicates macOS 10.14 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v1014;
    /**
     * When TRUE, indicates macOS 10.15 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v1015;
    /**
     * When TRUE, indicates Mac OS X 10.7 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v107;
    /**
     * When TRUE, indicates OS X 10.8 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v108;
    /**
     * When TRUE, indicates OS X 10.9 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v109;
    /**
     * When TRUE, indicates macOS 11.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v110;
    /**
     * When TRUE, indicates macOS 12.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v120;
    /**
     * When TRUE, indicates macOS 13.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    private Boolean v130;
    /**
     * Instantiates a new macOSMinimumOperatingSystem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSMinimumOperatingSystem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSMinimumOperatingSystem
     */
    @javax.annotation.Nonnull
    public static MacOSMinimumOperatingSystem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSMinimumOperatingSystem();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("v10_10", (n) -> { this.setV1010(n.getBooleanValue()); });
        deserializerMap.put("v10_11", (n) -> { this.setV1011(n.getBooleanValue()); });
        deserializerMap.put("v10_12", (n) -> { this.setV1012(n.getBooleanValue()); });
        deserializerMap.put("v10_13", (n) -> { this.setV1013(n.getBooleanValue()); });
        deserializerMap.put("v10_14", (n) -> { this.setV1014(n.getBooleanValue()); });
        deserializerMap.put("v10_15", (n) -> { this.setV1015(n.getBooleanValue()); });
        deserializerMap.put("v10_7", (n) -> { this.setV107(n.getBooleanValue()); });
        deserializerMap.put("v10_8", (n) -> { this.setV108(n.getBooleanValue()); });
        deserializerMap.put("v10_9", (n) -> { this.setV109(n.getBooleanValue()); });
        deserializerMap.put("v11_0", (n) -> { this.setV110(n.getBooleanValue()); });
        deserializerMap.put("v12_0", (n) -> { this.setV120(n.getBooleanValue()); });
        deserializerMap.put("v13_0", (n) -> { this.setV130(n.getBooleanValue()); });
        return deserializerMap;
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
     * Gets the v10_10 property value. When TRUE, indicates OS X 10.10 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV1010() {
        return this.v1010;
    }
    /**
     * Gets the v10_11 property value. When TRUE, indicates OS X 10.11 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV1011() {
        return this.v1011;
    }
    /**
     * Gets the v10_12 property value. When TRUE, indicates macOS 10.12 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV1012() {
        return this.v1012;
    }
    /**
     * Gets the v10_13 property value. When TRUE, indicates macOS 10.13 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV1013() {
        return this.v1013;
    }
    /**
     * Gets the v10_14 property value. When TRUE, indicates macOS 10.14 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV1014() {
        return this.v1014;
    }
    /**
     * Gets the v10_15 property value. When TRUE, indicates macOS 10.15 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV1015() {
        return this.v1015;
    }
    /**
     * Gets the v10_7 property value. When TRUE, indicates Mac OS X 10.7 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV107() {
        return this.v107;
    }
    /**
     * Gets the v10_8 property value. When TRUE, indicates OS X 10.8 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV108() {
        return this.v108;
    }
    /**
     * Gets the v10_9 property value. When TRUE, indicates OS X 10.9 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV109() {
        return this.v109;
    }
    /**
     * Gets the v11_0 property value. When TRUE, indicates macOS 11.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV110() {
        return this.v110;
    }
    /**
     * Gets the v12_0 property value. When TRUE, indicates macOS 12.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV120() {
        return this.v120;
    }
    /**
     * Gets the v13_0 property value. When TRUE, indicates macOS 13.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV130() {
        return this.v130;
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
        writer.writeBooleanValue("v10_10", this.getV1010());
        writer.writeBooleanValue("v10_11", this.getV1011());
        writer.writeBooleanValue("v10_12", this.getV1012());
        writer.writeBooleanValue("v10_13", this.getV1013());
        writer.writeBooleanValue("v10_14", this.getV1014());
        writer.writeBooleanValue("v10_15", this.getV1015());
        writer.writeBooleanValue("v10_7", this.getV107());
        writer.writeBooleanValue("v10_8", this.getV108());
        writer.writeBooleanValue("v10_9", this.getV109());
        writer.writeBooleanValue("v11_0", this.getV110());
        writer.writeBooleanValue("v12_0", this.getV120());
        writer.writeBooleanValue("v13_0", this.getV130());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the v10_10 property value. When TRUE, indicates OS X 10.10 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v1010 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV1010(@javax.annotation.Nullable final Boolean value) {
        this.v1010 = value;
    }
    /**
     * Sets the v10_11 property value. When TRUE, indicates OS X 10.11 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v1011 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV1011(@javax.annotation.Nullable final Boolean value) {
        this.v1011 = value;
    }
    /**
     * Sets the v10_12 property value. When TRUE, indicates macOS 10.12 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v1012 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV1012(@javax.annotation.Nullable final Boolean value) {
        this.v1012 = value;
    }
    /**
     * Sets the v10_13 property value. When TRUE, indicates macOS 10.13 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v1013 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV1013(@javax.annotation.Nullable final Boolean value) {
        this.v1013 = value;
    }
    /**
     * Sets the v10_14 property value. When TRUE, indicates macOS 10.14 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v1014 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV1014(@javax.annotation.Nullable final Boolean value) {
        this.v1014 = value;
    }
    /**
     * Sets the v10_15 property value. When TRUE, indicates macOS 10.15 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v1015 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV1015(@javax.annotation.Nullable final Boolean value) {
        this.v1015 = value;
    }
    /**
     * Sets the v10_7 property value. When TRUE, indicates Mac OS X 10.7 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v107 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV107(@javax.annotation.Nullable final Boolean value) {
        this.v107 = value;
    }
    /**
     * Sets the v10_8 property value. When TRUE, indicates OS X 10.8 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v108 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV108(@javax.annotation.Nullable final Boolean value) {
        this.v108 = value;
    }
    /**
     * Sets the v10_9 property value. When TRUE, indicates OS X 10.9 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v109 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV109(@javax.annotation.Nullable final Boolean value) {
        this.v109 = value;
    }
    /**
     * Sets the v11_0 property value. When TRUE, indicates macOS 11.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v110 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV110(@javax.annotation.Nullable final Boolean value) {
        this.v110 = value;
    }
    /**
     * Sets the v12_0 property value. When TRUE, indicates macOS 12.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v120 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV120(@javax.annotation.Nullable final Boolean value) {
        this.v120 = value;
    }
    /**
     * Sets the v13_0 property value. When TRUE, indicates macOS 13.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v130 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV130(@javax.annotation.Nullable final Boolean value) {
        this.v130 = value;
    }
}
