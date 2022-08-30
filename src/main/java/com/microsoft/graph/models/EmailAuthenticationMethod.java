package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /** The email address registered to this user. */
    private String _emailAddress;
    /**
     * Instantiates a new EmailAuthenticationMethod and sets the default values.
     * @return a void
     */
    public EmailAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.emailAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailAuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static EmailAuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailAuthenticationMethod();
    }
    /**
     * Gets the emailAddress property value. The email address registered to this user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EmailAuthenticationMethod currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("emailAddress", this.getEmailAddress());
    }
    /**
     * Sets the emailAddress property value. The email address registered to this user.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
}
