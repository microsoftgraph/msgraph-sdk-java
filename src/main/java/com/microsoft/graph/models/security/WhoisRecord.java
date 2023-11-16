package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WhoisRecord extends WhoisBaseRecord implements Parsable {
    /**
     * Instantiates a new WhoisRecord and sets the default values.
     */
    public WhoisRecord() {
        super();
        this.setOdataType("#microsoft.graph.security.whoisRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WhoisRecord
     */
    @jakarta.annotation.Nonnull
    public static WhoisRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WhoisRecord();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(WhoisHistoryRecord::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. The collection of historical records associated to this WHOIS object.
     * @return a java.util.List<WhoisHistoryRecord>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WhoisHistoryRecord> getHistory() {
        return this.BackingStore.get("history");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("history", this.getHistory());
    }
    /**
     * Sets the history property value. The collection of historical records associated to this WHOIS object.
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<WhoisHistoryRecord> value) {
        this.BackingStore.set("history", value);
    }
}
