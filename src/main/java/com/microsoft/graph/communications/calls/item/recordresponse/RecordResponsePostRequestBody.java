package com.microsoft.graph.communications.calls.item.recordresponse;

import com.microsoft.graph.models.Prompt;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RecordResponsePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The bargeInAllowed property
     */
    private Boolean bargeInAllowed;
    /**
     * The clientContext property
     */
    private String clientContext;
    /**
     * The initialSilenceTimeoutInSeconds property
     */
    private Integer initialSilenceTimeoutInSeconds;
    /**
     * The maxRecordDurationInSeconds property
     */
    private Integer maxRecordDurationInSeconds;
    /**
     * The maxSilenceTimeoutInSeconds property
     */
    private Integer maxSilenceTimeoutInSeconds;
    /**
     * The playBeep property
     */
    private Boolean playBeep;
    /**
     * The prompts property
     */
    private java.util.List<Prompt> prompts;
    /**
     * The stopTones property
     */
    private java.util.List<String> stopTones;
    /**
     * Instantiates a new recordResponsePostRequestBody and sets the default values.
     */
    public RecordResponsePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recordResponsePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static RecordResponsePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordResponsePostRequestBody();
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
     * Gets the bargeInAllowed property value. The bargeInAllowed property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBargeInAllowed() {
        return this.bargeInAllowed;
    }
    /**
     * Gets the clientContext property value. The clientContext property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getClientContext() {
        return this.clientContext;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("bargeInAllowed", (n) -> { this.setBargeInAllowed(n.getBooleanValue()); });
        deserializerMap.put("clientContext", (n) -> { this.setClientContext(n.getStringValue()); });
        deserializerMap.put("initialSilenceTimeoutInSeconds", (n) -> { this.setInitialSilenceTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("maxRecordDurationInSeconds", (n) -> { this.setMaxRecordDurationInSeconds(n.getIntegerValue()); });
        deserializerMap.put("maxSilenceTimeoutInSeconds", (n) -> { this.setMaxSilenceTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("playBeep", (n) -> { this.setPlayBeep(n.getBooleanValue()); });
        deserializerMap.put("prompts", (n) -> { this.setPrompts(n.getCollectionOfObjectValues(Prompt::createFromDiscriminatorValue)); });
        deserializerMap.put("stopTones", (n) -> { this.setStopTones(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the initialSilenceTimeoutInSeconds property value. The initialSilenceTimeoutInSeconds property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getInitialSilenceTimeoutInSeconds() {
        return this.initialSilenceTimeoutInSeconds;
    }
    /**
     * Gets the maxRecordDurationInSeconds property value. The maxRecordDurationInSeconds property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxRecordDurationInSeconds() {
        return this.maxRecordDurationInSeconds;
    }
    /**
     * Gets the maxSilenceTimeoutInSeconds property value. The maxSilenceTimeoutInSeconds property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxSilenceTimeoutInSeconds() {
        return this.maxSilenceTimeoutInSeconds;
    }
    /**
     * Gets the playBeep property value. The playBeep property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPlayBeep() {
        return this.playBeep;
    }
    /**
     * Gets the prompts property value. The prompts property
     * @return a prompt
     */
    @jakarta.annotation.Nullable
    public java.util.List<Prompt> getPrompts() {
        return this.prompts;
    }
    /**
     * Gets the stopTones property value. The stopTones property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStopTones() {
        return this.stopTones;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("bargeInAllowed", this.getBargeInAllowed());
        writer.writeStringValue("clientContext", this.getClientContext());
        writer.writeIntegerValue("initialSilenceTimeoutInSeconds", this.getInitialSilenceTimeoutInSeconds());
        writer.writeIntegerValue("maxRecordDurationInSeconds", this.getMaxRecordDurationInSeconds());
        writer.writeIntegerValue("maxSilenceTimeoutInSeconds", this.getMaxSilenceTimeoutInSeconds());
        writer.writeBooleanValue("playBeep", this.getPlayBeep());
        writer.writeCollectionOfObjectValues("prompts", this.getPrompts());
        writer.writeCollectionOfPrimitiveValues("stopTones", this.getStopTones());
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
     * Sets the bargeInAllowed property value. The bargeInAllowed property
     * @param value Value to set for the bargeInAllowed property.
     */
    public void setBargeInAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.bargeInAllowed = value;
    }
    /**
     * Sets the clientContext property value. The clientContext property
     * @param value Value to set for the clientContext property.
     */
    public void setClientContext(@jakarta.annotation.Nullable final String value) {
        this.clientContext = value;
    }
    /**
     * Sets the initialSilenceTimeoutInSeconds property value. The initialSilenceTimeoutInSeconds property
     * @param value Value to set for the initialSilenceTimeoutInSeconds property.
     */
    public void setInitialSilenceTimeoutInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.initialSilenceTimeoutInSeconds = value;
    }
    /**
     * Sets the maxRecordDurationInSeconds property value. The maxRecordDurationInSeconds property
     * @param value Value to set for the maxRecordDurationInSeconds property.
     */
    public void setMaxRecordDurationInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.maxRecordDurationInSeconds = value;
    }
    /**
     * Sets the maxSilenceTimeoutInSeconds property value. The maxSilenceTimeoutInSeconds property
     * @param value Value to set for the maxSilenceTimeoutInSeconds property.
     */
    public void setMaxSilenceTimeoutInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.maxSilenceTimeoutInSeconds = value;
    }
    /**
     * Sets the playBeep property value. The playBeep property
     * @param value Value to set for the playBeep property.
     */
    public void setPlayBeep(@jakarta.annotation.Nullable final Boolean value) {
        this.playBeep = value;
    }
    /**
     * Sets the prompts property value. The prompts property
     * @param value Value to set for the prompts property.
     */
    public void setPrompts(@jakarta.annotation.Nullable final java.util.List<Prompt> value) {
        this.prompts = value;
    }
    /**
     * Sets the stopTones property value. The stopTones property
     * @param value Value to set for the stopTones property.
     */
    public void setStopTones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.stopTones = value;
    }
}
