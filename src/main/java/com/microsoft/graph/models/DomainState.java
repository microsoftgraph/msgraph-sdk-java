package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Timestamp for when the last activity occurred. The value is updated when an operation is scheduled, the asynchronous task starts, and when the operation completes.
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Type of asynchronous operation. The values can be ForceDelete or Verification
     */
    private String operation;
    /**
     * Current status of the operation.  Scheduled - Operation has been scheduled but has not started.  InProgress - Task has started and is in progress.  Failed - Operation has failed.
     */
    private String status;
    /**
     * Instantiates a new DomainState and sets the default values.
     */
    public DomainState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DomainState
     */
    @jakarta.annotation.Nonnull
    public static DomainState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainState();
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
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionDateTime property value. Timestamp for when the last activity occurred. The value is updated when an operation is scheduled, the asynchronous task starts, and when the operation completes.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
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
     * Gets the operation property value. Type of asynchronous operation. The values can be ForceDelete or Verification
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperation() {
        return this.operation;
    }
    /**
     * Gets the status property value. Current status of the operation.  Scheduled - Operation has been scheduled but has not started.  InProgress - Task has started and is in progress.  Failed - Operation has failed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operation", this.getOperation());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the lastActionDateTime property value. Timestamp for when the last activity occurred. The value is updated when an operation is scheduled, the asynchronous task starts, and when the operation completes.
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operation property value. Type of asynchronous operation. The values can be ForceDelete or Verification
     * @param value Value to set for the operation property.
     */
    public void setOperation(@jakarta.annotation.Nullable final String value) {
        this.operation = value;
    }
    /**
     * Sets the status property value. Current status of the operation.  Scheduled - Operation has been scheduled but has not started.  InProgress - Task has started and is in progress.  Failed - Operation has failed.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
