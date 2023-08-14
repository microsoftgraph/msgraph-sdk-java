package com.microsoft.graph.communications.calls.item.participants.item.startholdmusic;

import com.microsoft.graph.models.Prompt;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StartHoldMusicPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The clientContext property
     */
    private String clientContext;
    /**
     * The customPrompt property
     */
    private Prompt customPrompt;
    /**
     * Instantiates a new startHoldMusicPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public StartHoldMusicPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a startHoldMusicPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static StartHoldMusicPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StartHoldMusicPostRequestBody();
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
     * Gets the clientContext property value. The clientContext property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getClientContext() {
        return this.clientContext;
    }
    /**
     * Gets the customPrompt property value. The customPrompt property
     * @return a prompt
     */
    @jakarta.annotation.Nullable
    public Prompt getCustomPrompt() {
        return this.customPrompt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("clientContext", (n) -> { this.setClientContext(n.getStringValue()); });
        deserializerMap.put("customPrompt", (n) -> { this.setCustomPrompt(n.getObjectValue(Prompt::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientContext", this.getClientContext());
        writer.writeObjectValue("customPrompt", this.getCustomPrompt());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the clientContext property value. The clientContext property
     * @param value Value to set for the clientContext property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setClientContext(@jakarta.annotation.Nullable final String value) {
        this.clientContext = value;
    }
    /**
     * Sets the customPrompt property value. The customPrompt property
     * @param value Value to set for the customPrompt property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCustomPrompt(@jakarta.annotation.Nullable final Prompt value) {
        this.customPrompt = value;
    }
}
