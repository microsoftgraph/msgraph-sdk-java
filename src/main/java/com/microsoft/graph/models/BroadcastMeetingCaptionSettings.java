package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BroadcastMeetingCaptionSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether captions are enabled for this Teams live event.
     */
    private Boolean isCaptionEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The spoken language.
     */
    private String spokenLanguage;
    /**
     * The translation languages (choose up to 6).
     */
    private java.util.List<String> translationLanguages;
    /**
     * Instantiates a new BroadcastMeetingCaptionSettings and sets the default values.
     */
    public BroadcastMeetingCaptionSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BroadcastMeetingCaptionSettings
     */
    @jakarta.annotation.Nonnull
    public static BroadcastMeetingCaptionSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BroadcastMeetingCaptionSettings();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isCaptionEnabled", (n) -> { this.setIsCaptionEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("spokenLanguage", (n) -> { this.setSpokenLanguage(n.getStringValue()); });
        deserializerMap.put("translationLanguages", (n) -> { this.setTranslationLanguages(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isCaptionEnabled property value. Indicates whether captions are enabled for this Teams live event.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCaptionEnabled() {
        return this.isCaptionEnabled;
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
     * Gets the spokenLanguage property value. The spoken language.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSpokenLanguage() {
        return this.spokenLanguage;
    }
    /**
     * Gets the translationLanguages property value. The translation languages (choose up to 6).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTranslationLanguages() {
        return this.translationLanguages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isCaptionEnabled", this.getIsCaptionEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("spokenLanguage", this.getSpokenLanguage());
        writer.writeCollectionOfPrimitiveValues("translationLanguages", this.getTranslationLanguages());
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
     * Sets the isCaptionEnabled property value. Indicates whether captions are enabled for this Teams live event.
     * @param value Value to set for the isCaptionEnabled property.
     */
    public void setIsCaptionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isCaptionEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the spokenLanguage property value. The spoken language.
     * @param value Value to set for the spokenLanguage property.
     */
    public void setSpokenLanguage(@jakarta.annotation.Nullable final String value) {
        this.spokenLanguage = value;
    }
    /**
     * Sets the translationLanguages property value. The translation languages (choose up to 6).
     * @param value Value to set for the translationLanguages property.
     */
    public void setTranslationLanguages(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.translationLanguages = value;
    }
}
