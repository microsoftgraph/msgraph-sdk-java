package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SoftwareOathAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /** The secret key of the method. Always returns null. */
    private String _secretKey;
    /**
     * Instantiates a new SoftwareOathAuthenticationMethod and sets the default values.
     * @return a void
     */
    public SoftwareOathAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.softwareOathAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SoftwareOathAuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static SoftwareOathAuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SoftwareOathAuthenticationMethod();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SoftwareOathAuthenticationMethod currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("secretKey", (n) -> { currentObject.setSecretKey(n.getStringValue()); });
        }};
    }
    /**
     * Gets the secretKey property value. The secret key of the method. Always returns null.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecretKey() {
        return this._secretKey;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("secretKey", this.getSecretKey());
    }
    /**
     * Sets the secretKey property value. The secret key of the method. Always returns null.
     * @param value Value to set for the secretKey property.
     * @return a void
     */
    public void setSecretKey(@javax.annotation.Nullable final String value) {
        this._secretKey = value;
    }
}
