package com.microsoft.graph.models.odataerrors;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InnerError implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Client request Id as sent by the client application. */
    private String clientRequestId;
    /** Date when the error occured. */
    private OffsetDateTime date;
    /** The OdataType property */
    private String odataType;
    /** Request Id as tracked internally by the service */
    private String requestId;
    /**
     * Instantiates a new InnerError and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InnerError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InnerError
     */
    @javax.annotation.Nonnull
    public static InnerError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InnerError();
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
     * Gets the client-request-id property value. Client request Id as sent by the client application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientRequestId() {
        return this.clientRequestId;
    }
    /**
     * Gets the date property value. Date when the error occured.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDate() {
        return this.date;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("client-request-id", (n) -> { this.setClientRequestId(n.getStringValue()); });
        deserializerMap.put("Date", (n) -> { this.setDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("request-id", (n) -> { this.setRequestId(n.getStringValue()); });
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
     * Gets the request-id property value. Request Id as tracked internally by the service
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestId() {
        return this.requestId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("client-request-id", this.getClientRequestId());
        writer.writeOffsetDateTimeValue("Date", this.getDate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("request-id", this.getRequestId());
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
     * Sets the client-request-id property value. Client request Id as sent by the client application.
     * @param value Value to set for the clientRequestId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientRequestId(@javax.annotation.Nullable final String value) {
        this.clientRequestId = value;
    }
    /**
     * Sets the date property value. Date when the error occured.
     * @param value Value to set for the Date property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this.date = value;
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
     * Sets the request-id property value. Request Id as tracked internally by the service
     * @param value Value to set for the requestId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestId(@javax.annotation.Nullable final String value) {
        this.requestId = value;
    }
}
