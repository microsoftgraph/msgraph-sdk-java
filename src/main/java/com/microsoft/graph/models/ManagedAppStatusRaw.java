package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAppStatusRaw extends ManagedAppStatus implements Parsable {
    /** Status report content. */
    private Json _content;
    /**
     * Instantiates a new ManagedAppStatusRaw and sets the default values.
     * @return a void
     */
    public ManagedAppStatusRaw() {
        super();
        this.setOdataType("#microsoft.graph.managedAppStatusRaw");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedAppStatusRaw
     */
    @javax.annotation.Nonnull
    public static ManagedAppStatusRaw createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppStatusRaw();
    }
    /**
     * Gets the content property value. Status report content.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getContent() {
        return this._content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedAppStatusRaw currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("content", (n) -> { currentObject.setContent(n.getObjectValue(Json::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("content", this.getContent());
    }
    /**
     * Sets the content property value. Status report content.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final Json value) {
        this._content = value;
    }
}
