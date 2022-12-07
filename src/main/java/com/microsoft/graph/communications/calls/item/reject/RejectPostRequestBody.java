package com.microsoft.graph.communications.calls.item.reject;

import com.microsoft.graph.models.RejectReason;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the reject method. */
public class RejectPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The callbackUri property */
    private String _callbackUri;
    /** The reason property */
    private RejectReason _reason;
    /**
     * Instantiates a new rejectPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RejectPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rejectPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RejectPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RejectPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("callbackUri", (n) -> { this.setCallbackUri(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getEnumValue(RejectReason.class)); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The reason property
     * @return a rejectReason
     */
    @javax.annotation.Nullable
    public RejectReason getReason() {
        return this._reason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("callbackUri", this.getCallbackUri());
        writer.writeEnumValue("reason", this.getReason());
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
     * Sets the callbackUri property value. The callbackUri property
     * @param value Value to set for the callbackUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallbackUri(@javax.annotation.Nullable final String value) {
        this._callbackUri = value;
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReason(@javax.annotation.Nullable final RejectReason value) {
        this._reason = value;
    }
}
