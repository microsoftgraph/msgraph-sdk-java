package com.microsoft.graph.communications.calls.item.answer;

import com.microsoft.graph.models.IncomingCallOptions;
import com.microsoft.graph.models.MediaConfig;
import com.microsoft.graph.models.Modality;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the answer method. */
public class AnswerPostRequestBody implements AdditionalDataHolder, Parsable {
    /** The acceptedModalities property */
    private java.util.List<Modality> _acceptedModalities;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The callbackUri property */
    private String _callbackUri;
    /** The callOptions property */
    private IncomingCallOptions _callOptions;
    /** The mediaConfig property */
    private MediaConfig _mediaConfig;
    /** The participantCapacity property */
    private Integer _participantCapacity;
    /**
     * Instantiates a new answerPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AnswerPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a answerPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AnswerPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnswerPostRequestBody();
    }
    /**
     * Gets the acceptedModalities property value. The acceptedModalities property
     * @return a modality
     */
    @javax.annotation.Nullable
    public java.util.List<Modality> getAcceptedModalities() {
        return this._acceptedModalities;
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
     * Gets the callbackUri property value. The callbackUri property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallbackUri() {
        return this._callbackUri;
    }
    /**
     * Gets the callOptions property value. The callOptions property
     * @return a incomingCallOptions
     */
    @javax.annotation.Nullable
    public IncomingCallOptions getCallOptions() {
        return this._callOptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AnswerPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("acceptedModalities", (n) -> { currentObject.setAcceptedModalities(n.getCollectionOfEnumValues(Modality.class)); });
        deserializerMap.put("callbackUri", (n) -> { currentObject.setCallbackUri(n.getStringValue()); });
        deserializerMap.put("callOptions", (n) -> { currentObject.setCallOptions(n.getObjectValue(IncomingCallOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaConfig", (n) -> { currentObject.setMediaConfig(n.getObjectValue(MediaConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("participantCapacity", (n) -> { currentObject.setParticipantCapacity(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the mediaConfig property value. The mediaConfig property
     * @return a mediaConfig
     */
    @javax.annotation.Nullable
    public MediaConfig getMediaConfig() {
        return this._mediaConfig;
    }
    /**
     * Gets the participantCapacity property value. The participantCapacity property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getParticipantCapacity() {
        return this._participantCapacity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("acceptedModalities", this.getAcceptedModalities());
        writer.writeStringValue("callbackUri", this.getCallbackUri());
        writer.writeObjectValue("callOptions", this.getCallOptions());
        writer.writeObjectValue("mediaConfig", this.getMediaConfig());
        writer.writeIntegerValue("participantCapacity", this.getParticipantCapacity());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptedModalities property value. The acceptedModalities property
     * @param value Value to set for the acceptedModalities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcceptedModalities(@javax.annotation.Nullable final java.util.List<Modality> value) {
        this._acceptedModalities = value;
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
     * Sets the callbackUri property value. The callbackUri property
     * @param value Value to set for the callbackUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallbackUri(@javax.annotation.Nullable final String value) {
        this._callbackUri = value;
    }
    /**
     * Sets the callOptions property value. The callOptions property
     * @param value Value to set for the callOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallOptions(@javax.annotation.Nullable final IncomingCallOptions value) {
        this._callOptions = value;
    }
    /**
     * Sets the mediaConfig property value. The mediaConfig property
     * @param value Value to set for the mediaConfig property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaConfig(@javax.annotation.Nullable final MediaConfig value) {
        this._mediaConfig = value;
    }
    /**
     * Sets the participantCapacity property value. The participantCapacity property
     * @param value Value to set for the participantCapacity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParticipantCapacity(@javax.annotation.Nullable final Integer value) {
        this._participantCapacity = value;
    }
}
