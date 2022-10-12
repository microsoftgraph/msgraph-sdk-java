package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResponseStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The response property */
    private ResponseType _response;
    /** The date and time that the response was returned. It uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _time;
    /**
     * Instantiates a new responseStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResponseStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a responseStatus
     */
    @javax.annotation.Nonnull
    public static ResponseStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResponseStatus();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ResponseStatus currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("response", (n) -> { currentObject.setResponse(n.getEnumValue(ResponseType.class)); });
            this.put("time", (n) -> { currentObject.setTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the response property value. The response property
     * @return a responseType
     */
    @javax.annotation.Nullable
    public ResponseType getResponse() {
        return this._response;
    }
    /**
     * Gets the time property value. The date and time that the response was returned. It uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTime() {
        return this._time;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("response", this.getResponse());
        writer.writeOffsetDateTimeValue("time", this.getTime());
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
     * Sets the response property value. The response property
     * @param value Value to set for the response property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponse(@javax.annotation.Nullable final ResponseType value) {
        this._response = value;
    }
    /**
     * Sets the time property value. The date and time that the response was returned. It uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the time property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._time = value;
    }
}
