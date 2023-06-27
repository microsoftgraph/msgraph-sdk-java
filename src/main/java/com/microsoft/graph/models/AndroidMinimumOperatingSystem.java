package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the minimum operating system required for an Android mobile app.
 */
public class AndroidMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
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
     * When TRUE, only Version 4.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v40;
    /**
     * When TRUE, only Version 4.0.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v403;
    /**
     * When TRUE, only Version 4.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v41;
    /**
     * When TRUE, only Version 4.2 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v42;
    /**
     * When TRUE, only Version 4.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v43;
    /**
     * When TRUE, only Version 4.4 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v44;
    /**
     * When TRUE, only Version 5.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v50;
    /**
     * When TRUE, only Version 5.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v51;
    /**
     * When TRUE, only Version 6.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v60;
    /**
     * When TRUE, only Version 7.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v70;
    /**
     * When TRUE, only Version 7.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v71;
    /**
     * When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v80;
    /**
     * When TRUE, only Version 8.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v81;
    /**
     * When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     */
    private Boolean v90;
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
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("v10_0", (n) -> { this.setV100(n.getBooleanValue()); });
        deserializerMap.put("v11_0", (n) -> { this.setV110(n.getBooleanValue()); });
        deserializerMap.put("v4_0", (n) -> { this.setV40(n.getBooleanValue()); });
        deserializerMap.put("v4_0_3", (n) -> { this.setV403(n.getBooleanValue()); });
        deserializerMap.put("v4_1", (n) -> { this.setV41(n.getBooleanValue()); });
        deserializerMap.put("v4_2", (n) -> { this.setV42(n.getBooleanValue()); });
        deserializerMap.put("v4_3", (n) -> { this.setV43(n.getBooleanValue()); });
        deserializerMap.put("v4_4", (n) -> { this.setV44(n.getBooleanValue()); });
        deserializerMap.put("v5_0", (n) -> { this.setV50(n.getBooleanValue()); });
        deserializerMap.put("v5_1", (n) -> { this.setV51(n.getBooleanValue()); });
        deserializerMap.put("v6_0", (n) -> { this.setV60(n.getBooleanValue()); });
        deserializerMap.put("v7_0", (n) -> { this.setV70(n.getBooleanValue()); });
        deserializerMap.put("v7_1", (n) -> { this.setV71(n.getBooleanValue()); });
        deserializerMap.put("v8_0", (n) -> { this.setV80(n.getBooleanValue()); });
        deserializerMap.put("v8_1", (n) -> { this.setV81(n.getBooleanValue()); });
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
     * Gets the v4_0 property value. When TRUE, only Version 4.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV40() {
        return this.v40;
    }
    /**
     * Gets the v4_0_3 property value. When TRUE, only Version 4.0.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV403() {
        return this.v403;
    }
    /**
     * Gets the v4_1 property value. When TRUE, only Version 4.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV41() {
        return this.v41;
    }
    /**
     * Gets the v4_2 property value. When TRUE, only Version 4.2 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV42() {
        return this.v42;
    }
    /**
     * Gets the v4_3 property value. When TRUE, only Version 4.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV43() {
        return this.v43;
    }
    /**
     * Gets the v4_4 property value. When TRUE, only Version 4.4 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV44() {
        return this.v44;
    }
    /**
     * Gets the v5_0 property value. When TRUE, only Version 5.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV50() {
        return this.v50;
    }
    /**
     * Gets the v5_1 property value. When TRUE, only Version 5.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV51() {
        return this.v51;
    }
    /**
     * Gets the v6_0 property value. When TRUE, only Version 6.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV60() {
        return this.v60;
    }
    /**
     * Gets the v7_0 property value. When TRUE, only Version 7.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV70() {
        return this.v70;
    }
    /**
     * Gets the v7_1 property value. When TRUE, only Version 7.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV71() {
        return this.v71;
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
     * Gets the v8_1 property value. When TRUE, only Version 8.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV81() {
        return this.v81;
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
        writer.writeBooleanValue("v4_0", this.getV40());
        writer.writeBooleanValue("v4_0_3", this.getV403());
        writer.writeBooleanValue("v4_1", this.getV41());
        writer.writeBooleanValue("v4_2", this.getV42());
        writer.writeBooleanValue("v4_3", this.getV43());
        writer.writeBooleanValue("v4_4", this.getV44());
        writer.writeBooleanValue("v5_0", this.getV50());
        writer.writeBooleanValue("v5_1", this.getV51());
        writer.writeBooleanValue("v6_0", this.getV60());
        writer.writeBooleanValue("v7_0", this.getV70());
        writer.writeBooleanValue("v7_1", this.getV71());
        writer.writeBooleanValue("v8_0", this.getV80());
        writer.writeBooleanValue("v8_1", this.getV81());
        writer.writeBooleanValue("v9_0", this.getV90());
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
     * Sets the v10_0 property value. When TRUE, only Version 10.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v100 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV100(@javax.annotation.Nullable final Boolean value) {
        this.v100 = value;
    }
    /**
     * Sets the v11_0 property value. When TRUE, only Version 11.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v110 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV110(@javax.annotation.Nullable final Boolean value) {
        this.v110 = value;
    }
    /**
     * Sets the v4_0 property value. When TRUE, only Version 4.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v40 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV40(@javax.annotation.Nullable final Boolean value) {
        this.v40 = value;
    }
    /**
     * Sets the v4_0_3 property value. When TRUE, only Version 4.0.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v403 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV403(@javax.annotation.Nullable final Boolean value) {
        this.v403 = value;
    }
    /**
     * Sets the v4_1 property value. When TRUE, only Version 4.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v41 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV41(@javax.annotation.Nullable final Boolean value) {
        this.v41 = value;
    }
    /**
     * Sets the v4_2 property value. When TRUE, only Version 4.2 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v42 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV42(@javax.annotation.Nullable final Boolean value) {
        this.v42 = value;
    }
    /**
     * Sets the v4_3 property value. When TRUE, only Version 4.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v43 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV43(@javax.annotation.Nullable final Boolean value) {
        this.v43 = value;
    }
    /**
     * Sets the v4_4 property value. When TRUE, only Version 4.4 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v44 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV44(@javax.annotation.Nullable final Boolean value) {
        this.v44 = value;
    }
    /**
     * Sets the v5_0 property value. When TRUE, only Version 5.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v50 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV50(@javax.annotation.Nullable final Boolean value) {
        this.v50 = value;
    }
    /**
     * Sets the v5_1 property value. When TRUE, only Version 5.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v51 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV51(@javax.annotation.Nullable final Boolean value) {
        this.v51 = value;
    }
    /**
     * Sets the v6_0 property value. When TRUE, only Version 6.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v60 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV60(@javax.annotation.Nullable final Boolean value) {
        this.v60 = value;
    }
    /**
     * Sets the v7_0 property value. When TRUE, only Version 7.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v70 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV70(@javax.annotation.Nullable final Boolean value) {
        this.v70 = value;
    }
    /**
     * Sets the v7_1 property value. When TRUE, only Version 7.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v71 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV71(@javax.annotation.Nullable final Boolean value) {
        this.v71 = value;
    }
    /**
     * Sets the v8_0 property value. When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v80 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV80(@javax.annotation.Nullable final Boolean value) {
        this.v80 = value;
    }
    /**
     * Sets the v8_1 property value. When TRUE, only Version 8.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v81 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV81(@javax.annotation.Nullable final Boolean value) {
        this.v81 = value;
    }
    /**
     * Sets the v9_0 property value. When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v90 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setV90(@javax.annotation.Nullable final Boolean value) {
        this.v90 = value;
    }
}
