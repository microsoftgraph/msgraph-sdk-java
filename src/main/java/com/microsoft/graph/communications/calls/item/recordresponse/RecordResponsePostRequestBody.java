package microsoft.graph.communications.calls.item.recordresponse;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Prompt;
/** Provides operations to call the recordResponse method. */
public class RecordResponsePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The bargeInAllowed property */
    private Boolean _bargeInAllowed;
    /** The clientContext property */
    private String _clientContext;
    /** The initialSilenceTimeoutInSeconds property */
    private Integer _initialSilenceTimeoutInSeconds;
    /** The maxRecordDurationInSeconds property */
    private Integer _maxRecordDurationInSeconds;
    /** The maxSilenceTimeoutInSeconds property */
    private Integer _maxSilenceTimeoutInSeconds;
    /** The playBeep property */
    private Boolean _playBeep;
    /** The prompts property */
    private java.util.List<Prompt> _prompts;
    /** The stopTones property */
    private java.util.List<String> _stopTones;
    /**
     * Instantiates a new recordResponsePostRequestBody and sets the default values.
     * @return a void
     */
    public RecordResponsePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recordResponsePostRequestBody
     */
    @javax.annotation.Nonnull
    public static RecordResponsePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordResponsePostRequestBody();
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
     * Gets the bargeInAllowed property value. The bargeInAllowed property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBargeInAllowed() {
        return this._bargeInAllowed;
    }
    /**
     * Gets the clientContext property value. The clientContext property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientContext() {
        return this._clientContext;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RecordResponsePostRequestBody currentObject = this;
        return new HashMap<>(8) {{
            this.put("bargeInAllowed", (n) -> { currentObject.setBargeInAllowed(n.getBooleanValue()); });
            this.put("clientContext", (n) -> { currentObject.setClientContext(n.getStringValue()); });
            this.put("initialSilenceTimeoutInSeconds", (n) -> { currentObject.setInitialSilenceTimeoutInSeconds(n.getIntegerValue()); });
            this.put("maxRecordDurationInSeconds", (n) -> { currentObject.setMaxRecordDurationInSeconds(n.getIntegerValue()); });
            this.put("maxSilenceTimeoutInSeconds", (n) -> { currentObject.setMaxSilenceTimeoutInSeconds(n.getIntegerValue()); });
            this.put("playBeep", (n) -> { currentObject.setPlayBeep(n.getBooleanValue()); });
            this.put("prompts", (n) -> { currentObject.setPrompts(n.getCollectionOfObjectValues(Prompt::createFromDiscriminatorValue)); });
            this.put("stopTones", (n) -> { currentObject.setStopTones(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the initialSilenceTimeoutInSeconds property value. The initialSilenceTimeoutInSeconds property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInitialSilenceTimeoutInSeconds() {
        return this._initialSilenceTimeoutInSeconds;
    }
    /**
     * Gets the maxRecordDurationInSeconds property value. The maxRecordDurationInSeconds property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxRecordDurationInSeconds() {
        return this._maxRecordDurationInSeconds;
    }
    /**
     * Gets the maxSilenceTimeoutInSeconds property value. The maxSilenceTimeoutInSeconds property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxSilenceTimeoutInSeconds() {
        return this._maxSilenceTimeoutInSeconds;
    }
    /**
     * Gets the playBeep property value. The playBeep property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPlayBeep() {
        return this._playBeep;
    }
    /**
     * Gets the prompts property value. The prompts property
     * @return a prompt
     */
    @javax.annotation.Nullable
    public java.util.List<Prompt> getPrompts() {
        return this._prompts;
    }
    /**
     * Gets the stopTones property value. The stopTones property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getStopTones() {
        return this._stopTones;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the bargeInAllowed property value. The bargeInAllowed property
     * @param value Value to set for the bargeInAllowed property.
     * @return a void
     */
    public void setBargeInAllowed(@javax.annotation.Nullable final Boolean value) {
        this._bargeInAllowed = value;
    }
    /**
     * Sets the clientContext property value. The clientContext property
     * @param value Value to set for the clientContext property.
     * @return a void
     */
    public void setClientContext(@javax.annotation.Nullable final String value) {
        this._clientContext = value;
    }
    /**
     * Sets the initialSilenceTimeoutInSeconds property value. The initialSilenceTimeoutInSeconds property
     * @param value Value to set for the initialSilenceTimeoutInSeconds property.
     * @return a void
     */
    public void setInitialSilenceTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this._initialSilenceTimeoutInSeconds = value;
    }
    /**
     * Sets the maxRecordDurationInSeconds property value. The maxRecordDurationInSeconds property
     * @param value Value to set for the maxRecordDurationInSeconds property.
     * @return a void
     */
    public void setMaxRecordDurationInSeconds(@javax.annotation.Nullable final Integer value) {
        this._maxRecordDurationInSeconds = value;
    }
    /**
     * Sets the maxSilenceTimeoutInSeconds property value. The maxSilenceTimeoutInSeconds property
     * @param value Value to set for the maxSilenceTimeoutInSeconds property.
     * @return a void
     */
    public void setMaxSilenceTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this._maxSilenceTimeoutInSeconds = value;
    }
    /**
     * Sets the playBeep property value. The playBeep property
     * @param value Value to set for the playBeep property.
     * @return a void
     */
    public void setPlayBeep(@javax.annotation.Nullable final Boolean value) {
        this._playBeep = value;
    }
    /**
     * Sets the prompts property value. The prompts property
     * @param value Value to set for the prompts property.
     * @return a void
     */
    public void setPrompts(@javax.annotation.Nullable final java.util.List<Prompt> value) {
        this._prompts = value;
    }
    /**
     * Sets the stopTones property value. The stopTones property
     * @param value Value to set for the stopTones property.
     * @return a void
     */
    public void setStopTones(@javax.annotation.Nullable final java.util.List<String> value) {
        this._stopTones = value;
    }
}
