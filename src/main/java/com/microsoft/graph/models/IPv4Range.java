package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IPv4Range extends IpRange implements Parsable {
    /** Lower address. */
    private String _lowerAddress;
    /** Upper address. */
    private String _upperAddress;
    /**
     * Instantiates a new IPv4Range and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IPv4Range() {
        super();
        this.setOdataType("#microsoft.graph.iPv4Range");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IPv4Range
     */
    @javax.annotation.Nonnull
    public static IPv4Range createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IPv4Range();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IPv4Range currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lowerAddress", (n) -> { currentObject.setLowerAddress(n.getStringValue()); });
        deserializerMap.put("upperAddress", (n) -> { currentObject.setUpperAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lowerAddress property value. Lower address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLowerAddress() {
        return this._lowerAddress;
    }
    /**
     * Gets the upperAddress property value. Upper address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpperAddress() {
        return this._upperAddress;
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
        writer.writeStringValue("lowerAddress", this.getLowerAddress());
        writer.writeStringValue("upperAddress", this.getUpperAddress());
    }
    /**
     * Sets the lowerAddress property value. Lower address.
     * @param value Value to set for the lowerAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLowerAddress(@javax.annotation.Nullable final String value) {
        this._lowerAddress = value;
    }
    /**
     * Sets the upperAddress property value. Upper address.
     * @param value Value to set for the upperAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpperAddress(@javax.annotation.Nullable final String value) {
        this._upperAddress = value;
    }
}
