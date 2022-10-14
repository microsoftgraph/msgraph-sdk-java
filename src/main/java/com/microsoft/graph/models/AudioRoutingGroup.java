package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class AudioRoutingGroup extends Entity implements Parsable {
    /** The receivers property */
    private java.util.List<String> _receivers;
    /** The routingMode property */
    private RoutingMode _routingMode;
    /** The sources property */
    private java.util.List<String> _sources;
    /**
     * Instantiates a new audioRoutingGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AudioRoutingGroup() {
        super();
        this.setOdataType("#microsoft.graph.audioRoutingGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a audioRoutingGroup
     */
    @javax.annotation.Nonnull
    public static AudioRoutingGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AudioRoutingGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AudioRoutingGroup currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("receivers", (n) -> { currentObject.setReceivers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("routingMode", (n) -> { currentObject.setRoutingMode(n.getEnumValue(RoutingMode.class)); });
            this.put("sources", (n) -> { currentObject.setSources(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the receivers property value. The receivers property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReceivers() {
        return this._receivers;
    }
    /**
     * Gets the routingMode property value. The routingMode property
     * @return a routingMode
     */
    @javax.annotation.Nullable
    public RoutingMode getRoutingMode() {
        return this._routingMode;
    }
    /**
     * Gets the sources property value. The sources property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSources() {
        return this._sources;
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
        writer.writeCollectionOfPrimitiveValues("receivers", this.getReceivers());
        writer.writeEnumValue("routingMode", this.getRoutingMode());
        writer.writeCollectionOfPrimitiveValues("sources", this.getSources());
    }
    /**
     * Sets the receivers property value. The receivers property
     * @param value Value to set for the receivers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._receivers = value;
    }
    /**
     * Sets the routingMode property value. The routingMode property
     * @param value Value to set for the routingMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoutingMode(@javax.annotation.Nullable final RoutingMode value) {
        this._routingMode = value;
    }
    /**
     * Sets the sources property value. The sources property
     * @param value Value to set for the sources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSources(@javax.annotation.Nullable final java.util.List<String> value) {
        this._sources = value;
    }
}
