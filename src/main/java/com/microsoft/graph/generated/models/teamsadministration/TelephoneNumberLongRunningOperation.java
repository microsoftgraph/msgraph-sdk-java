package com.microsoft.graph.models.teamsadministration;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.LongRunningOperationStatus;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TelephoneNumberLongRunningOperation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TelephoneNumberLongRunningOperation} and sets the default values.
     */
    public TelephoneNumberLongRunningOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TelephoneNumberLongRunningOperation}
     */
    @jakarta.annotation.Nonnull
    public static TelephoneNumberLongRunningOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TelephoneNumberLongRunningOperation();
    }
    /**
     * Gets the createdDateTime property value. Date and time when the asynchronous operation was created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getStringValue()); });
        deserializerMap.put("numbers", (n) -> { this.setNumbers(n.getCollectionOfObjectValues(TelephoneNumberLongRunningOperationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LongRunningOperationStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the numbers property value. Asynchronous operation details.
     * @return a {@link java.util.List<TelephoneNumberLongRunningOperationDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TelephoneNumberLongRunningOperationDetails> getNumbers() {
        return this.backingStore.get("numbers");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link LongRunningOperationStatus}
     */
    @jakarta.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("numbers", this.getNumbers());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. Date and time when the asynchronous operation was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the numbers property value. Asynchronous operation details.
     * @param value Value to set for the numbers property.
     */
    public void setNumbers(@jakarta.annotation.Nullable final java.util.List<TelephoneNumberLongRunningOperationDetails> value) {
        this.backingStore.set("numbers", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final LongRunningOperationStatus value) {
        this.backingStore.set("status", value);
    }
}
