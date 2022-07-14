package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PasswordAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** For security, the password is always returned as null from a LIST or GET operation. */
    private String _password;
    /**
     * Instantiates a new PasswordAuthenticationMethod and sets the default values.
     * @return a void
     */
    public PasswordAuthenticationMethod() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PasswordAuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static PasswordAuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordAuthenticationMethod();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PasswordAuthenticationMethod currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("password", (n) -> { currentObject.setPassword(n.getStringValue()); });
        }};
    }
    /**
     * Gets the password property value. For security, the password is always returned as null from a LIST or GET operation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this._password;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("password", this.getPassword());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the password property value. For security, the password is always returned as null from a LIST or GET operation.
     * @param value Value to set for the password property.
     * @return a void
     */
    public void setPassword(@javax.annotation.Nullable final String value) {
        this._password = value;
    }
}
