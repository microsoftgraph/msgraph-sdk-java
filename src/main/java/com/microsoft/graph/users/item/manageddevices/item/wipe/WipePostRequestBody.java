package com.microsoft.graph.users.item.manageddevices.item.wipe;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WipePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The keepEnrollmentData property
     */
    private Boolean keepEnrollmentData;
    /**
     * The keepUserData property
     */
    private Boolean keepUserData;
    /**
     * The macOsUnlockCode property
     */
    private String macOsUnlockCode;
    /**
     * The persistEsimDataPlan property
     */
    private Boolean persistEsimDataPlan;
    /**
     * Instantiates a new wipePostRequestBody and sets the default values.
     */
    public WipePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a wipePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WipePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WipePostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("keepEnrollmentData", (n) -> { this.setKeepEnrollmentData(n.getBooleanValue()); });
        deserializerMap.put("keepUserData", (n) -> { this.setKeepUserData(n.getBooleanValue()); });
        deserializerMap.put("macOsUnlockCode", (n) -> { this.setMacOsUnlockCode(n.getStringValue()); });
        deserializerMap.put("persistEsimDataPlan", (n) -> { this.setPersistEsimDataPlan(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keepEnrollmentData property value. The keepEnrollmentData property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeepEnrollmentData() {
        return this.keepEnrollmentData;
    }
    /**
     * Gets the keepUserData property value. The keepUserData property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeepUserData() {
        return this.keepUserData;
    }
    /**
     * Gets the macOsUnlockCode property value. The macOsUnlockCode property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMacOsUnlockCode() {
        return this.macOsUnlockCode;
    }
    /**
     * Gets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPersistEsimDataPlan() {
        return this.persistEsimDataPlan;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("keepEnrollmentData", this.getKeepEnrollmentData());
        writer.writeBooleanValue("keepUserData", this.getKeepUserData());
        writer.writeStringValue("macOsUnlockCode", this.getMacOsUnlockCode());
        writer.writeBooleanValue("persistEsimDataPlan", this.getPersistEsimDataPlan());
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
     * Sets the keepEnrollmentData property value. The keepEnrollmentData property
     * @param value Value to set for the keepEnrollmentData property.
     */
    public void setKeepEnrollmentData(@jakarta.annotation.Nullable final Boolean value) {
        this.keepEnrollmentData = value;
    }
    /**
     * Sets the keepUserData property value. The keepUserData property
     * @param value Value to set for the keepUserData property.
     */
    public void setKeepUserData(@jakarta.annotation.Nullable final Boolean value) {
        this.keepUserData = value;
    }
    /**
     * Sets the macOsUnlockCode property value. The macOsUnlockCode property
     * @param value Value to set for the macOsUnlockCode property.
     */
    public void setMacOsUnlockCode(@jakarta.annotation.Nullable final String value) {
        this.macOsUnlockCode = value;
    }
    /**
     * Sets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @param value Value to set for the persistEsimDataPlan property.
     */
    public void setPersistEsimDataPlan(@jakarta.annotation.Nullable final Boolean value) {
        this.persistEsimDataPlan = value;
    }
}
