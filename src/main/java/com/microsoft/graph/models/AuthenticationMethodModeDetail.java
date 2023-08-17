package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationMethodModeDetail extends Entity implements Parsable {
    /**
     * The authenticationMethod property
     */
    private BaseAuthenticationMethod authenticationMethod;
    /**
     * The display name of this mode
     */
    private String displayName;
    /**
     * Instantiates a new authenticationMethodModeDetail and sets the default values.
     */
    public AuthenticationMethodModeDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodModeDetail
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationMethodModeDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodModeDetail();
    }
    /**
     * Gets the authenticationMethod property value. The authenticationMethod property
     * @return a baseAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public BaseAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Gets the displayName property value. The display name of this mode
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(BaseAuthenticationMethod.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the authenticationMethod property value. The authenticationMethod property
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final BaseAuthenticationMethod value) {
        this.authenticationMethod = value;
    }
    /**
     * Sets the displayName property value. The display name of this mode
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
}
