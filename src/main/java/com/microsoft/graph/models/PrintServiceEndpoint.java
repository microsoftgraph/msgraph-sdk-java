package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintServiceEndpoint extends Entity implements Parsable {
    /**
     * A human-readable display name for the endpoint.
     */
    private String displayName;
    /**
     * The URI that can be used to access the service.
     */
    private String uri;
    /**
     * Instantiates a new printServiceEndpoint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintServiceEndpoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printServiceEndpoint
     */
    @javax.annotation.Nonnull
    public static PrintServiceEndpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintServiceEndpoint();
    }
    /**
     * Gets the displayName property value. A human-readable display name for the endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the uri property value. The URI that can be used to access the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUri() {
        return this.uri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("uri", this.getUri());
    }
    /**
     * Sets the displayName property value. A human-readable display name for the endpoint.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the uri property value. The URI that can be used to access the service.
     * @param value Value to set for the uri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUri(@javax.annotation.Nullable final String value) {
        this.uri = value;
    }
}
