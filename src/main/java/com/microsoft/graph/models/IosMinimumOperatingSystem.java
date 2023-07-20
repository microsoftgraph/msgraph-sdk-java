package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties of the minimum operating system required for an iOS mobile app.
 */
public class IosMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * When TRUE, only Version 10.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v100;
    /**
     * When TRUE, only Version 11.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v110;
    /**
     * When TRUE, only Version 12.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v120;
    /**
     * When TRUE, only Version 13.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v130;
    /**
     * When TRUE, only Version 14.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v140;
    /**
     * When TRUE, only Version 15.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v150;
    /**
     * When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v80;
    /**
     * When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v90;
    /**
     * Instantiates a new iosMinimumOperatingSystem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosMinimumOperatingSystem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosMinimumOperatingSystem
     */
    @javax.annotation.Nonnull
    public static IosMinimumOperatingSystem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosMinimumOperatingSystem();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("v10_0", (n) -> { this.setV100(n.getBooleanValue()); });
        deserializerMap.put("v11_0", (n) -> { this.setV110(n.getBooleanValue()); });
        deserializerMap.put("v12_0", (n) -> { this.setV120(n.getBooleanValue()); });
        deserializerMap.put("v13_0", (n) -> { this.setV130(n.getBooleanValue()); });
        deserializerMap.put("v14_0", (n) -> { this.setV140(n.getBooleanValue()); });
        deserializerMap.put("v15_0", (n) -> { this.setV150(n.getBooleanValue()); });
        deserializerMap.put("v8_0", (n) -> { this.setV80(n.getBooleanValue()); });
        deserializerMap.put("v9_0", (n) -> { this.setV90(n.getBooleanValue()); });
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
     * Gets the v10_0 property value. When TRUE, only Version 10.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV100() {
        return this.v100;
    }
    /**
     * Gets the v11_0 property value. When TRUE, only Version 11.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV110() {
        return this.v110;
    }
    /**
     * Gets the v12_0 property value. When TRUE, only Version 12.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV120() {
        return this.v120;
    }
    /**
     * Gets the v13_0 property value. When TRUE, only Version 13.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV130() {
        return this.v130;
    }
    /**
     * Gets the v14_0 property value. When TRUE, only Version 14.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV140() {
        return this.v140;
    }
    /**
     * Gets the v15_0 property value. When TRUE, only Version 15.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV150() {
        return this.v150;
    }
    /**
     * Gets the v8_0 property value. When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV80() {
        return this.v80;
    }
    /**
     * Gets the v9_0 property value. When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV90() {
        return this.v90;
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
        writer.writeBooleanValue("v10_0", this.getV100());
        writer.writeBooleanValue("v11_0", this.getV110());
        writer.writeBooleanValue("v12_0", this.getV120());
        writer.writeBooleanValue("v13_0", this.getV130());
        writer.writeBooleanValue("v14_0", this.getV140());
        writer.writeBooleanValue("v15_0", this.getV150());
        writer.writeBooleanValue("v8_0", this.getV80());
        writer.writeBooleanValue("v9_0", this.getV90());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the v10_0 property value. When TRUE, only Version 10.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v10_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV100(@javax.annotation.Nullable final Boolean value) {
        this.v100 = value;
    }
    /**
     * Sets the v11_0 property value. When TRUE, only Version 11.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v11_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV110(@javax.annotation.Nullable final Boolean value) {
        this.v110 = value;
    }
    /**
     * Sets the v12_0 property value. When TRUE, only Version 12.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v12_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV120(@javax.annotation.Nullable final Boolean value) {
        this.v120 = value;
    }
    /**
     * Sets the v13_0 property value. When TRUE, only Version 13.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v13_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV130(@javax.annotation.Nullable final Boolean value) {
        this.v130 = value;
    }
    /**
     * Sets the v14_0 property value. When TRUE, only Version 14.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v14_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV140(@javax.annotation.Nullable final Boolean value) {
        this.v140 = value;
    }
    /**
     * Sets the v15_0 property value. When TRUE, only Version 15.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v15_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV150(@javax.annotation.Nullable final Boolean value) {
        this.v150 = value;
    }
    /**
     * Sets the v8_0 property value. When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v8_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV80(@javax.annotation.Nullable final Boolean value) {
        this.v80 = value;
    }
    /**
     * Sets the v9_0 property value. When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v9_0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV90(@javax.annotation.Nullable final Boolean value) {
        this.v90 = value;
    }
}
