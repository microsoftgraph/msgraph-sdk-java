package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BasicAuthentication extends ApiAuthenticationConfigurationBase implements Parsable {
    /** The password. It is not returned in the responses. */
    private String _password;
    /** The username. */
    private String _username;
    /**
     * Instantiates a new BasicAuthentication and sets the default values.
     * @return a void
     */
    public BasicAuthentication() {
        super();
        this.setOdataType("#microsoft.graph.basicAuthentication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BasicAuthentication
     */
    @javax.annotation.Nonnull
    public static BasicAuthentication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BasicAuthentication();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BasicAuthentication currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("password", (n) -> { currentObject.setPassword(n.getStringValue()); });
            this.put("username", (n) -> { currentObject.setUsername(n.getStringValue()); });
        }};
    }
    /**
     * Gets the password property value. The password. It is not returned in the responses.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this._password;
    }
    /**
     * Gets the username property value. The username.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsername() {
        return this._username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("username", this.getUsername());
    }
    /**
     * Sets the password property value. The password. It is not returned in the responses.
     * @param value Value to set for the password property.
     * @return a void
     */
    public void setPassword(@javax.annotation.Nullable final String value) {
        this._password = value;
    }
    /**
     * Sets the username property value. The username.
     * @param value Value to set for the username property.
     * @return a void
     */
    public void setUsername(@javax.annotation.Nullable final String value) {
        this._username = value;
    }
}
