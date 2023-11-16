package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddressBookAccountTargetContent extends AccountTargetContent implements Parsable {
    /**
     * Instantiates a new AddressBookAccountTargetContent and sets the default values.
     */
    public AddressBookAccountTargetContent() {
        super();
        this.setOdataType("#microsoft.graph.addressBookAccountTargetContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AddressBookAccountTargetContent
     */
    @jakarta.annotation.Nonnull
    public static AddressBookAccountTargetContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddressBookAccountTargetContent();
    }
    /**
     * Gets the accountTargetEmails property value. List of user emails targeted for an attack simulation training campaign.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAccountTargetEmails() {
        return this.BackingStore.get("accountTargetEmails");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountTargetEmails", (n) -> { this.setAccountTargetEmails(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("accountTargetEmails", this.getAccountTargetEmails());
    }
    /**
     * Sets the accountTargetEmails property value. List of user emails targeted for an attack simulation training campaign.
     * @param value Value to set for the accountTargetEmails property.
     */
    public void setAccountTargetEmails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("accountTargetEmails", value);
    }
}
