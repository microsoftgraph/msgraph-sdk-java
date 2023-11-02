package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppScope extends Entity implements Parsable {
    /**
     * Instantiates a new AppScope and sets the default values.
     */
    public AppScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppScope
     */
    @jakarta.annotation.Nonnull
    public static AppScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppScope();
    }
    /**
     * Gets the displayName property value. Provides the display name of the app-specific resource represented by the app scope. Provided for display purposes since appScopeId is often an immutable, non-human-readable id. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.getBackingStore().get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the type property value. Describes the type of app-specific resource represented by the app scope and is provided for display purposes, so a user interface can convey to the user the kind of app specific resource represented by the app scope. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.getBackingStore().get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the displayName property value. Provides the display name of the app-specific resource represented by the app scope. Provided for display purposes since appScopeId is often an immutable, non-human-readable id. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("displayName", value);
    }
    /**
     * Sets the type property value. Describes the type of app-specific resource represented by the app scope and is provided for display purposes, so a user interface can convey to the user the kind of app specific resource represented by the app scope. Read-only.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("type", value);
    }
}
