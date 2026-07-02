package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CollaborationRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CollaborationRoot} and sets the default values.
     */
    public CollaborationRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CollaborationRoot}
     */
    @jakarta.annotation.Nonnull
    public static CollaborationRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CollaborationRoot();
    }
    /**
     * Gets the analyzedEmails property value. Contains metadata for analyzed emails.
     * @return a {@link java.util.List<AnalyzedEmail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnalyzedEmail> getAnalyzedEmails() {
        return this.backingStore.get("analyzedEmails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("analyzedEmails", (n) -> { this.setAnalyzedEmails(n.getCollectionOfObjectValues(AnalyzedEmail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("analyzedEmails", this.getAnalyzedEmails());
    }
    /**
     * Sets the analyzedEmails property value. Contains metadata for analyzed emails.
     * @param value Value to set for the analyzedEmails property.
     */
    public void setAnalyzedEmails(@jakarta.annotation.Nullable final java.util.List<AnalyzedEmail> value) {
        this.backingStore.set("analyzedEmails", value);
    }
}
