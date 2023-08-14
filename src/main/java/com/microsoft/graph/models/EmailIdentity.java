package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailIdentity extends Identity implements Parsable {
    /**
     * Email address of the user.
     */
    private String email;
    /**
     * Instantiates a new emailIdentity and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public EmailIdentity() {
        super();
        this.setOdataType("#microsoft.graph.emailIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a emailIdentity
     */
    @jakarta.annotation.Nonnull
    public static EmailIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailIdentity();
    }
    /**
     * Gets the email property value. Email address of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
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
        super.serialize(writer);
        writer.writeStringValue("email", this.getEmail());
    }
    /**
     * Sets the email property value. Email address of the user.
     * @param value Value to set for the email property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
}
