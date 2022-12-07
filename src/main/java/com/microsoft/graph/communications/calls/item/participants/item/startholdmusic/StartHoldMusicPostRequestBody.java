package com.microsoft.graph.communications.calls.item.participants.item.startholdmusic;

import com.microsoft.graph.models.Prompt;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the startHoldMusic method. */
public class StartHoldMusicPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The clientContext property */
    private String _clientContext;
    /** The customPrompt property */
    private Prompt _customPrompt;
    /**
     * Instantiates a new startHoldMusicPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public StartHoldMusicPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a startHoldMusicPostRequestBody
     */
    @javax.annotation.Nonnull
    public static StartHoldMusicPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StartHoldMusicPostRequestBody();
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
     * Gets the clientContext property value. The clientContext property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientContext() {
        return this._clientContext;
    }
    /**
     * Gets the customPrompt property value. The customPrompt property
     * @return a prompt
     */
    @javax.annotation.Nullable
    public Prompt getCustomPrompt() {
        return this._customPrompt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("clientContext", (n) -> { this.setClientContext(n.getStringValue()); });
        deserializerMap.put("customPrompt", (n) -> { this.setCustomPrompt(n.getObjectValue(Prompt::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientContext", this.getClientContext());
        writer.writeObjectValue("customPrompt", this.getCustomPrompt());
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
     * Sets the clientContext property value. The clientContext property
     * @param value Value to set for the clientContext property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientContext(@javax.annotation.Nullable final String value) {
        this._clientContext = value;
    }
    /**
     * Sets the customPrompt property value. The customPrompt property
     * @param value Value to set for the customPrompt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomPrompt(@javax.annotation.Nullable final Prompt value) {
        this._customPrompt = value;
    }
}
