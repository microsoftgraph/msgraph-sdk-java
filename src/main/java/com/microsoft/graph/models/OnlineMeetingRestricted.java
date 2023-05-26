package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnlineMeetingRestricted implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Specifies the reason shared content from this participant is disabled. Possible values are: watermarkProtection, unknownFutureValue. */
    private OnlineMeetingContentSharingDisabledReason contentSharingDisabled;
    /** The OdataType property */
    private String odataType;
    /** Specifies the reason video from this participant is disabled. Possible values are: watermarkProtection, unknownFutureValue. */
    private OnlineMeetingVideoDisabledReason videoDisabled;
    /**
     * Instantiates a new onlineMeetingRestricted and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnlineMeetingRestricted() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onlineMeetingRestricted
     */
    @javax.annotation.Nonnull
    public static OnlineMeetingRestricted createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnlineMeetingRestricted();
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
     * Gets the contentSharingDisabled property value. Specifies the reason shared content from this participant is disabled. Possible values are: watermarkProtection, unknownFutureValue.
     * @return a onlineMeetingContentSharingDisabledReason
     */
    @javax.annotation.Nullable
    public OnlineMeetingContentSharingDisabledReason getContentSharingDisabled() {
        return this.contentSharingDisabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("contentSharingDisabled", (n) -> { this.setContentSharingDisabled(n.getEnumValue(OnlineMeetingContentSharingDisabledReason.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("videoDisabled", (n) -> { this.setVideoDisabled(n.getEnumValue(OnlineMeetingVideoDisabledReason.class)); });
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
     * Gets the videoDisabled property value. Specifies the reason video from this participant is disabled. Possible values are: watermarkProtection, unknownFutureValue.
     * @return a onlineMeetingVideoDisabledReason
     */
    @javax.annotation.Nullable
    public OnlineMeetingVideoDisabledReason getVideoDisabled() {
        return this.videoDisabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("contentSharingDisabled", this.getContentSharingDisabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("videoDisabled", this.getVideoDisabled());
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
     * Sets the contentSharingDisabled property value. Specifies the reason shared content from this participant is disabled. Possible values are: watermarkProtection, unknownFutureValue.
     * @param value Value to set for the contentSharingDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentSharingDisabled(@javax.annotation.Nullable final OnlineMeetingContentSharingDisabledReason value) {
        this.contentSharingDisabled = value;
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
     * Sets the videoDisabled property value. Specifies the reason video from this participant is disabled. Possible values are: watermarkProtection, unknownFutureValue.
     * @param value Value to set for the videoDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVideoDisabled(@javax.annotation.Nullable final OnlineMeetingVideoDisabledReason value) {
        this.videoDisabled = value;
    }
}
